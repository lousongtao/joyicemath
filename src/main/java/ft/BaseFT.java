package ft;

import javax.swing.JCheckBox;

public class BaseFT extends JCheckBox implements FormulaType {
    public BaseFT(String label) {
        super(label);
    }

    @Override
    public String generate() {
        return null;
    }
}
