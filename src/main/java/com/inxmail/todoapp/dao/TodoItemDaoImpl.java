package com.inxmail.todoapp.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.inxmail.todoapp.entity.TodoItem;


public class TodoItemDaoImpl implements TodoItemDao {

    private final JdbcTemplate jdbcTemplate;

    public TodoItemDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<TodoItem> getAll() {
        return jdbcTemplate.query("SELECT * FROM todo_items", new BeanPropertyRowMapper<>(TodoItem.class));
    }
}
