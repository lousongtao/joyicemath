package ft;

import java.util.Random;

public class FTBaseDivision extends BaseFT {
    public FTBaseDivision(String label) {
        super(label);
    }

    @Override
    public String generate() {
        int[] a1 = new int[]{2, 3, 4, 5, 6, 7, 8, 9};
        Random random = new Random();
        int a = a1[random.nextInt(a1.length)];
        int b = a1[random.nextInt(a1.length)];
        return (a * b) + " ÷ " + a + " = ";
    }
}
