package tasks.t02_triangle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        long a = Long.parseLong(reader.readLine().trim());
        long b = Long.parseLong(reader.readLine().trim());
        long c = Long.parseLong(reader.readLine().trim());

        if (a < b + c && b < a + c && c < a + b) {
            writer.write("YES");
        }
        else writer.write("NO");
        reader.close();
        writer.close();

    }
}
