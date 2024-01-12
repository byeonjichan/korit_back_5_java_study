package com.study.home;
//abstractcalss 추상메서드
public class AbstractClass {
    public static void main(String[] args) {
        Pokemon pokemon = new Pikachu();
        System.out.println("이 포켓몬은: " + pokemon.getName() + "입니다.");
        pokemon.attak();
        pokemon.sound();

        pokemon = new Squirtle();
        System.out.println("이 포켓몬은: " + pokemon.getName()+"입니다 .");
        pokemon.attak();
        pokemon.sound();
    }
}
abstract class Pokemon{
    String name;
    abstract void attak();
    abstract void sound();
    public String getName() {
        return this.name;
    }
}
class Pikachu extends  Pokemon{
    Pikachu(){
        this.name="피카츄";
    }
    @Override
    void attak() {
        System.out.println("전기 충격");
    }

    @Override
    void sound() {
        System.out.println("피카피카!");
    }
}
class Squirtle extends Pokemon{
    Squirtle(){
        this.name ="꼬부기";
    }
    @Override
    void attak() {
        System.out.println("물대포");
    }

    @Override
    void sound() {
        System.out.println("꼬북꼬북");
    }
}