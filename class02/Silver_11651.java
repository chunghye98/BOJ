import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/*
11651, 좌표 정렬하기2
 */
public class Silver_11651 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		List<CustomPoint> points = new ArrayList<>();
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			points.add(new CustomPoint(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}

		Collections.sort(points);

		for (CustomPoint point : points) {
			System.out.println(point.x + " " + point.y);
		}
	}
}

class CustomPoint implements Comparable<CustomPoint> {
	int x;
	int y;

	public CustomPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(CustomPoint o) {
		if (o.y > this.y) {
			return -1;
		} else if (o.y == this.y) {
			if (o.x > this.x) {
				return -1;
			}
		}
		return 1;
	}
}
