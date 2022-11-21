/**
 * Caluclates if "g" generates the whole group Z_p^*
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println("----------Start Test----------");
        int p = 19;
        //int[] values = new int[19];
        int i = 9;
        for (int g = 0; g < p; g++) {
            findStuff(p, g);
            System.out.println(g + "^" + i + " mod " + p + " = " + findStuff(p, g)[i]);
        }
        
        
        /*
        int p = 19;
        int g = 12;
        int[] values = new int[p];
        values[0] = 1;
        System.out.println("----------Start Test----------");
        System.out.println(g + "^" + 0 + " mod " + p + " = " + values[0]);
        for (int i = 1; i < p; i++) {
            values[i] = (values[i-1]*g) % p;
            System.out.println(g + "^" + i + " mod " + p + " = " + values[i]);
        }*/
    }

    public static int[] findStuff(int p, int g){
        int[] values = new int[p];
        values[0] = 1; //g^0 = 1
        for (int i = 1; i < p; i++) {
            values[i] = (values[i-1]*g) % p;
        }
        return values;
    }
}