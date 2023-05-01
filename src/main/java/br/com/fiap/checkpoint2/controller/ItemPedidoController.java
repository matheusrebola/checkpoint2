//package br.com.fiap.checkpoint2.controller;
//
//import br.com.fiap.checkpoint2.controller.dto.clienteDto.ClienteResquestCreate;
//import br.com.fiap.checkpoint2.controller.dto.itemPedidoDto.ItemPedidoRequestUpdate;
//import br.com.fiap.checkpoint2.controller.dto.itemPedidoDto.SearchItemPedido;
//import br.com.fiap.checkpoint2.model.ItemPedido;
//import br.com.fiap.checkpoint2.repository.ItemPedidoRepository;
//import br.com.fiap.checkpoint2.service.ItemPedidoService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.math.BigDecimal;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@RestController
//@RequestMapping("/itempedido")
//public class ItemPedidoController {
//    @Autowired
//    private ItemPedidoRepository itemPedidoRepository;
//    @Autowired
//    private ItemPedidoService itemPedidoService;
//
//    @GetMapping
//    public ResponseEntity<List<SearchItemPedido>> listAll() {
//        List<SearchItemPedido> result = itemPedidoService.list().stream().map(SearchItemPedido::toDto).collect(Collectors.toList());
//        return ResponseEntity.ok(result);
//    }
//
//    @PostMapping
//    public ResponseEntity<ItemPedido> create(@RequestBody ClienteResquestCreate dto) {
//        ItemPedido itemPedido = new ItemPedido();
//
//        itemPedido.setSequencia(itemPedido.getSequencia());
//        itemPedido.setNum_pedido(itemPedido.getNum_pedido());
//        itemPedido.setCod_produto(itemPedido.getCod_produto());
//        itemPedido.setQuantidade(itemPedido.getQuantidade());
//        itemPedido.setValorTotal(itemPedido.getValorTotal());
//
//        ItemPedido result = itemPedidoService.save(itemPedido);
//
//        return ResponseEntity.status(HttpStatus.CREATED).body(result);
//    }
//
//    @PutMapping
//    public ResponseEntity<ItemPedido> update(@RequestBody ItemPedidoRequestUpdate dto) {
//        boolean exists = itemPedidoRepository.existsById(dto.getSequencia());
//
//        if (!exists) {
//            return ResponseEntity.notFound().build();
//        }
//        ItemPedido itemPedido = new ItemPedido();
//
//        itemPedido.setSequencia(itemPedido.getSequencia());
//        itemPedido.setNum_pedido(itemPedido.getNum_pedido());
//        itemPedido.setCod_produto(itemPedido.getCod_produto());
//        itemPedido.setQuantidade(itemPedido.getQuantidade());
//        itemPedido.setValorTotal(itemPedido.getValorTotal());
//
//        ItemPedido result = itemPedidoService.save(itemPedido);
//
//        return ResponseEntity.status(HttpStatus.ACCEPTED).body(result);
//    }
//
//    @DeleteMapping(value = "{sequencia}")
//    public ResponseEntity<String> delete(@PathVariable Long sequencia) {
//        boolean exists = itemPedidoRepository.existsById(sequencia);
//
//        if (!exists) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("código do cliente " + sequencia + " não encontrado!");
//        }
//        itemPedidoRepository.deleteById(sequencia);
//        return ResponseEntity.accepted().build();
//    }
//}
