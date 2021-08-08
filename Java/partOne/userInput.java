import java.util.Scanner;
public class userInput {
    public static void main(String[] args){

        //System.in is a standart input system
        Scanner scan = new Scanner(System.in); 

        System.out.print("Please enter your name = ");
        String name = scan.nextLine(); 
        System.out.print("Please enter your age = ");
        int age = scan.nextInt();

        System.out.println("Your name = "+name);
        System.out.print("Your age = "+age);
    }
}
