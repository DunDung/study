package com.example.jpapractice.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.persistence.EntityManager;

@DataJpaTest
public class JpaTest {

    @Autowired
    EntityManager em;

    @Test
    void persist() {
        Class aClass = Member.class;
        Member member = new Member();
        Team team = new Team();
        member.setTeam(team);
        em.persist(member);
        em.flush();
    }
}