package ABCTech;

public class O5_Case_Conversion {
    public static void main(String[] args) {

        String str = "akilan";
        int size = str.length();
        char x[] = str.toCharArray();

        for (int i = 0; i < size; i++) {
            x[i] = (char) (x[i] - 32);
        }
        System.out.println(new String(x));

    }
}


// a 97
// A 65 32

// b 98
// B 66 32