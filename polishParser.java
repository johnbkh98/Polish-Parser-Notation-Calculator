/**
 * Command -line java programs that evaluates NPN formulas
 * Author: John Hayford
 * Last editted: 26.11.2020
 */
/**
 * To Do list *Delete before submision*
 * Use Arraylist to store the inputs
 */
import java.util.Scanner;
public class polishParser {

    private static int calculate(Scanner scan) {
        if (scan.hasNextInt()) {
            return scan.nextInt(); // returning the integer value from scan
        } 
        else { // runs only if the value from scan is not an interger
            String sign = scan.next(); // if input is not an interger then it should be a sign
            int firstNumber = calculate(scan);
            int secNumber = calculate(scan);
            return calculateInputs(sign, firstNumber, secNumber); //returning the calculated inputs
        }
    }

    private static int calculateInputs(String sign, int firstNumber, int secNumber) {
        /**
         * using switch case statement to calculate input based on the sign
         * Better than if else statement and cleaner code
         */
        switch(sign){
            case "x":
                //System.out.println("Test: " + firstNumber * secNumber); //Testing if x if wor555king
                return firstNumber * secNumber; //multiplication calculate
            case "+":         
                return firstNumber + secNumber; //addition 
            case "-":
                return firstNumber - secNumber; //subtraction
            default:
                System.out.println("Enter valid input"); // Prints only if the sign entered is neither x,+,-, 

                return 0;
                
        }
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);// creating a new scanner object
        System.out.println(calculate(scan));  //printing results based on input from scan and calling calculate method on input     
    }
}