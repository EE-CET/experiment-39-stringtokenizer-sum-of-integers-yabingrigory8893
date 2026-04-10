import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenSum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextLine()) return;
            String line = sc.nextLine();
            StringTokenizer st = new StringTokenizer(line);
            int sum = 0;

            while (st.hasMoreTokens()) {
                sum += Integer.parseInt(st.nextToken());
            }

            System.out.println(sum);
        }
    }
}
