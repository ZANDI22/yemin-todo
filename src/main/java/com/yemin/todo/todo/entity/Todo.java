package com.yemin.todo.todo.entity;

import com.yemin.todo.base.entity.BaseEntity;
import com.yemin.todo.category.entity.Category;
import com.yemin.todo.member.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Todo extends BaseEntity {

    private String title;
    private String content;
    private String memo;

    @Enumerated(EnumType.STRING)
    private TodoType todoType;
    private TodoType bookmark; // 즐겨찾기
    private TodoType myDay; // 오늘 하루

    private LocalDateTime startDate; // 기한 시작일
    private LocalDateTime endDate; // 기한 마감일
    private LocalDateTime finishDate; // 완료일

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "category_id")
    private Category category;
}
