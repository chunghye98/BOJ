import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
2292, 벌집
- 가운데 1
- 첫번째 테두리 개수: 6
- 두번째 테두리 개수: 12
- 세번째 테두리 개수: 18
- 네번째 테두리 개수: 24
6의 배수
 */
public class Bronze_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        int count = 1;
        int range = 2;
        if (input == 1) {
            System.out.println(1);
        } else {
            while (range <= input) {
                range = range + (6 * count);
                count++;
            }
            System.out.println(count);
        }
    }
}
