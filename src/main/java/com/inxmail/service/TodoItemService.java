package com.inxmail.service;

import java.util.List;

import com.inxmail.rest.dto.TodoItemResponse;


public interface TodoItemService {

    List<TodoItemResponse> getAll();
}
