package com.yemin.todo.category.entity;

import lombok.Getter;

@Getter
public enum CategoryType {
    LOCAL("local"), SHARE("share");

    CategoryType(String type) {
        this.type = type;
    }

    private final String type;
}
