import java.util.Scanner;
public class TryCatchParsing {
    public static void main(String [] args) {

        System.out.println("enter a number between 1 and 10");
        int num = getNum();
        while(!(num > 0 && num <= 10)) {
            System.out.println("invalid");
            System.out.println("enter a number between 1 and 10");
            num = getNum();
        }
        System.out.println("you entered " + num);
    }

    public static int getNum() {
        int num = -1;
        try{
            Scanner s = new Scanner(System.in);
            String inputString = s.nextLine();
            num = Integer.parseInt(inputString);
        }
        catch(Exception e) {
            System.out.println("not a number");
        }
        return num;

    }
}
