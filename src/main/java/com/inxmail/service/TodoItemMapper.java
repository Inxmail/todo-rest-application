package com.inxmail.service;

import com.inxmail.entity.TodoItem;
import com.inxmail.rest.dto.TodoItemResponse;


public interface TodoItemMapper {

    TodoItemResponse toResponse( TodoItem entity);
}
