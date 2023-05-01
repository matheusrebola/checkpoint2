package br.com.fiap.checkpoint2.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long num_pedido;
    @Column(name="cod_cliente")
    private long cod_cliente;
    @Column(name="data_pedido")
    private LocalDateTime data_pedido;

    public long getNum_pedido() {
        return num_pedido;
    }

    public void setNum_pedido(long num_pedido) {
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
}
