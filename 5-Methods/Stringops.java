/* A program to take a string input, search for a caharacter and reverse it and convert to lowercase */

import java.util.Scanner;
public class Stringops {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an String of min 6 char: ");
        String text = scanner.nextLine();
        int textLength = text.length();

        // if(text.length() < 6){

        // }

        System.out.print("Enter the character to search for : ");
        char searchCharacter = scanner.nextLine().charAt(0);
        int searchResult = text.indexOf(searchCharacter);
        if (searchResult < 1){
            System.out.println("search character not found");
        }else{
            System.out.println("Index of " + searchCharacter + " in the given string is " + searchResult);
        }

        // Reverse the string and convert to lowercase
        char[] textArray = text.toCharArray();
        char[] reversedTextArray = new char[textLength];

        for(int i = textLength - 1, j = 0; (i >= 0) && (j <= textLength - 1); i--, j++){
           reversedTextArray[j] = textArray[i];
        }

        String reversedText = new String(reversedTextArray);
        System.out.println("Reversed Text: " + reversedText);

        System.out.println("Lower case : " + reversedText.toLowerCase());

        scanner.close();
    }

}
