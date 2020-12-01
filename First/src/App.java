import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Enter the minimum");
        Scanner min = new Scanner(System.in);
        int minInt = min.nextInt();
        System.out.println("Enter the maximum");
        Scanner max = new Scanner(System.in);
        int maxInt = max.nextInt();

        // RandomNum num = new RandomNum();
        RandomNum.main(minInt, maxInt);
        // System.out.println(num);
        min.close();
        max.close();
    }
}




