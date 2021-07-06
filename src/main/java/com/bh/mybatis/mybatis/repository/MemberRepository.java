package com.bh.mybatis.mybatis.repository;

import com.bh.mybatis.mybatis.domain.Member;
import com.bh.mybatis.mybatis.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MemberRepository {
    private MemberMapper mapper;

    @Autowired
    public MemberRepository(MemberMapper mapper) {
        this.mapper = mapper;
    }

    public List<Member> findAll() {
        return mapper.findAll();
    }

    public Member findById(Long id) {
        return mapper.findById(id);
    }
}
