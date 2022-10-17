import javax.swing.JOptionPane;

/**
 * ACS-1903 Lab5 Q6
 *
 * @author (your name and student number)
 */

public class PalindromKeyV2{
    public static void main(String[] args) {
        String userInput = "racecar";
        boolean palindrome = true;
        String message = "";
        String reverse = "";
        int l;
        
        // get user input using JOP
        userInput = JOptionPane.showInputDialog("enter a word for palindrom checking.");
        l = userInput.length();
        
        // convert input string to lower case
        userInput = userInput.toLowerCase();
        
        /* create a mirror image of the input string
         * by iterating over the whole word and recording the 
         * word's characters in revers order
         * 
         * the tricky part here is computing the offset i.e.
         * input.charAt(0) has to go into index length - 1
         */
        for(int i = 0; i < l; i++){
            // charAt(length -1 -i will get the characters
            // from the other end of the word
            reverse += userInput.charAt(l - 1 - i);            
        }// end for
        
        // set the message for the output JOP
        if(userInput.equals(reverse))
            message =  "The given word is a palindrome";
        else
            message = "The given word is not a palindrome";
        
        // Open a JOP and print the appropriate message.   
        JOptionPane.showMessageDialog(null, message);
    }// end main
}// end  lass
