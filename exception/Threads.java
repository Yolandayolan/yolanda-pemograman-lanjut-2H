package exception;

public class Threads {
    public static void main(String[] args) {

    }
     static class A extends Thread {

        public void run () {

            System.out.println("Hello");
        }

        public void main(String[ ] args) {
            A object = new A();

            object.start();

        }

    }

}
