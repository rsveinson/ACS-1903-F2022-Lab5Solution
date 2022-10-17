/**
 * ACS-1903 Lab5 Q7
 *
 * @author (your name and student number)
 */

import java.util.Scanner;

public class SumOfNkey{
    public static void main(String[] args) {
        int n, sum;     // n input from the keyboard, sum well it's obvious
        
        // write your code here
        Scanner scanner = new Scanner(System.in);
        
        // make sure to set sum to 0 before the for loop
        sum = 0;
        
        // get the value of n from the keyborad
        System.out.println("Enter a number.");
        n = scanner.nextInt();
        
        /* iterate from one to n, from 0 to n would also
         * work but it's not quite as efficient
         * 
         * note that unlike most of our for loops we go to 
         * <= n not < n
         */
        for(int i = 1; i <= n; i++){
            sum += i;
        }// end for
        
        // print the summary of results
        System.out.println("The sum of first " + n + " numbers is " + sum);
    }// end main
}// end class
