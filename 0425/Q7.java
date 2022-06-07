import java.util.Scanner;

public class Q7{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a1 = scn.nextInt();
        int n1[] = new int [a1];
        int n2 = 1;
        int b=-999;
        for(int i = 0;i<a1;i++){
            n1[i]=scn.nextInt();
        }
        for(int i = 0;i<a1;i++){
            for(int i1 = i;i1<a1;i1++){
                n2*=n1[i1];
                if(n2>b){
                    b = n2;
                }
            }
            n2 = 1;
        }
        System.out.println(b);
    }
}