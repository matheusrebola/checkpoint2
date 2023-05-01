package br.com.fiap.checkpoint2.controller;

import br.com.fiap.checkpoint2.controller.dto.pedidoDto.PedidoRequestUpdate;
import br.com.fiap.checkpoint2.controller.dto.pedidoDto.PedidoResquestCreate;
import br.com.fiap.checkpoint2.controller.dto.pedidoDto.SearchPedido;
import br.com.fiap.checkpoint2.model.Pedido;
import br.com.fiap.checkpoint2.repository.PedidoRepository;
import br.com.fiap.checkpoint2.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;
    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping
    public ResponseEntity<List<SearchPedido>> listAll() {
        List<SearchPedido> result = pedidoService.list().stream().map(SearchPedido::toDto).collect(Collectors.toList());
        return ResponseEntity.ok(result);
    }

    @PostMapping
    public ResponseEntity<Pedido> create(@RequestBody PedidoResquestCreate dto) {
        Pedido pedido = new Pedido();
        pedido.setCod_cliente(dto.getCod_cliente());
        pedido.setData_pedido(dto.getData_pedido());
        Pedido result = pedidoService.save(pedido);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @PutMapping
    public ResponseEntity<Pedido> update(@RequestBody PedidoRequestUpdate dto) {
        boolean exists = pedidoRepository.existsById(dto.getNum_pedido());

        if (!exists) {
            return ResponseEntity.notFound().build();
        }
        Pedido pedido = new Pedido();
        pedido.setNum_pedido(dto.getNum_pedido());
        pedido.setCod_cliente(dto.getCod_cliente());
        pedido.setData_pedido(dto.getData_pedido());

        Pedido result = pedidoService.save(pedido);

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(result);
    }

    @DeleteMapping(value = "{num_pedido}")
    public ResponseEntity<String> delete(@PathVariable Long num_pedido) {
        boolean exists = pedidoRepository.existsById(num_pedido);

        if (!exists) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("código do pedido " + num_pedido + " não encontrado!");
        }
        pedidoRepository.deleteById(num_pedido);
        return ResponseEntity.accepted().build();
    }

}
