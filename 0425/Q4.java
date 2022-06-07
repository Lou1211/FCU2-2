import java.util.Scanner;

public class Q4{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int n1 = 0;
        int n2 = 0;
        for(int i=1;a >= 1;i++)
        {
            n2 = n2 + a%10;
            a = a/10;
            n1++;
        }
        System.out.println(n1);
        System.out.println(n2);
    }
}