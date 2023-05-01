package br.com.fiap.checkpoint2.controller;

import br.com.fiap.checkpoint2.controller.dto.produtoDto.ProdutoRequestCreate;
import br.com.fiap.checkpoint2.controller.dto.produtoDto.ProdutoRequestUpdate;
import br.com.fiap.checkpoint2.controller.dto.produtoDto.SearchProduto;
import br.com.fiap.checkpoint2.model.Produto;
import br.com.fiap.checkpoint2.repository.ProdutoRepository;
import br.com.fiap.checkpoint2.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public ResponseEntity<List<SearchProduto>> listAll() {
        List<SearchProduto> result = produtoService.list().stream().map(SearchProduto::toDto).collect(Collectors.toList());
        return ResponseEntity.ok(result);
    }

    @PostMapping
    public ResponseEntity<Produto> create(@RequestBody ProdutoRequestCreate dto) {
        Produto produto = new Produto();
        produto.setCodigoProduto(produto.getCodigoProduto());
        produto.setNome(produto.getNome());
        produto.setPreco(produto.getPreco());
        produto.setDataValidade(produto.getDataValidade());
        produto.setDataGarantia(produto.getDataGarantia());
        produto.setEmEstoque(produto.isEmEstoque());

        Produto result = produtoService.save(produto);

        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @PutMapping
    public ResponseEntity<Produto> update(@RequestBody ProdutoRequestUpdate dto) {
        boolean exists = produtoRepository.existsById(dto.getCodigoProduto());

        if (!exists) {
            return ResponseEntity.notFound().build();
        }
        Produto produto = new Produto();
        produto.setCodigoProduto(produto.getCodigoProduto());
        produto.setNome(produto.getNome());
        produto.setPreco(produto.getPreco());
        produto.setDataValidade(produto.getDataValidade());
        produto.setDataGarantia(produto.getDataGarantia());
        produto.setEmEstoque(produto.isEmEstoque());

        Produto result = produtoService.save(produto);

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(result);
    }

    @DeleteMapping(value = "{codigoProduto}")
    public ResponseEntity<String> delete(@PathVariable Long codigoProduto) {
        boolean exists = produtoRepository.existsById(codigoProduto);

        if (!exists) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("código do cliente " + codigoProduto + " não encontrado!");
        }
        produtoRepository.deleteById(codigoProduto);
        return ResponseEntity.accepted().build();
    }
}
