package ft;

import java.util.Random;

public class FTTwoDigitMinus extends BaseFT {
    public FTTwoDigitMinus(String text) {
        super(text);
    }

    @Override
    public String generate() {
        Random random = new Random();
        int i1 = random.nextInt(100);
        if (i1 < 10) return generate(); //如果随机数小于10, 就重新生成
        int i2 = random.nextInt(i1); //
        if (i2 == 0) return generate();
        if (i1 < 10 || i2 < 10) return generate();
        if (i2 >= i1) return generate();
        return i1 + " - " + i2 + " = ";
    }
}
