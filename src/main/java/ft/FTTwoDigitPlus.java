package ft;

import java.util.Random;

public class FTTwoDigitPlus extends BaseFT {
    public FTTwoDigitPlus(String text) {
        super(text);
    }

    @Override
    public String generate() {
        Random random = new Random();
        int i1 = random.nextInt(100);
        int i2 = random.nextInt(i1 > 0 ? i1 : 1); //
        if (i2 >= i1){
            System.out.println("exception");
            System.exit(0);
        }
        return i1 + " + " + i2 + " = ";
    }
}
