package com.study.ch14;
import java.util.Objects;
/*
 * opject 클래스 object <모든 클래스들은 상속받고있다(최상위)
 */
public class ObjectTest {
    private String name;
    private String address;

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }
    @Override
    public String toString() {
        return "ObjectTest{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectTest that = (ObjectTest) o;
        return Objects.equals(name, that.name) && Objects.equals(address, that.address); // 생성없이 도구로 쓰는 메소드들은 static을 가지고있다 .
    }
    @Override // 오로지 값만 보고 비교
    public int hashCode() {
        return Objects.hash(name, address);
    }
}

