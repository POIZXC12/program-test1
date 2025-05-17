
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        //String input = br.readLine();
        //int a = Integer.parseInt(br.readLine());

        String input = br.readLine();

        int[] alphabet = new int[26];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                alphabet[ch - 'A']++;
            }
            else if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a']++;
            }
        }

        int max = -1;
        char result = '?';

        for (int i = 0; i < 26; i++) {
            if (alphabet[i] > max) {
                max = alphabet[i];
                result = (char) (i + 'A');
            } else if (alphabet[i] == max) {
                result = '?';
            }
        }

        System.out.println(result);


        br.close();
    }
}