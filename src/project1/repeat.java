package project1;

public class repeat {

    public static void main(String[] args) {
        String s = "programming";
        int m = 0;
        for (int i = 0; i < s.length()-1; i++) {
            for (int j = i+1; j < s.length(); j++) {

                if (s.charAt(i) == s.charAt(j)) {

                    System.out.println(s.charAt(j));
                    m = m + 1;
                    break;
                }

            }
            if ( m > 0) break;
        }
    }

}
