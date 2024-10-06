package com.bptn.course._12_wrapper_classes;

class Animal {
    void makeNoise() {
        System.out.println("Animal generic noise");
    }
}
class Dog extends Animal {
    void makeNoise() {
        System.out.println("Dog specific - Woof woof");
    }
}
class Cat extends Animal {
    void makeNoise() {
        System.out.println("Cat specific - Meow");
    }
}
public class TestAnimal {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeNoise();
        Dog d = new Dog();
        d.makeNoise();
        Cat c = new Cat();
        c.makeNoise();  
        a = d;
        a.makeNoise();
        a = c;
        a.makeNoise();      
    }
}