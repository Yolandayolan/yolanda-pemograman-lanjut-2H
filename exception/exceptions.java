package exception;

public class exceptions {
    public static void main(String[] args) {
        int x = 12;

        int y = 0;

        try {
            int z = x / y;

            System.out.println(z);

        } catch (Exception e) {

            System.out.println("Error");
        }
    }
}