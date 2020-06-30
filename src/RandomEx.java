import java.util.Random;

public class RandomEx {
    public static void main(String[] args) {

        Random random = new Random();

        int random1 = random.nextInt(10);
        int random2 = random.nextInt(10);

        System.out.println(random1);
        System.out.println(random2);
    }

}
