package com.example.jpapractice.domain;

public class TotalDto {
    String memberName;
    String teamName;

    public TotalDto(Member member) {
        this.memberName = member.getName();
        this.teamName = member.getTeam().getName();
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String toString() {
        return "TotalDto{" +
                "memberName='" + memberName + '\'' +
                ", teamName='" + teamName + '\'' +
                '}';
    }
}
