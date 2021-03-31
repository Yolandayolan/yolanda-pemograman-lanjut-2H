package exception;

import java.util.HashMap;

public class B {
    public static void main(String[] args) {
        HashMap<String, String> m = new HashMap<>();
        m.put("A", "First");
        m.put("B", "second");

        System.out.println(m.get("B"));
    }
}
