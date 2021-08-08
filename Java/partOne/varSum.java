import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class varSum {
    public static void main(String[] args){
        
        //System.in is a standart input system
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter first number = ");
        int num1 = scan.nextInt();
        System.out.print("Please enter second number = ");
        int num2 = scan.nextInt();

        int sum = num1 + num2;
        System.out.print("Result = "+sum);

        
    }
}
