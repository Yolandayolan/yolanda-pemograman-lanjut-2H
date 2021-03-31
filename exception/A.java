package exception;

import java.util.HashMap;

public class A {
    public static void main(String[ ] args) {
        HashMap<String, String> m = new HashMap<>();
        m.put("A", "First");
        m.put("B", "Second");
        m.put("C", "Third");
        System.out.println(m.get("B"));
    }
}
