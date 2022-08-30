package ft;

import java.util.Random;

public class FTTwoDigitMultiOnePlace extends BaseFT {
    public FTTwoDigitMultiOnePlace(String label) {
        super(label);
    }

    @Override
    public String generate() {
        Random random = new Random();
        int a1 = random.nextInt(100);
        if (a1 < 11) return generate();
        int a2 = random.nextInt(10);
        if (a2 < 2) return generate();
        return a1 + " * " + a2 + " = ";
    }
}
