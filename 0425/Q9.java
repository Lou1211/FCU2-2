import java.util.Scanner;

public class Q9{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a1 = scn.nextInt();
        int a2 = scn.nextInt();
        a2 = scn.nextInt();
        int a3 = scn.nextInt();
        int n1[][] = new int [a1][a2];
        int n2[][] = new int [a2][a3];
        int n3[][] = new int [a1][a3];
        for(int i = 0;i<a1;i++){
            for(int i1 = 0;i1<a2;i1++)
            {
                n1[i][i1]=scn.nextInt();
            }
        }
        for(int i = 0;i<a2;i++){
            for(int i1 = 0;i1<a3;i1++)
            {
                n2[i][i1]=scn.nextInt();
            }
        }
        for(int i1 = 0; i1<a1;i1++)
        {
            for(int i2 = 0; i2<a3;i2++)
            {
                for(int i3 = 0; i3<a2;i3++)
                {
                    n3[i1][i2] += (n2[i3][i2]*n1[i1][i3]);
                }
            }
        }
        for(int i = 0;i<a1;i++){
            for(int i1 = 0;i1<a3;i1++)
            {
                System.out.printf("%4d\t",n3[i][i1]);
            }
            System.out.print("\n");
        }
        
    }
}