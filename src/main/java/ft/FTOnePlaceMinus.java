package ft;

import java.util.Random;

public class FTOnePlaceMinus extends BaseFT {
    public FTOnePlaceMinus(String text) {
        super(text);
    }

    /**
     * 个位数减法, 被减数从2到10.
     * 先选择一个被减数, 然后从减数集合中选择一个比被减数小的数
     * @return
     */
    @Override
    public String generate() {
        int[] a1 = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] a2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Random random = new Random();
        int i1 = a1[random.nextInt(a1.length)];
        int i2 = a2[random.nextInt(i1 - 1)]; //
        if (i2 >= i1){
            System.out.println("exception");
            System.exit(0);
        }
        return i1 + " - " + i2 + " = ";
    }
}
