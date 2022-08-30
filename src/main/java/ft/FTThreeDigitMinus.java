package ft;

import java.util.Random;

public class FTThreeDigitMinus extends BaseFT {
    public FTThreeDigitMinus(String label) {
        super(label);
    }

    @Override
    public String generate() {
        Random random = new Random();
        int i1 = random.nextInt(1000);
        if (i1 < 100) return generate();
        int i2 = random.nextInt(i1);
        return i1 + " - " + i2 + " = ";
    }
}
