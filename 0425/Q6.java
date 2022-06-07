import java.util.Scanner;

public class Q6{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int n1 = 1;
        int n2 = 0;
        while(n2<=a){
            n2 = n2+n1;
            n1++;
        }
        n1 = n1-2;
        System.out.println(n1);
    }
}