/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Candidate;
import Util.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class CandidateController {
    public void addCandidate(Candidate candidate) throws SQLException {
        String query = "INSERT INTO recruitment (name, path, writing_score, coding_score, interview_score, final_score, status) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, candidate.getName());
            statement.setString(2, candidate.getPath());
            statement.setFloat(3, candidate.getWritingScore());
            statement.setFloat(4, candidate.getCodingScore());
            statement.setFloat(5, candidate.getInterviewScore());
            statement.setFloat(6, candidate.getFinalScore());
            statement.setString(7, candidate.getStatus());
            statement.executeUpdate();
        }
    }

    public void updateCandidate(Candidate candidate) throws SQLException {
        String query = "UPDATE recruitment SET path = ?, writing_score = ?, coding_score = ?, interview_score = ?, final_score = ?, status = ? WHERE name = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, candidate.getPath());
            statement.setFloat(2, candidate.getWritingScore());
            statement.setFloat(3, candidate.getCodingScore());
            statement.setFloat(4, candidate.getInterviewScore());
            statement.setFloat(5, candidate.getFinalScore());
            statement.setString(6, candidate.getStatus());
            statement.setString(7, candidate.getName());
            statement.executeUpdate();
        }
    }

    public void deleteCandidate(String name) throws SQLException {
        String query = "DELETE FROM recruitment WHERE name = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, name);
            statement.executeUpdate();
        }
    }

    public List<Candidate> getAllCandidates() throws SQLException {
        List<Candidate> candidates = new ArrayList<>();
        String query = "SELECT * FROM recruitment";
        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                Candidate candidate = new Candidate(
                    resultSet.getString("name"),
                    resultSet.getString("path"),
                    resultSet.getFloat("writing_score"),
                    resultSet.getFloat("coding_score"),
                    resultSet.getFloat("interview_score"),
                    resultSet.getFloat("final_score"),
                    resultSet.getString("status")
                );
                candidates.add(candidate);
            }
        }
        return candidates;
    }
}
