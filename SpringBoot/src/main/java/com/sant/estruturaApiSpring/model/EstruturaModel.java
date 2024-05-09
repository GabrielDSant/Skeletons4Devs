package com.sant.estruturaApiSpring.model;

import jakarta.persistence.*;
//Ao usar o lombok você pode usar a anotação para criar os getters e setters sozinho.
//import lombok.Getter;
//import lombok.Setter;

@Entity
@Table(name = "estruturaModel")
public class EstruturaModel {
    //@Getter
    //@Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
