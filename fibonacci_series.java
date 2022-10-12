import java.util.Scanner;

public class fibonacci_Series {
    public static void main(String[] args) {
        int first=0,second=1,sum=0,i,count;
        System.out.print("enter the nuber of terms:");
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();

        System.out.print("fibonacci series are:");
        for(i=0;i<count;i++)//loop starts from 2 because 0 and 1 are already printed
        {
            if (i <= 1)
            {
                sum = i; // to print 0 and 1
            }
            else
            {
                sum = first + second; // to calculate the remaining terms.
                first = second;       // value of first and second changes as new term is printed.
                second = sum;
            }

            System.out.print(sum+" ");
        }
    }
}
