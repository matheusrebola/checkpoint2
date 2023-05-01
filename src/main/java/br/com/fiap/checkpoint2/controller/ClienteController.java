package br.com.fiap.checkpoint2.controller;

import br.com.fiap.checkpoint2.controller.dto.clienteDto.ClienteRequestUpdate;
import br.com.fiap.checkpoint2.controller.dto.clienteDto.ClienteResquestCreate;
import br.com.fiap.checkpoint2.controller.dto.clienteDto.SearchCliente;
import br.com.fiap.checkpoint2.model.Cliente;
import br.com.fiap.checkpoint2.repository.ClienteRepository;
import br.com.fiap.checkpoint2.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<SearchCliente>> listAll() {
        List<SearchCliente> result = clienteService.list().stream().map(SearchCliente::toDto).collect(Collectors.toList());
        return ResponseEntity.ok(result);
    }

    @PostMapping
    public ResponseEntity<Cliente> create(@RequestBody ClienteResquestCreate dto) {
        Cliente cliente = new Cliente();
        cliente.setNome(dto.getNome());
        cliente.setCep(dto.getCep());
        cliente.setInscricao_federal(dto.getInscricao_federal());

        Cliente result = clienteService.save(cliente);

        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @PutMapping
    public ResponseEntity<Cliente> update(@RequestBody ClienteRequestUpdate dto) {
        boolean exists = clienteRepository.existsById(dto.getCod_cliente());

        if (!exists) {
            return ResponseEntity.notFound().build();
        }
        Cliente cliente = new Cliente();
        cliente.setCod_cliente(dto.getCod_cliente());
        cliente.setNome(dto.getNome());
        cliente.setCep(dto.getCep());
        cliente.setInscricao_federal(dto.getInscricao_federal());

        Cliente result = clienteService.save(cliente);

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(result);
    }

    @DeleteMapping(value = "{cod_cliente}")
    public ResponseEntity<String> delete(@PathVariable Long cod_cliente) {
        boolean exists = clienteRepository.existsById(cod_cliente);

        if (!exists) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("código do cliente " + cod_cliente + " não encontrado!");
        }
        clienteRepository.deleteById(cod_cliente);
        return ResponseEntity.accepted().build();
    }
}
