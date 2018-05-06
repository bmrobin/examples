package bmrobin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HelloWorldRandom {

    public static void main(String ... args) {
        List<String> helloWorld = List.of("h", "e", "l", "l", "o", ",", "w", "o", "r", "l", "d", "!" );
        List<String> operate = new ArrayList<>();

        Random random = new Random();
        int counter = 0;

        do {
            String character = helloWorld.get(random.nextInt(helloWorld.size()));

            if (helloWorld.get(counter).equals(character)) {
                operate.add(character);
                counter++;
                System.out.println(operate.toString());
            }
        } while (!helloWorld.equals(operate));

        System.out.println();
        System.out.println(helloWorld.toString());
    }
}
