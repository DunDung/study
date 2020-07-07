package jpa.study;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import jpa.study.entity.Member;
import jpa.study.entity.Team;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        // 설정 정보에 unit name을 hello라고 했기 때문에 인자로 hello를 넘겨서 설정 정보를 가져온다. 로딩
        EntityManager em = emf.createEntityManager();
        // 엔티티 메니저를 얻었으면 트랜잭션부터 가져와야 한다. JPA의 모든 활동은 트랜잭션 안에서 이루어져야 한다.
        EntityTransaction tx = em.getTransaction();
        tx.begin(); // 트랜잭션 시작, 커넥션

        // 정석 로직
        try {
            //팀 저장
            Team team = new Team();
            team.setName("TeamA");
            em.persist(team);

            Member member = new Member();
            member.setName("member1");
            member.setTeam(team);
            em.persist(member); // 영구 저장하다.
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}
