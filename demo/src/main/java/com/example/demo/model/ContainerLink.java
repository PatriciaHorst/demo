package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="container_link")
@AllArgsConstructor
@NoArgsConstructor
public class ContainerLink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ip;

    private String nome;


    public int getIp() {
        return ip;
    }

    public void setIp(int ip) {
        this.ip = ip;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
