package com.study.ch16;

import com.study.ch02.PersonMain;

import javax.crypto.BadPaddingException;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Member> members = new ArrayList<>();
        String selectedMenu = null;

        while (true) {
            System.out.println("회원 관리 프로그램");
            System.out.println("1. 회원등록");
            System.out.println("2. 회원 이름 수정");
            System.out.println("3. 회원 주소 수정");
            System.out.println("4. 회원 이름으로 조회");
            System.out.println("5. 회원 전체 조회");
            System.out.println("6. 회원 삭제");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택 >>");
            selectedMenu = scanner.nextLine();
            //순서 1 > 5 > 4 > 6 > 2 > 3

            if("q".equalsIgnoreCase(selectedMenu)) {
                break;
            } else if("1".equals(selectedMenu)) {//[회원등록하기] 출력 /  이름 김준일 주소 부산 동래구 / 결과 <<등록이 완료되었습니다.>>
                System.out.println("[회원 등록 하기]");
                System.out.print("이름 : ");
                String name = scanner.nextLine();
                System.out.print("주소 : ");
                String address = scanner.nextLine();
                Member member = new Member(name, address);
                members.add(member);
                System.out.println("<<등록이 완료되었습니다.>>");
            }else if("2".equals(selectedMenu)) {//[회원 이름 수정하기] 출력/ 수정 할 회원의 이름을 입력하세요>> 김준일 / 이름>> 김준이 / 결과 <<수정이 완료되었습니다.>>

            }else if("3".equals(selectedMenu)) {//[회원 주소 수정하기] 출력/해당 이름의 회원이 존재하지 않습니다/ 수정 할 회원의 이름을 입력하세요>> 김준이 / 주소>> 부산동래구사직동 / 결과 <<수정이 완료되었습니다.>>

            }else if("4".equals(selectedMenu)) {// [회원 이름으로 조회] / 조회 할 회원의 이름을 입력하세요 > 김준이/ Member 객체 toString();/ <<조회가 완료되었습니다>>
                System.out.println("회원 이름으로 조회");
                System.out.printf("회원명 :");
                for (Member member : members) {
                    String name =scanner.nextLine();
                    if (member.getName().equals(name)) {
                        System.out.println("조회 할 회원의 이름: " + member.getName());
                        break;
                    }
                }
                System.out.println("<<< 조회가 완료되었습니다 >>>");

            }else if("5".equals(selectedMenu)) {// [회원 전체 조회하기] / MemberList 전체 반복 toString();/ <<조회가 완료되었습니다.>>
                System.out.println("[회원 전체 조회하기]");
                for (Member member : members)
                    member.setName(member.getName());
                for (Member member : members)
                    member.setAddress(member.getAddress());
                System.out.println(members);
                System.out.println("<<조회가 완료되었습니다.>>");

            }else if("6".equals(selectedMenu)) { // [회원 이름으로 삭제ㅎ기] / 삭제 할 회원의 이름을 입력. > 김준이 / 삭제 된 Member객체 toString();/ <삭제가 완료되었습니다.>

            }else {
                System.out.println("다시 선택하세요.");
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
