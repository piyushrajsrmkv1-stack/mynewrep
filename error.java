public class ErrorDemo {

    public static void main(String[] args) {

        int number = "100";   // ERROR: String assigned to int

        System.out.println("Value: " + number)

        for(int i = 0; i < 5; i++) {   // LOGICAL ERROR: infinite loop
            System.out.println(i);
        }

        int result = divide(10, 0);   // RUNTIME ERROR: divide by zero

        System.out.println(result);
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
