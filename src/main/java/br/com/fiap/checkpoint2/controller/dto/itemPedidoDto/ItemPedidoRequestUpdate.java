package br.com.fiap.checkpoint2.controller.dto.itemPedidoDto;

public class ItemPedidoRequestUpdate {
    private long sequencia;
    private long num_pedido;
    private long cod_pedido;
    private double quantidade;
    private double valor_total;

    public long getSequencia() {
        return sequencia;
    }

    public void setSequencia(long sequencia) {
        this.sequencia = sequencia;
    }

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

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }
}
