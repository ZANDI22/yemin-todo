package com.yemin.todo.member.service;

import com.yemin.todo.member.entity.Member;
import com.yemin.todo.member.entity.MemberRole;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class MemberServiceTest {

    @Autowired private MemberService memberService;
    
    @Test
    @DisplayName("회원 가입 테스트")
    @Rollback(false)
    public void saveMemberTest() throws Exception {
        Member member = Member.builder()
                .email("user1@naver.com")
                .password("1234")
                .nickname("벌서는 라이언")
                .memberRole(MemberRole.ADMIN)
                .build();

        Long saveId = memberService.join(member);
        Assertions.assertThat(member.getId()).isEqualTo(saveId);
    }

}