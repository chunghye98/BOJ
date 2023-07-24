import java.io.*;
import java.util.Arrays;

/*
4153, 직각삼각형
 */
public class Bronze_4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while (!(input = br.readLine()).equals("0 0 0")) {
            String[] temp = input.split(" ");

            int[] numbers = new int[3];

            for (int i = 0; i < 3; i++) {
                numbers[i] = Integer.parseInt(temp[i]);
            }

            Arrays.sort(numbers);

            if (Math.pow(numbers[2], 2) == Math.pow(numbers[1], 2) + Math.pow(numbers[0], 2)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
