package com.example.jpapractice.domain;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class JpaTest {

    @Autowired
    EntityManager em;

    @Test
    void persist() {
        /*
        Team team = new Team();
        team.setName("TeamA");
        em.persist(team);

         */
        Member member = new Member();
        member.setName("member1");
        //   member.setTeam(team);
        em.persist(member);
        // team.getMembers().add(member);
        em.flush();
        em.clear();

        Member findMember = em.find(Member.class, member.getId());

        em.close();

        Team findTeam = findMember.getTeam();
        findTeam.getName();
        System.out.println("findTeam : " + findTeam);
    }
}
