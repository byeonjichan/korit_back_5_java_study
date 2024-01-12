package com.study.ch21;

import com.study.ch13.A;
import com.study.ch19.Member;

import java.util.ArrayList;

public class MemberMain {
    public static void main(String[] args)  {
            ArrayList<Member> members = new ArrayList<>();
            members.add(Member.builder().name("김종현").build());
            members.add(Member.builder().name("도경록").build());
            members.add(Member.builder().name("이지언").build());
            members.add(Member.builder().name("이동운").build());

            MemberService memberService = new MemberServiceImpl();
        try {
            memberService.printMemberList(members);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");
    }
}
