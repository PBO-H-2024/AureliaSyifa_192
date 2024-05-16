/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Lenovo
 */
public class ControllerData {
    ModelData modelData;
    ViewData viewData;
    
    public ControllerData(ModelData modelData, ViewData viewdata){
        this.modelData = modelData;
        this.viewData = viewData;
        
        if(modelData.getDataAmount()!=0){
            String studentData[][]= modelData.readData();
            viewData.tabel.setModel((new JTable(studentData, viewData.columnName)).getModel());
        }
        else {
            JOptionPane.showMessageDialog(null, "Data Not Found");
        }
        
        viewData.btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                String NIM = viewData.getNIM();
                String Name = viewData.getName();
                String Age = viewData.getAge();
                modelData.insertData(NIM, Name, Age);
                
                String studentData[][]=modelData.readData();
                viewData.tabel.setModel((new JTable(studentData, viewData.columnName)).getModel());
            }
        });
        
        viewData.btnUpdate.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                String NIM = viewData.getNIM();
                String Name = viewData.getName();
                String Age = viewData.getAge();
                modelData.updateData(NIM, Name, Age);
                
                String studentData[][]=modelData.readData();
                viewData.tabel.setModel((new JTable(studentData, viewData.columnName)).getModel());
            }
        });
        
        viewData.btnSearch.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                String Name = viewData.getSearchName();
                
                if(Name.equals("")){
                    JOptionPane.showMessageDialog(null, "Data Kosong");
                }
                else{
                    String studentData[][]=modelData.readData();
                    viewData.tabel.setModel((new JTable(studentData, viewData.columnName)).getModel());
                }
            }
        });
        
        viewData.tabel.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int row = viewData.tabel.getSelectedRow();
                int column = viewData.tabel.getSelectedColumn();
                
                String selectedData = viewData.tabel.getValueAt(row, 1).toString();
                
                System.out.println(selectedData);
            }
        });
    }
}
