package com.inxmail.service;

import org.springframework.stereotype.Component;

import com.inxmail.entity.TodoItem;
import com.inxmail.rest.dto.TodoItemResponse;

@Component
public class TodoItemMapperImpl implements TodoItemMapper{
    @Override
    public TodoItemResponse toResponse( TodoItem entity) {
        return new TodoItemResponse(entity.getId(), entity.getDescription(), entity.getDueDate());
    }
}
