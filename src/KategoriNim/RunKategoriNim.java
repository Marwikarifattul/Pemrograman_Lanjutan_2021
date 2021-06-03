package KategoriNim;

import javax.swing.*;

    public class RunKategoriNim {
        public static void main(String[] args) {
            JFrame jFrame = new JFrame("Kategori NIM");
            jFrame.setContentPane(new KategoriNim().getRootPanel());
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.setLocationRelativeTo(null);
            jFrame.setSize(500, 400);
            jFrame.setVisible(true);
    }
}
