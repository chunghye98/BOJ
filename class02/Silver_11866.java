import java.io.*;
import java.util.*;

/*
11866, 요세푸스 문제 0
 */
public class Silver_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int index = 1;
        while (!queue.isEmpty()) {
            if (index == k) {
                sb.append(queue.poll()).append(", ");
                index = 1;
            } else {
                queue.add(queue.poll());
                index++;
            }
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append(">");
        System.out.println(sb);
    }
}
