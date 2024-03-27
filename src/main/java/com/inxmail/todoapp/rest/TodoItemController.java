package com.inxmail.todoapp.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.inxmail.todoapp.rest.dto.TodoItemResponse;
import com.inxmail.todoapp.service.TodoItemService;


@RestController("todo/v1/items")
public class TodoItemController {

    private final TodoItemService service;

    public TodoItemController(TodoItemService service) {
        this.service = service;
    }


    @GetMapping
    public ResponseEntity<List<TodoItemResponse>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }
}
