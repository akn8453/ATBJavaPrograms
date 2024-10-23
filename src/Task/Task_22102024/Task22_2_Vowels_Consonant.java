package Task.Task_22102024;

import java.util.Scanner;

public class Task22_2_Vowels_Consonant {
    public static void main(String[] args) {

        System.out.println("Enter the String to count the Vowels & Consonant");
        String str;
        int count = 0;
        int vowels = 0;
        int consonant = 0;
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine().toLowerCase();
        for(int i = 0; i < str.length(); i++ ){
            if(str.charAt(i)!=' '){
                count++;
            if (str.charAt(i) == 'a'|| str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ){
                vowels++;
            }else if (str.charAt(i) > 'a' && str.charAt(i) < 'z'){
                consonant++;
            }
            else{
                System.out.println("Invalid Input! Please Enter the string");
                System.out.println();
            }
            }

        }
        System.out.println("Total char in the string are "+count);
        System.out.println("Total vowels in the string are "+vowels);
        System.out.println("Total consonant in the string are "+consonant);



    }
}
