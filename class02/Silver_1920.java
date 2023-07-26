
import java.io.*;
import java.util.*;

/*
1920, 수 찾기
- 이분탐색 사용 문제
- O(nlogn)이 되어야 한다.
 */
public class Silver_1920 {

    private static List<Integer> listA;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        listA = new ArrayList<>();
        String[] tempA = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            listA.add(Integer.parseInt(tempA[i]));
        }

        Collections.sort(listA);

        int m = Integer.parseInt(br.readLine());
        String[] tempB = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            System.out.println(binarySearch(Integer.parseInt(tempB[i]), 0, n));
        }
    }

    private static int binarySearch(int value, int start, int end) {
        int criteria = (end + start) / 2;

        if (end - start == 1) {
            if (listA.get(start) != value) {
                return 0;
            }
        }

        if (listA.get(criteria) == value) {
            return 1;
        } else if (listA.get(criteria) > value) {
            return binarySearch(value, start, criteria);
        } else {
            return binarySearch(value, criteria, end);
        }
    }
}
