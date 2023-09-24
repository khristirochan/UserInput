import java.util.Scanner;

public class AskName2 {

    public static void main(String[] args) 
    {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("What is your name?");
        String userName = in.nextLine();
       
        if (userName.isEmpty()) 
        {
            System.out.println("Error");
        } 
        else
        {
            System.out.println("Your name is " + userName+".");
        }

        in.close();
    }
}