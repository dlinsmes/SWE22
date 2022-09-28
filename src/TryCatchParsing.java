import java.util.Scanner;
public class TryCatchParsing {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);

        int num = -1;

        boolean valid = false;
        while(!valid) {
            try{
                System.out.println("enter a number between 1 and 10");
                String inputString = s.nextLine();
                num = Integer.parseInt(inputString);
                if (num > 0 && num <= 10)
                    valid = true;
                else
                    System.out.println("input out of range");
            }
            catch(Exception e) {
                System.out.println("not a valid integer");
            }
        }

        System.out.println("you entered " + num);

    }
}
