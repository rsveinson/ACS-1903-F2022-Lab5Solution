import javax.swing.JOptionPane;

/**
 * ACS-1903 Lab5 Q6
 *
 * @author (your name and student number)
 */

public class PalindromKey{
    public static void main(String[] args) {
        String userInput = "racecar";
        boolean palindrome = true;
        String message;
        int l;
        
        // get user input using JOP
        userInput = JOptionPane.showInputDialog("enter a word for palindrom checking.");
        l = userInput.length();
        
        // convert input string to lower case
        userInput = userInput.toLowerCase();
        
        /* iterate through the input string
         * comparing each character, first and last, second and second last
         * and so on. if the characters don't match set the boolean
         * variable palindrome to false (because if any characters dont match
         * the word is not a palindrome)
         * 
         * Be careful here, an if-else that sets palindrom to false if they
         * don't match and true if they do won't work. Can you think of why?
         */
        for(int i = 0; i < l / 2; i++){
            System.out.println(userInput.charAt(i) + ", " + userInput.charAt(l - 1 - i));
            
            // if the characters don't match it's not a palindrom
            if(userInput.charAt(i) != userInput.charAt(l - 1 - i)){
                palindrome = false;
            }// end if
        }// end for
        
        // set the message for the output JOP
        if(palindrome)
            message =  "The given word is a palindrome";
        else
            message = "The given word is not a palindrome";
        
        // Open a JOP and print the appropriate message.
        JOptionPane.showMessageDialog(null, message);
    }//end main
}// end class
