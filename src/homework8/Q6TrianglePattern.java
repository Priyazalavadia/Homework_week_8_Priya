package homework8;

import java.util.Scanner;

public class Q6TrianglePattern {
    public static void main(String[] args) {
        int i,j,n;
        System.out.print("Input number of n :");
        Scanner Scan = new Scanner(System.in);
        n = Scan.nextInt();

        for (i=1; i<=n; i++)
        {
          for (j=1; j<=i; j++)
              System.out.print(j);
            System.out.println(" ");

        }
    }
}
