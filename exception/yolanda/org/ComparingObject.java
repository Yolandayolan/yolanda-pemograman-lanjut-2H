package exception.yolanda.org;

import yolanda.org.A;

public class ComparingObject {
        private int x;
        public static void main(String[ ] args) {
            yolanda.org.A a = new yolanda.org.A();
            a.x = 5;
            yolanda.org.A b = new yolanda.org.A();
            b.x = 5;
            System.out.println(a == b);
        }
    }
