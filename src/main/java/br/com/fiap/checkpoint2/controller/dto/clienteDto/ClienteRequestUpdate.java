package br.com.fiap.checkpoint2.controller.dto.clienteDto;

public class ClienteRequestUpdate {
    private Long cod_cliente;
    private String nome;
    private String cep;
    private String inscricao_federal;

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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getInscricao_federal() {
        return inscricao_federal;
    }

    public void setInscricao_federal(String inscricao_federal) {
        this.inscricao_federal = inscricao_federal;
    }
}
