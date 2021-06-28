package RestockBarang;

import javax.swing.*;

public class RunStock {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("Restock Barang");
        jFrame.setContentPane(new Stock().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500,400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}
