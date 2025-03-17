import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        double number1 = Double.parseDouble(st.nextToken());
        double number2 = Double.parseDouble(st.nextToken());
        
        System.out.println(number1 / number2);
    }
}