package br.com.fiap.checkpoint2.model;

import javax.persistence.*;

public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long sequencia;
    @Column(name = "numero_pedido")
    private long num_pedido;

    @Column(name = "codigo_produto")
    private long  cod_produto;
    @Column(name = "quantidade")
    private double quantidade;
    @Column(name = "valor_total")
    private double valorTotal;

    public Long getSequencia() {
        return sequencia;
    }

    public void setSequencia(Long sequencia) {
        this.sequencia = sequencia;
    }

    public long getNum_pedido() {
        return num_pedido;
    }

    public void setNum_pedido(long num_pedido) {
        this.num_pedido = num_pedido;
    }

    public long getCod_produto() {
        return cod_produto;
    }

    public void setCod_produto(long cod_produto) {
        this.cod_produto = cod_produto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}



