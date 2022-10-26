package homework8;

import java.util.Scanner;

public class Q10ArmstrongNumber {

    public static void main(String[] args) {

        int num, r, result = 0, temp;
        Scanner Scan = new Scanner(System.in);
        System.out.println("Input the Number :");
        num = Scan.nextInt();
        temp = num;
        while (num > 0) {
            r = num % 10;
            result = result + (r * r * r);
            num = num / 10;
        }


        if (temp == result) {
            System.out.println(result + " is an Armstrong number.");
        } else{
                System.out.println(result + " is not an Armstrong number.");
            }
        Scan.close();
        }
    }