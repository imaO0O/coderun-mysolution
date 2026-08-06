package tasks.t03_neighbours;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Long> longArrayList = new ArrayList<>();
        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
        while (stringTokenizer.hasMoreTokens()) {
            String token = stringTokenizer.nextToken();
            longArrayList.add(Long.parseLong(token));
        }
        int result = 0;
        for (int i = 1; i < longArrayList.size() - 1; i++) {
            if (longArrayList.get(i) > longArrayList.get(i-1) && longArrayList.get(i) > longArrayList.get(i+1)) {
                result += 1;
            }
        }
        writer.write(""+ result);
        reader.close();
        writer.close();

    }
}