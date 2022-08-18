import ft.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainFrame extends JFrame {
    private BaseFT cbOnePlacePlus = new FTOnePlacePlus("One Place Plus"); //个位数加法
    private BaseFT cbOnePlaceMinus = new FTOnePlaceMinus("One Place Minus"); //个位数减法
    private BaseFT cbTenDigitMinusOnePlace = new FTTenDigitMinusOnePlace("Ten Digit Minus One Place"); //20以内十位数减个位数,
    private BaseFT cbBaseDivision = new FTBaseDivision("Base Division"); //乘法口诀表内除法
    private BaseFT cbTenDigitMultiOnePlace = new FTTenDigitMultiOnePlace("Ten Digit Multi One Place"); //两位数乘个位数
    private BaseFT cbThreeDigitPlus = new FTThreeDigitPlus("Three Digit Plus"); //三位数加法
    private BaseFT cbThreeDigitMinus = new FTThreeDigitMinus("Three Digit Minus");//三位数减法
    //三位数除个位数


    private JButton btnGen = new JButton("Generate");
    private final int AMOUNT = 100; // question amount
    public MainFrame(){
        initUI();
    }

    private void initUI() {
        Container c = this.getContentPane();
        c.setLayout(new GridLayout(0, 2));
        c.add(cbOnePlacePlus);
        c.add(cbOnePlaceMinus);
        c.add(cbTenDigitMinusOnePlace);
        c.add(cbBaseDivision);
        c.add(cbTenDigitMultiOnePlace);
        c.add(cbThreeDigitPlus);
        c.add(cbThreeDigitMinus);
        c.add(btnGen);
        btnGen.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generate();
            }
        });
    }

    private void generate(){
        List<BaseFT> ftList = new ArrayList<>();
        if (cbOnePlacePlus.isSelected()) ftList.add(cbOnePlacePlus);
        if (cbOnePlaceMinus.isSelected()) ftList.add(cbOnePlaceMinus);
        if (cbTenDigitMinusOnePlace.isSelected()) ftList.add(cbTenDigitMinusOnePlace);
        if (cbBaseDivision.isSelected()) ftList.add(cbBaseDivision);
        if (cbTenDigitMultiOnePlace.isSelected()) ftList.add(cbTenDigitMultiOnePlace);
        if (cbThreeDigitPlus.isSelected()) ftList.add(cbThreeDigitPlus);
        if (cbThreeDigitMinus.isSelected()) ftList.add(cbThreeDigitMinus);
        if (ftList.isEmpty()) return;
        Random random = new Random();
        for (int i = 0; i < AMOUNT; i++) {
            BaseFT ft = ftList.get(random.nextInt(ftList.size()));
            System.out.println("(" + (i + 1) + ") " + ft.generate());
        }
    }

    public static void main(String[] args) {
        MainFrame mf = new MainFrame();
        mf.setLocation(300, 300);
        mf.setSize(300, 300);
        mf.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        mf.setVisible(true);
    }
}
