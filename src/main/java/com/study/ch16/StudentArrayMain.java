package com.study.ch16;


import java.util.ArrayList;

public class StudentArrayMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("김준일", 31));
        students.add(new Student("김준이", 31));
        students.add(new Student("김준삼", 31));
        students.add(new Student("김준사", 31));

        System.out.println(students);

        Student s = new Student("aaa", 10);
        s.setAge((s.getAge()) + 1);
        //배열을 집어넣는 개념과 같다 . 주소를 배열에 담고 있다.

        // !!중요 데이터베이스 값을 가져와서 사용!!
        {
        Student student = null;
        for (int i = 0; i < students.size(); i++) {
            student = students.get(i);
            student.setAge(student.getAge() + 1); //0번째 학생의 값을 꺼내면 setage 하겠다.( 0번째 나이를 setage한다 )+1
            }
        }
        //향상된 for
        for (Student student : students)
            student.setAge(student.getAge() + 1);

        Student[] studentArray = new Student[4];
        for (int i =0; i < studentArray.length; i++) {
            studentArray[i] = new Student("김준일", 31);
        }

        int i = 0;
        for (Student student : studentArray){
            studentArray[i] =new Student("김준일",31);
            i++;
        }
        for(Student student : studentArray) {
            System.out.println(student);
        }
        students.set(0, new Student("김준일",31));
    }
}
