import java.io.*;
import java.util.*;

/*
2751, 수 정렬하기
 */
public class Silver_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            list.add(Integer.valueOf(br.readLine()));
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for (Integer integer : list) {
            sb.append(integer + "\n");
        }
        System.out.println(sb);
    }
}
