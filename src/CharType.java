public class CharType {
    public static void main(String [] args) {

        //char is a primitive data type used to hold
        //singular character values - use single quotes
        char letter = 'A';

        //each character maps to an int value according
        //to ASCII encoding - https://www.alpharithms.com/ascii-table-512119/

        //a char can be interpreted as an int, where
        //the int is the ascii value
        int ascii = (int)(letter);
        System.out.println(letter + "'s ascii value: " + ascii);

        //an int can be cast to a char -
        //find the letter offset by 4 from A
        char let2 = (char)('A' + 4);
        System.out.println("4 letters after A is " + let2);

        //convert Strings between lowercase and uppercase;
        String lowerWord = "cat";
        String upperWord = lowerWord.toUpperCase();

        //get a char from a String - use charAt() with index
        char thirdLet = upperWord.charAt(2);
        System.out.println("The third letter of \"" + lowerWord + "\" is " + (thirdLet-'A') + " letters away from A");

        System.out.println();
        //test if chars in a String are letters
        String pw = "pAs5w0rD123";
        for (int i = 0; i < pw.length(); i++) {
            char character = pw.toUpperCase().substring(i, i+1).charAt(0);
            if (character >= 'A' && character <= 'Z')
                System.out.println(pw.charAt(i) + " is a letter");
            else
                System.out.println(pw.charAt(i) + " is not a letter");
        }


    }
}
