import java.util.Random;

public class RandomNum {
    public static int main(int minInt, int maxInt) {

        Random output = new Random();
        int adjMax = maxInt+1-minInt;
        int x = output.nextInt(adjMax) + minInt;
        System.out.println("The number is: " + (x) );

        return x;
    }
}
