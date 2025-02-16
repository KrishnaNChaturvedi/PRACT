import java.util.Scanner;

import static java.lang.System.exit;

public class PRIME
{
    static boolean prime(int input) {
        if (input == 0 || input == 1) {
            System.out.println(input +" inside the IF==1: False");
            return false;
        }
        if (input == 2) {
            System.out.println(input +" inside the IF==2: true");
            return true;
        }
        for(int i=2; i <= input/2; i++) {
            System.out.println("Value of " + i + "Value of " + input);
            if(input%i==0) {
                System.out.println(input +"-" +i + " inside the loop: true");
                return false;
            }
        }
        return true;
    }
public static void main(String args[]){
        System.out.println("ENTER Number:");
        Scanner obj= new Scanner(System.in);
        int i = obj.nextInt();
        System.out.println("Final Result" +prime(i));
    }
}
