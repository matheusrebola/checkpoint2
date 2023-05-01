package br.com.fiap.checkpoint2.controller.dto.produtoDto;

import br.com.fiap.checkpoint2.controller.dto.pedidoDto.SearchPedido;
import br.com.fiap.checkpoint2.model.Pedido;
import br.com.fiap.checkpoint2.model.Produto;

import java.time.LocalDate;

public class SearchProduto {
    private Long codigoProduto;
    private String nome;
    private double preco;
    private LocalDate dataValidade;
    private LocalDate dataGarantia;
    private boolean emEstoque;

    public Long getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(Long codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public LocalDate getDataGarantia() {
        return dataGarantia;
    }

    public void setDataGarantia(LocalDate dataGarantia) {
        this.dataGarantia = dataGarantia;
    }

    public boolean isEmEstoque() {
        return emEstoque;
    }

    public void setEmEstoque(boolean emEstoque) {
        this.emEstoque = emEstoque;
    }

    public static SearchProduto toDto(Produto produto) {
        SearchProduto dto = new SearchProduto();
        dto.setCodigoProduto(produto.getCodigoProduto());
        dto.setNome(produto.getNome());
        dto.setPreco(produto.getPreco());
        dto.setDataValidade(produto.getDataValidade());
        dto.setDataGarantia(produto.getDataGarantia());
        dto.setEmEstoque(produto.isEmEstoque());
        return dto;
    }
}
