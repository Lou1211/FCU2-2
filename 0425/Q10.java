import java.util.Scanner;

public class Q10{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b;
        boolean flag = true;
        if(a==4)
        {
            System.out.println("2+2");
        }
        for(int i=3;i<=a/2;i+=2){
            if(i==3)
            {
                b=a-3;
                flag = true;
                for(int i1=2;i1<b;i1++)
                {
                    if(b%i1==0)
                    {
                        flag = false;
                    }
                }
                if(flag)
                {
                    System.out.println(i + "+" + b);
                }
            }
            else
            {
                b=a-i;
                flag = true;
                for(int i1=2;i1<b;i1++)
                {
                    if(b%i1==0)
                    {
                        flag = false;
                        //System.out.println(i);
                    }
                }
                for(int i1=2;i1<i;i1++)
                {
                    if(i%i1==0)
                    {
                        flag = false;
                        //System.out.println(i);
                    }
                }
                if(flag)
                {
                    System.out.println(i + "+" + b);
                }
            }
        }
    }
}