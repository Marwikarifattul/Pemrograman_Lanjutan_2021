package RestockBarang;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Stock {
    private JPanel rootPanel;
    private JTable tableHasil;
    private JTextField textNama;
    private JTextField textJumlah;
    private JButton buttonInput;
    private DefaultTableModel tableModel;

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public Stock() {
        this.initComponents();
        buttonInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String nama = textNama.getText();
                String jumlah = textJumlah.getText();
                if(nama.isEmpty()||jumlah.isEmpty()) {
                    JOptionPane.showMessageDialog(rootPanel,
                            "Data belum lengkap",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }else{
                    tableModel.addRow(new Object[]{nama,jumlah});
                    textNama.setText("");
                    textJumlah.setText("");
                }
            }
        });
    }

    private void initComponents(){
        Object[] tableColom = {
                "Nama Barang",
                "Jumlah Barang (/Lusin)"
        };
        Object[][] initData = {

        };
        tableModel = new DefaultTableModel(initData, tableColom);
        //set table model
        tableHasil.setModel(tableModel);
        //Sorting disetiap kolom
        tableHasil.setAutoCreateRowSorter(true);
        tableHasil.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
}
