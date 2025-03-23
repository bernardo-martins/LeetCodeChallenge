
public class Main {

    public static String addBinary(String a, String b) {
        int resA = 0;
        char[] arrayA = a.toCharArray();
        for(int i = 0; i < arrayA.length; i++) {
            if(arrayA[i] != '0')
                resA+=Math.pow(2,i);
        }

        int resB = 0;
        char[] arrayB = b.toCharArray();
        for(int i = 0; i < arrayB.length; i++) {
            if(arrayB[i] != '0')
                resB+=Math.pow(2,i);
        }
        int res = resA+resB;
        return Integer.toBinaryString(res);
    }


    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));

    }
}