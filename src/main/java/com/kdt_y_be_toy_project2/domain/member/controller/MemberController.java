package com.kdt_y_be_toy_project2.domain.member.controller;

import com.kdt_y_be_toy_project2.domain.member.dto.request.SignUpRequest;
import com.kdt_y_be_toy_project2.domain.member.service.MemberService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/members")
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/signUp")
    public void join(SignUpRequest request) {
        memberService.signUp(request);
    }
}
