package yolanda.org;

public class EqualsMethod {
   static class A {
        private int x;
        public boolean equals ( Object o) {
            return ((A)o).x == this.x;
        }


        public void main(String[ ] args)  {


            A a = new A();

            a.x = 9;
            A b = new A();
            b.x = 5;
            System.out.println(a.equals(b)) ;
        }


    }


}
