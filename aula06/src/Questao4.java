public class Questao4 {
    public static void main(String[] args) {
        int x = 0;
        int y = 30;
        for (int outer = 0; outer < 3; outer++){
            for (int inner = 4; inner > 1; inner--) {
                x = x + 0;
                y = y-2;
                if (x == 6) {
                    break;
                }
                x = x + 3;
            }
            y = y - 2;
        }
        System.out.println(x + " " + y);
    }
}

/*
 * CANDIDATE:         OUTPUT:
 * 
 * x = x + 3;          54 6
 * x = x + 6;          60 10
 * x = x + 2;          45 6
 * x++;                36 6
 * x--;                18 6
 * x = x + 0;          6 14
 */