package com.yemin.todo.member.service;

import com.yemin.todo.member.entity.Member;
import com.yemin.todo.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public Long join(Member member) {
        Member saveMember = memberRepository.save(member);
        return saveMember.getId();
    }
}
