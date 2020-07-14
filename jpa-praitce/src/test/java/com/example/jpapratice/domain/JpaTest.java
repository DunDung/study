package com.example.jpapratice.domain;

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
        Team team = new Team();
        team.setName("TeamA");
        em.persist(team);
        Member member = new Member();
        member.setName("member1");
        em.persist(member);
        team.getMembers().add(member);
        em.flush();
        em.clear();
        System.out.println("############" + member.getId());
        Member findMember = em.find(Member.class, member.getId());
        findMember.setName("t아카데미");
        System.out.println(findMember);
    }
}
