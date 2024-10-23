package Task.Task_22102024;

import java.util.Scanner;

public class Task22_3_PalindromString {
    public static void main(String[] args) {
        System.out.println("Enter the string to check the palindrome");

        String str;
        Scanner scanner = new Scanner(System.in);
        str = scanner.next().toLowerCase();
        String org_string = str;
        String rev = "";

        int len = str.length();
        for(int i = len-1; i >=0; i-- ){
            rev = rev+str.charAt(i);
        }

        if (org_string == rev){
            System.out.println(rev +" is a Palindrome string ");
        }
        else{
            System.out.println(rev + " is not a Palindrome string");
        }
    }
}
