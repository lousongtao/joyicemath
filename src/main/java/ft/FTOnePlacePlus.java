package ft;

import java.util.Random;

public class FTOnePlacePlus extends BaseFT {
    public FTOnePlacePlus(String label) {
        super(label);
    }

    @Override
    public String generate() {
        int[] a1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Random random = new Random();
        return a1[random.nextInt(a1.length)] + " + " + a1[random.nextInt(a1.length)] + " = ";
    }
}
