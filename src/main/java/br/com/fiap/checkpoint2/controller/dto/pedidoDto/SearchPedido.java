package br.com.fiap.checkpoint2.controller.dto.pedidoDto;

import br.com.fiap.checkpoint2.model.Pedido;

import java.time.LocalDateTime;

public class SearchPedido {
    private Long num_pedido;
    private long cod_cliente;
    private LocalDateTime data_pedido;

    public Long getNum_pedido() {
        return num_pedido;
    }

    public void setNum_pedido(Long num_pedido) {
        this.num_pedido = num_pedido;
    }

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

    public static SearchPedido toDto(Pedido pedido) {
        SearchPedido dto = new SearchPedido();
        dto.setNum_pedido(pedido.getNum_pedido());
        dto.setCod_cliente(pedido.getCod_cliente());
        dto.setData_pedido(pedido.getData_pedido());
        return dto;
    }
}
