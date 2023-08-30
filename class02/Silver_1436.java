import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1436, 영화감독 숌
- 브루트포스 문제
 */
public class Silver_1436 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int count = 0;
		int index = 0;
		while (count < n) {
			index++;
			if (String.valueOf(index).contains("666")) {
				count++;
			}

			if (count == n) {
				System.out.println(index);
				return;
			}
		}
	}
}
