package com.inxmail.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inxmail.rest.dto.TodoItemResponse;
import com.inxmail.service.TodoItemService;


@RestController()
@RequestMapping("todo/v1/items")
public class TodoItemController {

    private final TodoItemService service;

    public TodoItemController(TodoItemService service) {
        this.service = service;
    }


    @GetMapping
    public ResponseEntity<List<TodoItemResponse>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("byDescription/{description}" )
    public ResponseEntity<TodoItemResponse> getByDescription(@PathVariable String description) {
        return ResponseEntity.ok( service.getByDescription( description ) );
    }
}
