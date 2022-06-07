import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String a = scn.nextLine();
        StringBuilder b = new StringBuilder(a);
        a = b.reverse().toString();
        System.out.println(a);
    }
}