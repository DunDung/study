package com.example.jpapractice.controller;

import com.example.jpapractice.domain.Member;
import com.example.jpapractice.domain.TotalDto;
import com.example.jpapractice.service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private MemberService memberService;

    public Controller(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public TotalDto find() {
        Member member = memberService.findAll();
        return new TotalDto(member);
    }

    @GetMapping("/a")
    @ResponseStatus(HttpStatus.CREATED)
    public void save() {
        memberService.save();
    }

    @ExceptionHandler(Exception.class)
    public void asd(Exception e) {
        e.printStackTrace();
    }
}
