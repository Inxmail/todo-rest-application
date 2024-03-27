package com.inxmail.todoapp.service;

import java.util.List;

import com.inxmail.todo.rest.dto.TodoItemResponse;


public interface TodoItemService {

    List<TodoItemResponse> getAll();
}
