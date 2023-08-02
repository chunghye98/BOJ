import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
1018, 체스판 다시 칠하기
- 풀이 방법이 생각이 안 나서 블로깅함(https://st-lab.tistory.com/101)
- 경우의 수 = 2 * (가로 칸 개수 - 7) * (세로 칸 개수 - 7)
- 2 : 첫 칸이 검은색일 경우와 첫 칸이 하얀색일 경우 올바르게 색칠하기 위해 변경되어야 할 색들의 개수
 */
public class Silver_1018 {

    private static int min = 64;
    private static Boolean[][] chessBoard;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        chessBoard = new Boolean[n][m];

        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                if (split[j].equals("W")) {
                    chessBoard[i][j] = true;
                } else {
                    chessBoard[i][j] = false;
                }
            }
        }

        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                find(i, j);
            }
        }
        System.out.println(min);
    }

    private static void find(int y, int x) {
        int endX = x + 8;
        int endY = y + 8;
        int count = 0;

        boolean before = chessBoard[y][x];

        for (int i = y; i < endY; i++) {
            for (int j = x; j < endX; j++) {
                if (!chessBoard[i][j].equals(before)) {
                    count++;
                }
                before = !before;
            }
            before = !before;
        }
        count = Math.min(count, 64 - count);
        min = Math.min(min, count);
    }
}
