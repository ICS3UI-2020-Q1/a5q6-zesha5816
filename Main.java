import java.util.Scanner;
/**
 *program so that instead of printing a single row of stars, it prints a box of stars instead!
 * @author Ahmad Zeshan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create the Scanner
		Scanner input = new Scanner(System.in);
		//output the message to the user
		System.out.println("Please enter a number between 1 and 10");
		//get input form user
		int userInput = input.nextInt();
		//increases value of i by an increment of 1 and keeps going until is reaches the userInput
		for (int i = 0; i < userInput; i++){
			//insert 5 stars per line
			for (int j=0; j < userInput; j++ ){
				System.out.print("*");
			}
			//move one line over 
			System.out.println("");
		}
  }
}
