package tasks.t01_problems_count;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());

        BigInteger result = BigInteger.ZERO;
        while (stringTokenizer.hasMoreTokens()) {
            String token = stringTokenizer.nextToken();
            result = result.add(new BigInteger(token));
        }

        writer.write(result.toString());
        reader.close();
        writer.close();

    }
}
