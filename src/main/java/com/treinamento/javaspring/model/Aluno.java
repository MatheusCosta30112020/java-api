package com.treinamento.javaspring.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity(name = "alunos")

public class Aluno {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false) // regras de proteção
    private String nome;

    @Column(nullable = false)  // regras de proteção
    private String serie;

    @Column(nullable = false)  // regras de proteção
    private String sexo;

    @Temporal(TemporalType.DATE)  // regras de proteção
    private Date dataCadastro = new Date();
}
