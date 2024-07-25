package com.treinamento.javaspring.repository;

import org.springframework.data.repository.CrudRepository;

import com.treinamento.javaspring.model.Aluno;

public interface AlunoRepository extends CrudRepository<Aluno, Long> {}
