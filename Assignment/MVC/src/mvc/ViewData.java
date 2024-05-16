/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class ViewData extends JFrame {
//    public int id, nim, age;
//    public String name;
//    int totalData;
//    String data[][] = new String[100][4];
//    
//    Connector connector = new Connector();
    
    JLabel lNIM = new JLabel("NIM");
    JLabel lName = new JLabel("Name");
    JLabel lAge = new JLabel("Age");
    JLabel lSearch = new JLabel("Search Name");
    
    JTextField tfNIM = new JTextField();
    JTextField tfName = new JTextField();
    JTextField tfAge = new JTextField();
    JTextField tfSearch = new JTextField();
    
    JButton btnAdd = new JButton("ADD");
    JButton btnUpdate = new JButton("UPDATE");
    JButton btnSearch = new JButton("SEARCH");
    JButton btnRefresh = new JButton("REFRESH");
    
    JFrame window = new JFrame("Read Data Student");
    JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;
    Object columnName[] = {
        "ID", "NIM", "Name", "Age"
    };
    
    public ViewData(){
        tableModel = new DefaultTableModel(columnName,0);
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);
        
        setTitle("Student Data");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(900,400);
        
        add(scrollPane);
        scrollPane.setBounds(20,20,480,300);
        
        add(lNIM);
        lNIM.setBounds(510,100,90,20);
        add(tfNIM);
        tfNIM.setBounds(510,100,90,20);
        
        add(lName);
        lName.setBounds(510,20,90,20);
        add(tfName);
        tfName.setBounds(510,40,120,20);
        
        add(lAge);
        lAge.setBounds(510,100,90,20);
        add(tfAge);
        tfAge.setBounds(510,120,120,20);
        
        add(btnAdd);
        btnAdd.setBounds(510, 190, 90, 20);
        
        add(btnUpdate);
        btnUpdate.setBounds(510, 220, 90, 20);
        
        add(lSearch);
        lSearch.setBounds(710, 20, 90, 20);
        
        add(tfSearch);
        tfSearch.setBounds(710, 40, 90, 20);
        
        add(btnSearch);
        btnSearch.setBounds(710, 70, 90, 20);
        
        add(btnRefresh);
        btnRefresh.setBounds(710, 100, 90, 20);
    }
    
    public String getNIM(){
        return tfNIM.getText();
    }
    
    public String getName(){
        return tfName.getText();
    }
    
    public String getAge(){
        return tfAge.getText();
    }
    
    public String getSearchName(){
        return tfSearch.getText();
    }
}

