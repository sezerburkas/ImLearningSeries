import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

import javax.lang.model.util.ElementScanner6;
public class basicCalculator {
    public static void main(String[] args){

        Integer number, result=null;
        float resultF=0;
        

        //System.in is a standart input system
        Scanner scan = new Scanner(System.in); 

        System.out.println("------------- Welcome To Basic Calculator --------------");

        System.out.println("Possible actions : ");
        System.out.println("1 - Addition");
        System.out.println("2 - Substraction");
        System.out.println("3 - Division");
        System.out.println("4 - Multiplaction");
        System.out.println("5 - Average");
        System.out.println("6 - Greatest / Lowest");

        System.out.print("Please select your action by writing id: ");
        int id = scan.nextInt();
        System.out.print("How many numbers will you use? : ");
        int numCount = scan.nextInt();

        if(id == 1)
        {
            //Addition
            for(int i=1; i <= numCount;i++)
            {
                System.out.print("Please add your #"+i+" number: ");
                number = scan.nextInt();
                result += number;
            }

        }else if(id == 2)
        {
            //Substraction
            for(int i=1; i <= numCount;i++)
            {
                System.out.print("Please add your #"+i+" number: ");
                number = scan.nextInt();
                if(i == 1)
                {
                    result = number;
                }else{
                    result -= number;
                }
            }

        }else if(id == 3)
        {
            //Division
            for(int i=1; i <= numCount;i++)
            {
                System.out.print("Please add your #"+i+" number: ");
                number = scan.nextInt();
                if(i == 1)
                {
                    resultF = number;
                }else{
                    resultF /= number;
                }
            }
            
        }else if(id == 4)
        {
              //Multiplaction
              for(int i=1; i <= numCount;i++)
              {
                  System.out.print("Please add your #"+i+" number: ");
                  number = scan.nextInt();
                  if(i == 1)
                  {
                      result = number;
                  }else{
                      result *= number;
                  }
              }
        }else if(id == 5)
        {
                //Average
                for(int i=1; i <= numCount;i++)
                {
                    System.out.print("Please add your #"+i+" number: ");
                    number = scan.nextInt();
                    if(i == 1)
                    {
                        resultF = number;
                    }else{
                        resultF += number;
                    }
                }
                resultF /= numCount;
        }else if(id == 6)
        {
            //Greatest/Lowest
            int k;
            Integer[] numArray = new Integer[numCount];
            for(int i=0; i < numCount;i++)
                {
                    k = i+1;
                    System.out.print("Please add your #"+k+" number: ");
                    number = scan.nextInt();
                    numArray[i] = number;
                }
                Arrays.sort(numArray, Collections.reverseOrder());
                System.out.println("Greatest number: "+numArray[0]);
                System.out.println("Lowest number: "+numArray[numCount-1]);
        }

        if(result != null)
        {
            System.out.println("Result: "+result);
        }else
        {
            System.out.println("Result: "+resultF);
        }
    }
}
