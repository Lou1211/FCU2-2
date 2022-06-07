import java.util.Scanner;

public class Q3{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int n=0;
        for(int i=1;i<=a;i++)
        {
            n = n + (i*(i+1));
        }
        System.out.println(n);
    }
}