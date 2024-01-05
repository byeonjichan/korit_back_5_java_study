package com.study.ch07.member;

import java.util.Scanner;

public class MemberMain {

    private static String selectedMenu;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemberService memberService = new MemberService();
        String menuValue = null;

        while(true) {
            System.out.println("[[회원 관리 프로그램]]");
            System.out.println("1. 회원 등록");
            System.out.println("q. 프로그램 종료");

            System.out.print("메뉴선택 >>>");
            selectedMenu = scanner.nextLine();

            if ("1".equals(selectedMenu)) {
                boolean responseData = memberService.addMember();
                if (responseData) {
                    System.out.println("<<< 등록 완료 >>>>");
                } else {
                    System.out.println("<<< 등록 취소 >>>");
                }
            }   else if ("q".equalsIgnoreCase(selectedMenu))  {
                break;
            }   else {
                    System.out.println("다시 선택하세요.");
                }

//            switch (selectedMenu) {
//                case "1" :
//                    break;
//                case "2" :
//                    break;
//                default:
//                    System.out.println("다시 선택하세요.");
//            } 명확하게 키값 입력해서 찾아야할때 스위치문 사용
        }
        System.out.println();
        System.out.println("프로그램이 종료되었습니다");
    }
}
