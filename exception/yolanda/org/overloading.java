package exception.yolanda.org;

public class overloading {
    public static void main(String[] args) {

    }

    static class A {
        public void doSomething() {
            System.out.println("A");
        }

        public void doSomething(String str ) {
            System.out.println(str);
        }
    }

  static   class B {
        public void main(String [] args) {
            A object = new A();
            object.doSomething("B");
        }
    }
}