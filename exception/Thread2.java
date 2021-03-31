package exception;

public class vvvvv     Thread2 {
    public static class A implements Runnable {


        public void run() {


            System.out.println("Bye");


        }


    }


     static public class App {


        public static void main(String[ ] args) {


            Thread ob = new Thread(new A ());


            ob. start();


        }


    }

}
