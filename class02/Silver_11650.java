import java.io.*;
import java.util.*;

/*
11650, 좌표 정렬하기
 */
public class Silver_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        List<MyPoint> points = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            points.add(new MyPoint(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        Collections.sort(points);

        for (MyPoint point : points) {
            System.out.println(point.x + " " + point.y);
        }
    }
}

class MyPoint implements Comparable<MyPoint> {

    int x;
    int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(MyPoint o) {
        if (o.x > this.x) {
            return -1;
        } else if (o.x < this.x) {
            return 1;
        } else {
            return this.y - o.y;
        }
    }
}
