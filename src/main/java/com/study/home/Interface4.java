package com.study.home;

public class Interface4 {
    public static void main(String[] args) {
        MycallPhone phone1 = new MycallPhone();
        Camera phone2 = new MycallPhone();
        Call phone3 = new MycallPhone();
        Memo phone4 = new MycallPhone();
        Clock phone5 = new MycallPhone();
        PhoneUser user1 = new PhoneUser();
        user1.call(phone1);
      //  user1.call(phone2);
        user1.call(phone3);
       // user1.call(phone4);
      //  user1.call(phone5);
    }
}
interface Camera{
    void photo();
}
interface Call{
    void calling();
}
interface Memo{
    void Write();
}
interface Clock{
    void clock();
}
class MycallPhone implements Camera,Call,Memo,Clock{
    @Override
    public void calling() {
        System.out.println("calling()");
    }

    @Override
    public void photo() {
        System.out.println("photo()");
    }

    @Override
    public void Write() {
        System.out.println("write()");
    }

    @Override
    public void clock() {
        System.out.println("clock()");
    }
}
class PhoneUser{
    void call(Call c){
        System.out.println("전화를 걸었습니다.");
    }
}