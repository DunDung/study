package com.example.jpapractice.controller;

import com.example.jpapractice.domain.Member;
import com.example.jpapractice.domain.Team;
import com.example.jpapractice.domain.TempRequest;
import com.example.jpapractice.service.TempService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private TempService tempService;

    public Controller(TempService tempService) {
        this.tempService = tempService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Team find() {
        tempService.save();
        Member member = tempService.findById(1L);
        return member.getTeam();
    }

    @PostMapping("/dto")
    @ResponseStatus(HttpStatus.OK)
    public TempRequest temp(@RequestBody TempRequest tempRequest) {
        System.out.println(tempRequest);
        return tempRequest;
    }

    @ExceptionHandler(Exception.class)
    public void asd(Exception e) {
        e.printStackTrace();
    }
}
