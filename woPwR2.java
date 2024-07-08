package Functions;

import java.util.Scanner;

public class woPwR2 {
    public static void main(String[] args) {
        System.out.println("addition result is" + add());
    }

    public static int add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        return a - b;
    }
}
