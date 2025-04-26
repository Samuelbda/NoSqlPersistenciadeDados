package com.example.tarefas.repository;

import com.example.tarefas.model.Tarefa;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TarefaRepository extends MongoRepository<Tarefa, String> {
}
