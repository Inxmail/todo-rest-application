package com.inxmail.todoapp.service;

import com.inxmail.todo.entity.TodoItem;
import com.inxmail.todo.rest.dto.TodoItemResponse;


public class TodoItemMapperImpl implements TodoItemMapper{
    @Override
    public TodoItemResponse toResponse( TodoItem entity) {
        return new TodoItemResponse(entity.id(), entity.description(), entity.dueDateTime());
    }
}
