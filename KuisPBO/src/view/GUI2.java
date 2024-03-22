/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.*;

/**
 *
 * @author Lenovo
 */
public class GUI2 extends JFrame {
    JLabel status2 = new JLabel ("NOT ACCEPTED");
    public GUI2(){
        setTitle("Status");
        setSize(350,200);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(status2);
        status2.setBounds(10, 10, 120, 20);
    }
}
