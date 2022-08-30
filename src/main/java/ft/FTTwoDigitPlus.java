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
        if (i1 == 0) return generate();
        int i2 = random.nextInt(i1); //
        if (i2 >= i1) return generate();
        if (i2 == 0) return generate();
        if (i1 < 10 || i2 < 10) return generate();
        return i1 + " + " + i2 + " = ";
    }
}
