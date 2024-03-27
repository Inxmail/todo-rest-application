package com.inxmail.todoapp.service;

import org.springframework.stereotype.Component;

import com.inxmail.todo.entity.TodoItem;
import com.inxmail.todo.rest.dto.TodoItemResponse;


@Component
public interface TodoItemMapper {

    TodoItemResponse toResponse( TodoItem entity);
}
