package com.devsuperior.userdept.controllers;

import com.devsuperior.userdept.entities.User;
import com.devsuperior.userdept.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Para dizer que essa minha classe vai ser um controlador Rest basta adiciona annotation abaixo
@RestController
//O RequestMapping e para dizer qual caminho esse controlador vai responder
@RequestMapping(value = "/users")//oque quer dizer que quando eu estiver acessando minha URL,localhost:8080/users vou
                                 // esta acessando esse cara.
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping //para informa que esse a um requisição do tipo get
    public List<User> findAll(){
     List<User> result =  repository.findAll();  //Esse Find All ja manda para o banco de dados uma consulta e me retorna uma lista de todos os meu usuarios
    return  result;
    }

    @GetMapping(value = "/{id}") //vai me indica que estou acessando o /users mais algum numero ou seja vai me retorna o usuario de ID especifico
    public User findById(@PathVariable Long id){
      User user = repository.findById(id).get();
      return user;

    }


    @PostMapping
    public User insert(@RequestBody User user){ // O meu objeto que vai ser o corpo da requisição
        User resul = repository.save(user); //Esse save vai manda para o meu banco de dados o insert ja convertido para o relacional
        return resul;

    }




}
