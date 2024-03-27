package com.inxmail.todoapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.inxmail.todoapp.dao.TodoItemDao;
import com.inxmail.todoapp.rest.dto.TodoItemResponse;


@Service
public class TodoItemServiceImpl implements TodoItemService {

    private final TodoItemDao dao;
    private final TodoItemMapper mapper;

    public TodoItemServiceImpl(TodoItemDao dao, TodoItemMapper mapper) {
        this.dao = dao;
        this.mapper = mapper;
    }

    @Override
    public List<TodoItemResponse> getAll() {
        return dao.getAll().stream().map( todoItem -> mapper.toResponse( todoItem ) ).toList();
    }
}
