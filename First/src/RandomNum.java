import java.util.Random;
import java.util.Scanner;

public class RandomNum {
    public static void main(String[] args) {

        Random output = new Random();
        System.out.println("Enter the minimum");
        Scanner min = new Scanner(System.in);
        int minInt = min.nextInt();
        System.out.println("Enter the maximum");
        Scanner max = new Scanner(System.in);
        int maxInt = max.nextInt();
        int adjMax = maxInt+1-minInt;
        int x = output.nextInt(adjMax);
        System.out.println("The number is: " + (x+minInt) );

        min.close();
        max.close();
    }
}
