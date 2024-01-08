package com.study.ch08.Book;

import java.awt.image.RescaleOp;
import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selectedMenu = null;
        boolean loopFlag = true;

        Book[] books = new Book[3];
        BookRepository bookRepository = new BookRepository(books);
        BookService bookService = new BookService();


        while(loopFlag) {
            System.out.println("책 관리 프로그램");
            System.out.println("1. 책이름 등록");
            System.out.println("2. 책 조회");
            System.out.println("q.프로그램종료");
            System.out.println("메뉴 선택");
            selectedMenu = scanner.nextLine();

            if("q".equalsIgnoreCase(selectedMenu)) {
                System.out.println("프로그램을 종료중...");
                loopFlag = false;
            }
            else if ("1".equals(selectedMenu)) {
                System.out.println("<< 책 등록 페이지 >>");

                String name = null;
                System.out.print("책제목 >>>");
                name = scanner.nextLine();
                String writer= null;
                System.out.print("글쓴이 >>>");
                writer = scanner.nextLine();

                Book book = new Book(name, writer);
                bookService.append(book);



            } else if ("2".equals(selectedMenu)) {
                System.out.println("<<< 책 조회 페이지 >>>");
                for(int i = 0; i < books.length; i++) {
                    System.out.println(books[i]);
                }

            } else {
                System.out.println("다시 입력하세요");
            }
        }
        System.out.println("프로그램이 종료되었습니다.");
    }
}
