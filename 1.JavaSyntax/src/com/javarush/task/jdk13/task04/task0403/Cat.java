package com.javarush.task.jdk13.task04.task0403;

/* 
Как зовут кота?
*/

public class Cat {
    private String name = "безымянный кот";

    public void setName(String name) {
       this.name=name; //напишите тут ваш код

    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.name);
        cat.setName("Жужик");
        System.out.println(cat.name);
        cat.setName("Барсик");
        System.out.println(cat.name);
    }
}
