package exception;

import java.util.ArrayList;

//arraylist
public class Array {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list.get(1));
    }
}
