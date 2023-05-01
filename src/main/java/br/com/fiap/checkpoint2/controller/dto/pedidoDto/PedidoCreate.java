package br.com.fiap.checkpoint2.controller.dto.pedidoDto;

import java.time.LocalDateTime;

public class PedidoCreate {

    private long cod_cliente;
    private LocalDateTime data_pedido;

    public long getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(long cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public LocalDateTime getData_pedido() {
        return data_pedido;
    }

    public void setData_pedido(LocalDateTime data_pedido) {
        this.data_pedido = data_pedido;
    }
}
