package ft;

import javax.swing.*;
import java.util.Random;

public class FTThreeDigitPlus extends BaseFT {
    public FTThreeDigitPlus(String label) {
        super(label);
    }

    @Override
    public String generate() {
        Random random = new Random();
        int i1 = random.nextInt(1000);
        if (i1 < 100) return generate();
        int i2 = random.nextInt(1000);
        if (i2 < 100) return generate();
        return i1 + " + " + i2 + " = ";
    }
}
