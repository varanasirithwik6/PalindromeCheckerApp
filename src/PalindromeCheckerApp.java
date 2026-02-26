/*
UC1:PalindromeCheckerApp
@author Rithwik
@version 1.0
 */
import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input text: ");
        String name = sc.nextLine();
        boolean isPalindrome = true;
        for(int i=0;i<name.length()/2;i++){
            if(name.charAt(i)!=name.charAt(name.length()-1-i)){
                isPalindrome=false;
                break;
            }
        }
        System.out.print("Is it a Palindrome? : "+isPalindrome);
    }
}
