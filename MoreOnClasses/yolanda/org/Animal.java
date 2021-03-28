package yolanda.org;

public class Animal {
        public void makeSound() {
            System.out.println("hi");
        }
    }

    class Dog extends Animal {

    }

    class A {
        public int x;

        public static void main(String [] args ) {
            Dog dog = new Dog();
            dog.makeSound();

        }

        public void doSomething(String b) {
        }
    }