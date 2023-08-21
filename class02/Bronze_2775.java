import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
2775, 부녀회장이 될테야
 */
public class Bronze_2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testcase; i++) {
            int k = Integer.parseInt(br.readLine()); // 층
            int n = Integer.parseInt(br.readLine()); // 호

            List<List<Integer>> map = new ArrayList<>();
            for (int m = 0; m <= k; m++) {
                map.add(new ArrayList<>());
            }

            for (int j = 0; j < n; j++) {
                map.get(0).add(j + 1);
            }

            for (int j = 1; j <= k; j++) {
                for (int m = 0; m < n; m++) {
                    if (m == 0) {
                        map.get(j).add(map.get(j - 1).get(m));
                    } else {
                        map.get(j).add(map.get(j).get(m - 1) + map.get(j - 1).get(m));
                    }
                }
            }

            System.out.println(map.get(k).get(n-1));
        }
    }
}
