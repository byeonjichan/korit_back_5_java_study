package com.study.ch16;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {
    private static ArrayList<Member> members = new ArrayList<>();

    public static String inputseachName(String label) { //중복되는 4,6부분을 함수화 하는것
        Scanner scanner = new Scanner(System.in);
        System.out.println(label + " >>");
        return scanner.nextLine();
    }

    public static Member findMemberByName(String name) {
        for(Member member : members) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }

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
                String name = null;
                String address = null;
                System.out.println("[회원 등록 하기]");
                System.out.print("이름 : ");
                name = scanner.nextLine();
                System.out.print("주소 : ");
                address = scanner.nextLine();
                Member member = new Member(name, address); //멤버 객체 생성 , 올아규컨스트럭터가 있기때문에 바로 사용가능.
                members.add(member); // members 라는 어레이 리스트 존재하기에 .add(member)
                System.out.println("<<등록이 완료되었습니다.>>");

            }
            else if("2".equals(selectedMenu)) {//[회원 이름 수정하기] 출력/ 수정 할 회원의 이름을 입력하세요>> 김준일 / 이름>> 김준이 / 결과 <<수정이 완료되었습니다.>>
                System.out.println("[회원 이름 수정]");
                String searchName = inputseachName("회원명 : ");
                Member findMember = findMemberByName(searchName);
                if(findMember == null) {
                    System.out.println("해당 이름의 회원이 존재하지 않습니다.");
                    continue;
                }
                System.out.print("이름 : ");
                String updateName = scanner.nextLine();
                findMember.setName(updateName);
                System.out.println("<< 수정이 완료되었습니다. >>");
            }

            else if("3".equals(selectedMenu)) {//[회원 주소 수정하기] 출력/해당 이름의 회원이 존재하지 않습니다/ 수정 할 회원의 이름을 입력하세요>> 김준이 / 주소>> 부산동래구사직동 / 결과 <<수정이 완료되었습니다.>>
                System.out.println("[회원 주소 수정]");
                String searchName = inputseachName("회원명 : ");
                Member findMember = findMemberByName(searchName);
                if(findMember == null) {
                    System.out.println("해당 이름의 회원이 존재하지 않습니다.");
                    continue;
                }
                System.out.print("주소 : ");
                String updateAddress = scanner.nextLine();
                findMember.setAddress(updateAddress);
                System.out.println("<< 수정이 완료되었습니다. >>");

            }else if("4".equals(selectedMenu)) {// [회원 이름으로 조회] / 조회 할 회원의 이름을 입력하세요 > 김준이/ Member 객체 toString();/ <<조회가 완료되었습니다>>

                String searchname = null;
                searchname = inputseachName(" [ 회원 이름으로 조회 ]");
                searchname = inputseachName("회원명 : ");
                Member findMember = findMemberByName(searchname);
                    if(findMember == null) {  // null 값 이면 회원을 못찾은거
                        System.out.println("해당 이름의 회원이 존재하지 않습니다.");
                        continue;
                    }
                System.out.println(findMember);
                System.out.println("<<< 조회가 완료되었습니다 >>>");

            }else if("5".equals(selectedMenu)) {// [회원 전체 조회하기] / MemberList 전체 반복 toString();/ <<조회가 완료되었습니다.>>
                System.out.println("[회원 전체 조회하기]");

                for (Member member : members) { // members 가 저장공간 member 각각을 밑에서 출력
                    System.out.println(member);
                }
                System.out.println("<<조회가 완료되었습니다.>>");

            }else if("6".equals(selectedMenu)) { // [회원 이름으로 삭제ㅎ기] / 삭제 할 회원의 이름을 입력. > 김준이 / 삭제 된 Member 객체 toString();/ <삭제가 완료되었습니다.>
                String searchname = null;
                System.out.println(" [ 회원 이름으로 삭제하기 ]");
                System.out.print("회원명 : ");
                searchname =scanner.nextLine();

                Member findMember = null;
                for(Member member : members) { //
                    if (member.getName().equals(searchname)) { // 방금 꺼낸 멤버의 이름이 찾은회원과 같은지
                        findMember = member;
                        break;
                    }
                }
                if(findMember == null) { // null 값 이면 회원을 못찾은거
                    System.out.println("해당 이름의 회원이 존재하지 않습니다.");
                    continue;
                }
                members.remove(findMember);
//                members.remove(members.indexOf(findMember));
                System.out.println(findMember);
                System.out.println("<<< 삭제가 완료되었습니다. >>");

            }else {
                System.out.println("다시 선택하세요.");
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
