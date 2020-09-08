package com.example.jpapractice.service;

import com.example.jpapractice.domain.Member;
import com.example.jpapractice.domain.Team;
import com.example.jpapractice.repsitory.MemberRepository;
import com.example.jpapractice.repsitory.TeamRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberService {
    private final MemberRepository memberRepository;
    private final TeamRepository teamRepository;

    public MemberService(MemberRepository memberRepository, TeamRepository teamRepository) {
        this.memberRepository = memberRepository;
        this.teamRepository = teamRepository;
    }

    @Transactional
    public void save() {
        Team team = teamRepository.save(new Team());
        Member member = memberRepository.save(new Member());
        member.setName("둔덩");
        member.setTeam(team);
    }

    @Transactional
    public Member findAll() {
        return memberRepository.findById(1L).get();
    }
}
