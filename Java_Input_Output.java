import java.util.Scanner;

// Java program to take input from the user and display it
public class Java_Input_Output {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Create a new object to take input from the user through keyboard.

         // Taking an integer input
         System.out.print("Enter an integer: ");
         int num = input.nextInt();
         
         // Taking a float input
         System.out.print("Enter a float number: ");
         float fnum = input.nextFloat();
         
         // Taking a string input (single word)
         System.out.print("Enter a single word: ");
         String word = input.next();
 
         // Taking a full line input
         input.nextLine();  // Consume leftover newline
         System.out.print("Enter a full sentence: ");
         String sentence = input.nextLine();
 
         // Taking a boolean input
         System.out.print("Enter true or false: ");
         boolean flag = input.nextBoolean();

         //Displaying the User Inputs
         System.out.println("\nYou entered:");
        System.out.println("Integer: " + num);
        System.out.println("Float: " + fnum);
        System.out.println("Word: " + word);
        System.out.println("Sentence: " + sentence);
        System.out.println("Boolean: " + flag);

        // Closing the Scanner object to release the resource.
        input.close();
    }

    
}
