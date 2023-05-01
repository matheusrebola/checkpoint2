package br.com.fiap.checkpoint2.controller.dto.clienteDto;

public class ClienteCreate {
    private String nome;
    private String cep;
    private String inscricao_federal;

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
