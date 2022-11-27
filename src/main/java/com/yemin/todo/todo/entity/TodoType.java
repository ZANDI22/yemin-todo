package com.yemin.todo.todo.entity;

import lombok.Getter;

@Getter
public enum TodoType {
    TODO("todo"), DONE("done"), MYDAY("myday"), BOOKMARK("bookmark");

    TodoType(String type) {
        this.type = type;
    }

    private final String type;
}
