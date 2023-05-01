package br.com.fiap.checkpoint2.controller.dto.clienteDto;

import br.com.fiap.checkpoint2.model.Cliente;

public class SearchCliente {
    private Long cod_cliente;
    private String nome;

    public Long getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(Long cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static SearchCliente toDto(Cliente cliente){
        SearchCliente dto = new SearchCliente();
        dto.setCod_cliente(cliente.getCod_cliente());
        dto.setNome(cliente.getNome());
        return dto;
    }
}
