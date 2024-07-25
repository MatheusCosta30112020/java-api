package com.treinamento.javaspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treinamento.javaspring.model.Aluno;
import com.treinamento.javaspring.repository.AlunoRepository;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {
    
    @Autowired
   private AlunoRepository alunoRepository;
   
   @PostMapping("/cadastrar")
   public Aluno cadastrar(@RequestBody Aluno obj){
        return alunoRepository.save(obj);
   }
   
}

