package com.example.jpapractice.domain;

public class TotalDto {
    Long id;
    String TeamName;

    public TotalDto(Member member) {
        System.out.println(member);
        this.id = member.getId();
        this.TeamName = member.getTeam().getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeamName() {
        return TeamName;
    }

    public void setTeamName(String teamName) {
        TeamName = teamName;
    }

    @Override
    public String toString() {
        return "TotalDto{" +
                "id=" + id +
                ", TeamName='" + TeamName + '\'' +
                '}';
    }
}
