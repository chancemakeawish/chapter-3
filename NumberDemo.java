import java.util.Scanner;

public class NumberDemo
{
    public static void main(String[] args){
       int a = 5;
       int b = 10;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a whole number >>> ");
        a = input.nextInt();
        System.out.print("PLease enter another whole number >>> ");
        b = input.nextInt();


    }
    public static void displayTwiceTheNumber(int a, int b) {
        a = a * 2;
        b = b * 2;
        displayResults("Twice the number is ", a);
        displayResults("Twice the number is ", b);
    }
    public static void displayNumberPlusFive(int y, int z){
        y = y + 5;
        z = z + 5;
        displayResults("Plus 5 to the number ", y);
        displayResults("Plus 5 to the number ", z);

    }
    public static void displayNumberSquared(int c, int d){
        c = c * c;
        d = d * d;
        displayResults("Square the number ", c);
        displayResults("Square the number ", d);
    }
    public static void displayResults(String display, int answer){
        System.out.println(display + answer);
    }
}
