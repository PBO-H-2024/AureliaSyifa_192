/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.CandidateController;
import Model.Candidate;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

public class MainView extends JFrame {
    private CandidateController controller;
    private JTextField nameField, writingScoreField, codingScoreField, interviewScoreField;
    private JComboBox<String> pathField;
    private JTable table;
    private DefaultTableModel tableModel;

    public MainView() {
        controller = new CandidateController();

        setTitle("Recruitment System");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(6, 2));

        formPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        formPanel.add(nameField);

        formPanel.add(new JLabel("Path:"));
        pathField = new JComboBox<>(new String[]{"Android Developer", "Web Developer"});
        formPanel.add(pathField);

        formPanel.add(new JLabel("Writing Score:"));
        writingScoreField = new JTextField();
        formPanel.add(writingScoreField);

        formPanel.add(new JLabel("Coding Score:"));
        codingScoreField = new JTextField();
        formPanel.add(codingScoreField);

        formPanel.add(new JLabel("Interview Score:"));
        interviewScoreField = new JTextField();
        formPanel.add(interviewScoreField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    addCandidate();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        buttonPanel.add(addButton);

        JButton updateButton = new JButton("Update");
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    updateCandidate();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        buttonPanel.add(updateButton);

        JButton deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    deleteCandidate();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        buttonPanel.add(deleteButton);

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearForm();
            }
        });
        buttonPanel.add(clearButton);

        add(formPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        tableModel = new DefaultTableModel(new String[]{"Name", "Path", "Writing Score", "Coding Score", "Interview Score", "Final Score", "Status"}, 0);
        table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.SOUTH);

        try {
            loadCandidates();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void addCandidate() throws SQLException {
        String name = nameField.getText();
        String path = (String) pathField.getSelectedItem();
        float writingScore = Float.parseFloat(writingScoreField.getText());
        float codingScore = Float.parseFloat(codingScoreField.getText());
        float interviewScore = Float.parseFloat(interviewScoreField.getText());

        float finalScore = calculateFinalScore(path, writingScore, codingScore, interviewScore);
        String status = finalScore >= 85 ? "ACCEPTED" : "NOT ACCEPTED";

        Candidate candidate = new Candidate(name, path, writingScore, codingScore, interviewScore, finalScore, status);
        controller.addCandidate(candidate);
        loadCandidates();
    }

    private void updateCandidate() throws SQLException {
        String name = nameField.getText();
        String path = (String) pathField.getSelectedItem();
        float writingScore = Float.parseFloat(writingScoreField.getText());
        float codingScore = Float.parseFloat(codingScoreField.getText());
        float interviewScore = Float.parseFloat(interviewScoreField.getText());

        float finalScore = calculateFinalScore(path, writingScore, codingScore, interviewScore);
        String status = finalScore >= 85 ? "ACCEPTED" : "NOT ACCEPTED";

        Candidate candidate = new Candidate(name, path, writingScore, codingScore, interviewScore, finalScore, status);
        controller.updateCandidate(candidate);
        loadCandidates();
    }

    private void deleteCandidate() throws SQLException {
        String name = nameField.getText();
        controller.deleteCandidate(name);
        loadCandidates();
    }

    private void loadCandidates() throws SQLException {
        tableModel.setRowCount(0);
        List<Candidate> candidates = controller.getAllCandidates();
        for (Candidate candidate : candidates) {
            tableModel.addRow(new Object[]{
                candidate.getName(),
                candidate.getPath(),
                candidate.getWritingScore(),
                candidate.getCodingScore(),
                candidate.getInterviewScore(),
                candidate.getFinalScore(),
                candidate.getStatus()
            });
        }
    }

    private void clearForm() {
        nameField.setText("");
        pathField.setSelectedIndex(0);
        writingScoreField.setText("");
        codingScoreField.setText("");
        interviewScoreField.setText("");
    }

    private float calculateFinalScore(String path, float writingScore, float codingScore, float interviewScore) {
        if (path.equals("Android Developer")) {
            return (writingScore * 0.2f) + (codingScore * 0.5f) + (interviewScore * 0.3f);
        } else {
            return (writingScore * 0.4f) + (codingScore * 0.35f) + (interviewScore * 0.25f);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }
}
