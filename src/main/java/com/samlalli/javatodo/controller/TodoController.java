package com.samlalli.javatodo.controller;

import com.samlalli.javatodo.model.TodoItem;
import com.samlalli.javatodo.repositories.TodoItemRepo;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class TodoController {

    @Autowired
    private TodoItemRepo TodoItemRepo;

    @GetMapping
    public List<TodoItem> findAll(){
        return TodoItemRepo.findAll();
    }

    @PostMapping
    public TodoItem save(
            @Validated @NotNull @RequestBody TodoItem todoItem){
        return TodoItemRepo.save(todoItem);

    }

    @PutMapping
    public TodoItem update(
            @Validated @NotNull @RequestBody TodoItem todoItem){
        return TodoItemRepo.save(todoItem);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        TodoItemRepo.deleteById(id);
    }
}
