import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
2231, 분해합
 */
public class Bronze_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            String[] temp = String.valueOf(i).split("");
            int result = i;
            for (int j = 0; j < temp.length; j++) {
                result += Integer.parseInt(temp[j]);
            }
            if (result == n) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
