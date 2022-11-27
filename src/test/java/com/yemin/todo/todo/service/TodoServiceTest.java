package com.yemin.todo.todo.service;

import com.yemin.todo.member.entity.Member;
import com.yemin.todo.member.entity.MemberRole;
import com.yemin.todo.member.service.MemberService;
import com.yemin.todo.todo.entity.Todo;
import com.yemin.todo.todo.entity.TodoType;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.DiscriminatorValue;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class TodoServiceTest {

    @Autowired TodoService todoService;
    @Autowired MemberService memberService;

    @Test
    @DisplayName("todo 저장 테스트")
    @Rollback(false)
    public void todoSaveTest() throws Exception {
        Member member = Member.builder()
                .email("user1@naver.com")
                .password("1234")
                .nickname("벌서는 라이언")
                .memberRole(MemberRole.ADMIN)
                .build();

        memberService.join(member);

        Todo saveTodo = Todo.builder()
                .title("11월27일 회의 준비")
                .content("DB 설계, 엔티티 설계")
                .todoType(TodoType.TODO)
                .member(member)
                .build();

        Long saveId = todoService.saveTodo(saveTodo);

        assertThat(saveTodo.getId()).isEqualTo(saveId);
    }

}