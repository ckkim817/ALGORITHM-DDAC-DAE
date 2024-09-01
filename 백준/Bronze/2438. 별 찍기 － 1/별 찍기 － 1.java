import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            bw.write("*".repeat(i));
            bw.newLine();
        }

        sc.close();
        bw.flush();
        bw.close();
    }
}
