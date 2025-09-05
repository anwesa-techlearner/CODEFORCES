import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (s == null) return;

        boolean allUpper = true;
        boolean allExceptFirstUpper = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c)) {
                allUpper = false;
            }
            if (i > 0 && Character.isLowerCase(c)) {
                allExceptFirstUpper = false;
            }
        }

        if (allUpper || allExceptFirstUpper) {
            StringBuilder sb = new StringBuilder(s.length());
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isLowerCase(c)) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(Character.toLowerCase(c));
                }
            }
            System.out.println(sb.toString());
        } else {
            System.out.println(s);
        }
    }
}
