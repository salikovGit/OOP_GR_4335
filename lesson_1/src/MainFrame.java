
import Domen.Product;
import VendingMachine.VendingMachine;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class MainFrame extends JFrame {


    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);
    JTextField tfProductName;


    JLabel lbWelcome;

    public void initialize(ArrayList<Product> products) {

        JLabel lbBoxList = new JLabel("Products list", 0);
        lbBoxList.setFont(mainFont);
        JLabel lbChooseProduct = new JLabel("Choose product");
        lbChooseProduct.setFont(mainFont);
        JTextField tfChooseProduct = new JTextField();
        lbBoxList.setFont(mainFont);
        JLabel blank = new JLabel("");

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(10, 1, 25, 5));
        formPanel.add(lbBoxList);
        formPanel.add(blank);
        String[] productsList = new String[products.size()];
        for (int i = 0; i < products.size(); i++) {
            productsList[i] = products.get(i).getName();
        }

        JComboBox popUpList = new JComboBox<>(productsList);

        for (int i = 0; i < products.size(); i++) {
            JLabel lbProductNames = new JLabel(products.get(i).getName() + " " + products.get(i).getPrice().toString() + " ₽", 10);
            lbProductNames.setFont(mainFont);
            formPanel.add(lbProductNames);
        }


        formPanel.add(blank);
        formPanel.add(lbChooseProduct);
        formPanel.add(popUpList);



        JLabel lbProductName = new JLabel("Product name");
        lbProductName.setFont(mainFont);



        tfProductName = new JTextField();
        tfProductName.setFont(mainFont);


        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);



        JButton btnOk = new JButton("Buy product");
        btnOk.setFont(mainFont);
        btnOk.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {


                String firstName = tfProductName.getText();
                String lastName = tfProductName.getText();
                lbWelcome.setText("Hello " + firstName + " " + lastName);


            }

        });


        JButton btnCancel = new JButton("Cancel");
        btnCancel.setFont(mainFont);
        btnCancel.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                tfProductName.setText("");
                tfProductName.setText("");
                lbWelcome.setText("");

            }

        });


        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonPanel.add(btnOk);
        buttonPanel.add(btnCancel);


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));

        mainPanel.add(formPanel, BorderLayout.NORTH);


        mainPanel.add(lbWelcome, BorderLayout.CENTER);


        mainPanel.add(buttonPanel, BorderLayout.SOUTH);


        add(mainPanel);


        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        formPanel.setOpaque(false);
        buttonPanel.setOpaque(false);


        setTitle("VendingMachines");
        setSize(500, 600);
        setMaximumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

//    public static void main(String[] arg)
//    {
//        MainFrame myFrame = new MainFrame();
//        myFrame.initialize();
//    }

}