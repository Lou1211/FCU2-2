import java.util.Scanner;

public class Q8{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a1 = scn.nextInt();
        int a2 = scn.nextInt();
        int n1[] = new int [a1];
        int n2[] = new int [a2];
        int b=0;
        for(int i = 0;i<a1;i++){
            n1[i]=scn.nextInt();
            for(int i1 = 0;i1<i;i1++)
            {
                if(n1[i]==n1[i1]&&n1[i]!=999)
                {
                    n1[i1]=999;
                }
            }
        }
        for(int i = 0;i<a2;i++){
            n2[i]=scn.nextInt();
            for(int i1 = 0;i1<i;i1++)
            {
                if(n2[i]==n2[i1]&&n2[i]!=999)
                {
                    n2[i1]=999;
                }
            }
        }
        for(int i = 0;i<a1;i++)
        {
            for(int i1 = 0;i1<a2;i1++)
            {
                if(n1[i]==n2[i1]&&n1[i]!=999&&n2[i1]!=999){
                    b++;
                }
            }
        }
        System.out.println(b);
    }
}