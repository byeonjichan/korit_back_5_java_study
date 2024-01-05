package com.study.ch08.member;

import java.util.Scanner;

public class MemberService {

    String inputValue(String label){
        Scanner scanner = new Scanner(System.in);
        String value = null;


        while (true) {
            System.out.println(label +" (입력취소 : exit) >>>");
            value = scanner.nextLine();
            if (!value.isBlank()) {
                break;
            }
        }
        return value;
    }

    boolean addMember(Member[] members) {
        String code = null;
        MemberRepository memberRepository = new MemberRepository();
        code = inputValue("code");
        if ("exit".equalsIgnoreCase(code)) {
            return false;
        }
        String name = null;
        name = inputValue("name");
        if ("exit".equalsIgnoreCase(name)) {
            return false;
        }
        String age = null;
        age = inputValue("age");
        if ("exit".equalsIgnoreCase(age)) {
            return false;
        }
        String address = null;
        address = inputValue("address");
        if ("exit".equalsIgnoreCase(address)) {
            return false;
        }

        Member member = new Member(code, name, Integer.parseInt(age), address); //멤버객체 생성
        return memberRepository.insert(members, member) > 0;

    }


}
