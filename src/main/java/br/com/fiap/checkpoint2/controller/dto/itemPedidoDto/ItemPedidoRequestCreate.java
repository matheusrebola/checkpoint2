package br.com.fiap.checkpoint2.controller.dto.itemPedidoDto;

import java.math.BigDecimal;

public class ItemPedidoRequestCreate {
    private long num_pedido;
    private long cod_pedido;
    private double quantidade;
    private BigDecimal valor_total;

    public long getNum_pedido() {
        return num_pedido;
    }

    public void setNum_pedido(long num_pedido) {
        this.num_pedido = num_pedido;
    }

    public long getCod_pedido() {
        return cod_pedido;
    }

    public void setCod_pedido(long cod_pedido) {
        this.cod_pedido = cod_pedido;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValor_total() {
        return valor_total;
    }

    public void setValor_total(BigDecimal valor_total) {
        this.valor_total = valor_total;
    }
}
