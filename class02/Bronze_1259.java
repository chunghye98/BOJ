import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while (!(input = br.readLine()).equals("0")) {
            boolean flag = true;
            for (int i = 0; i < input.length() / 2; i++) {
                if (!(input.charAt(i) == input.charAt(input.length() - 1 - i))) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
