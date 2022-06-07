import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        float max = -999;
        float min = 999;
        for(int i=0;i<a;i++)
        {
            float b = scn.nextFloat();
            if(b>max)
            {
                max = b;
            }
            if(b<min)
            {
                min = b;
            }
        }
        System.out.printf("max: " + "%.2f\n",max);
        System.out.printf("min: " + "%.2f\n",min);
    }
}