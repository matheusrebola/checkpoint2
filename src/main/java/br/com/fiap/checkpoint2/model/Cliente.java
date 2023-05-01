package br.com.fiap.checkpoint2.model;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cod_cliente;
    @Column(name = "nome_cliente")
    private String nome;
    @Column(name = "cep")
    private String cep;
    @Column(name = "inscricao_federal")
    private String inscricao_federal;

    public Long getCod_cliente() {
        return cod_cliente;
    }

    public Cliente setCod_cliente(Long cod_cliente) {
        this.cod_cliente = cod_cliente;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Cliente setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getCep() {
        return cep;
    }

    public Cliente setCep(String cep) {
        this.cep = cep;
        return this;
    }

    public String getInscricao_federal() {
        return inscricao_federal;
    }

    public Cliente setInscricao_federal(String inscricao_federal) {
        this.inscricao_federal = inscricao_federal;
        return this;
    }
}
