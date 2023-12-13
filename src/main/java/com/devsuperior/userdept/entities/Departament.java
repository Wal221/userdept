package com.devsuperior.userdept.entities;

import jakarta.persistence.*;

@Entity //Estou dizendo pro meu banco de dados que esse sera uma entidade la no meu banco de dados
@Table(name="tb_department")//estou nomeando a minha tabela no meu bd para tb_department
public class Departament {

   //quero que o id seja auto implementado pelo meu banco de dados  vou usar duas Annotatios

    @Id //essa e minha FK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Departament() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
