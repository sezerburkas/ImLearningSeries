import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class factorial {
    public static void main(String[] args){

        //System.in is a standart input system
        Scanner scan = new Scanner(System.in); 

        System.out.print("Please enter number = ");
        int num = scan.nextInt();
        int result = 1;
        for (int i=1;i < num+1;i++)
        {
            result *= i;
        }
        
        System.out.print("Result = "+result);

    }
}
