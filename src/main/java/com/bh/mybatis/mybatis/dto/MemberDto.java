package com.bh.mybatis.mybatis.dto;

import com.bh.mybatis.mybatis.domain.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MemberDto {
    private Long id;
    private String name;
    private String email;

    public Member toEntity(){
        Member build = Member.builder()
                .name(name)
                .email(email)
                .build();
        return build;
    }

    @Builder
    public MemberDto(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
