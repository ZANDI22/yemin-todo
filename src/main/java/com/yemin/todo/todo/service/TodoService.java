package com.yemin.todo.todo.service;

import com.yemin.todo.member.entity.Member;
import com.yemin.todo.member.entity.MemberRole;
import com.yemin.todo.member.repository.MemberRepository;
import com.yemin.todo.member.service.MemberService;
import com.yemin.todo.todo.entity.Todo;
import com.yemin.todo.todo.entity.TodoType;
import com.yemin.todo.todo.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;

    public Long saveTodo(Todo todo) {
        Todo saveTodo = todoRepository.save(todo);
        return saveTodo.getId();
    }
}
