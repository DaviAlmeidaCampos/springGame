package com.senai.davi.ProjGame.etities;

import jakarta.persistence.*;

@Entity
@Table(name = "db_game")
public class Jogo {	   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
   
    @Column(name = "nome")
    private String name;
   
    @Column(name = "plataform")
    private String plataform;
    
    public long getId(){
        return Id;
    }
   
    public String getName() {
        return name;
    }
    
    public String getPlataform() {
        return plataform;
    }
    
    public void setId(Long id) {
        this.Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlataform(String plataform) {
        this.plataform = plataform;
    }
}
