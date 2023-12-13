package com.devsuperior.userdept.entities;

import jakarta.persistence.*;

@Entity
@Table(name="tb_user")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;


    //Esse ManyToOne e onde eu realizo a minha chave estrangeira
    //E como esse objeto esta sendo mapeado e construido o meu banco de dados e esse atributo e uma coluna no meu banco de dados
    //logo eu posso deixa ela com esse nome normalmente , porem como e uma chave estrageira , por boas praticas seria melhor eu troca-la
    @ManyToOne
    @JoinColumn(name = "departament_id")
    private Departament departament;


    public User(){

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }
}
