package com.study.ch15;

public class SendMain {
    public static void main(String[] args) {

        SendData<String> sendData1 = new SendData<>(200,"김준일");
    //    send(sendData1);
        SendData<Member> sendData2 = new SendData<>(200, new Member("김준일", "01082609712"));
        send(sendData2);
        SendData<VipMember> sendData3 = new SendData<>(200, new VipMember("김준이","01082609712"));
        send(sendData3);
    }
    //리턴자료형이 어떤자료형으로 리턴될지모를때 ex) SendData<?> 넣어줘도 된다.
    public static void send(SendData<? super VipMember> sendData) { // 제네릭의 와일드카드 ? <자료형을 여러개 넣고 싶을때>
        sendData.send();  // 위 ))<? extends 객체> 상속제한 멤버를 상속받은것들만 들어올수있다. // <? super 객체> 부모클래스와 자식클래스 둘만 들어올수있음.
    }
}
