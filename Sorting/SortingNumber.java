package Sorting;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SortingNumber {
    private JTextField textNumber1;
    private JButton buttonEnter;
    private JPanel rootPanel;
    private JTable tableInput;
    private JButton buttonSorting;
    private JTable tableHasil;
    private DefaultTableModel tableModel;
    private DefaultTableModel tableModel2;


    public JPanel getRootPanel() {
        return rootPanel;
    }

    public SortingNumber() {
        this.initComponents();
        buttonEnter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String number = textNumber1.getText();
                if(number.isEmpty()){
                    JOptionPane.showMessageDialog(rootPanel,
                            "Angka belum dimasukkan",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }else
                tableModel.addRow(new Object[]{number});
                //clear textfields
                textNumber1.setText("");
            }
        });
        this.initComponents2();
        buttonSorting.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                tableModel2.addRow(new Object[]{});
            }
        });
    }

    private void initComponents() {
        Object[] tablecolom = {
                "Number"
        };
        Object[][] initData = {

        };
        tableModel = new DefaultTableModel(initData, tablecolom);
        //set table model
        tableInput.setModel(tableModel);
    }

    private void initComponents2(){
        Object[] tablecolom2 = {
                "Ascending",
                "Descending"
        };
        Object[][] initData2 = {

        };
        tableModel2 = new DefaultTableModel(initData2, tablecolom2);
        //set table model
        tableHasil.setModel(tableModel2);
    }
}
