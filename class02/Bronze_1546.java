import java.io.*;

/*
1546, 평균
 */
public class Bronze_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int max = Integer.MIN_VALUE;
        int[] grades = new int[n];
        double[] updateGrades = new double[n];
        String[] split = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(split[i]);
            max = Math.max(temp, max);
            grades[i] = temp;
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            updateGrades[i] = (double) grades[i] / max;
            sum += updateGrades[i];
        }

        System.out.println(sum / n * 100);

    }
}
