package KategoriNim;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KategoriNim {
    private JTextField textNama;
    private JTextField textNim;
    private JButton buttonPencarian;
    private JPanel rootPanel;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;

    public KategoriNim() {
        buttonPencarian.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //Mengambil text dari Nama
                String nama = textNama.getText();
                //Mengambil text dari Nim
                String nim = textNim.getText();
                //Memproses
                Nim nim1 = new Nim();
                nim1.setNama(nama);
                nim1.setNim(nim);
                //Hasil Di Form
                label1.setText("Jenjang Pendidikan : "+nim1.getJenjangPendidikan());
                label2.setText("Tahun Masuk : "+nim1.getTahunMasuk());
                label3.setText("Fakultas : "+nim1.getFakultas());
                label4.setText("Jurusan : "+nim1.getJurusan());
                label5.setText("Jenis Kelamin : "+nim1.getJenisKelamin());
                label6.setText("Nomor Urut : "+nim1.getNoUrut());
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}