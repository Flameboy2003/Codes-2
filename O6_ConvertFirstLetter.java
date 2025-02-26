package ABCTech;

public class O6_ConvertFirstLetter {
    public static void main(String[] args) {

        String s = "anna university regional campus";
        int size = s.length();

        char x[] = s.toCharArray();
        x[0] = (char) (x[0] - 32);

        for (int i = 0; i < size; i++) {
            if (x[i] == ' ') {
                x[i + 1] = (char) (x[i + 1] - 32);
            }
        }
        System.out.println(s);
        System.out.println(x);
    }
}
