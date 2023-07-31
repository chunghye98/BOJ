import java.io.*;
import java.util.*;

/*
10816, 숫자카드2
 */
public class Silver_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());;

        for (int i = 0; i < n; i++) {
            int key = Integer.parseInt(st.nextToken());
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int result;
            try {
                result = map.get(Integer.parseInt(st.nextToken()));
            } catch (NullPointerException e) {
                result = 0;
            }
            sb.append(result).append(" ");
        }
        System.out.println(sb.substring(0, sb.length() - 1));
    }
}
