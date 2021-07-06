package com.bh.mybatis.mybatis.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {
    private Long id;
    private String name;
    private String email;

    @Builder
    public Member(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
