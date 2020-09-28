package com.example.jpapractice.service;

import com.example.jpapractice.domain.Member;
import com.example.jpapractice.domain.Team;
import com.example.jpapractice.repsitory.MemberRepository;
import com.example.jpapractice.repsitory.TeamRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TempService {
    private final MemberRepository memberRepository;
    private final TeamRepository teamRepository;

    public TempService(MemberRepository memberRepository, TeamRepository teamRepository) {
        this.memberRepository = memberRepository;
        this.teamRepository = teamRepository;
    }

    @Transactional
    public void save() {
        Team team = new Team();
        team.setName("RED팀");
        teamRepository.save(team);

        Member member = new Member();
        member.setName("둔덩");
        member.setTeam(team);
        memberRepository.save(member);
    }

    public Member findById(Long id) {
        Member member = memberRepository.findById(id)
                .orElseThrow(IllegalArgumentException::new);
        member.getTeam();
        return member;
    }
}
