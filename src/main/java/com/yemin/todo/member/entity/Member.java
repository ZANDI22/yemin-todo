package com.yemin.todo.member.entity;

import com.yemin.todo.base.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Member extends BaseEntity {

    @Column(unique = true)
    private String email;
    private String password;
    private String nickname;

    @Enumerated(EnumType.STRING)
    private MemberRole memberRole;



}
