package com.inxmail.todoapp.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

import com.inxmail.todoapp.entity.TodoItem;


@Repository
public interface TodoItemDao {

    List<TodoItem> getAll();
}
