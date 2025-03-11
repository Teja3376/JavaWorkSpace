package com.studenttribe.java.jdbc.mysql;
/*
 CREATE TABLE employees (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    department VARCHAR(50) NOT NULL,
    salary DECIMAL(10, 2) NOT NULL
);
 * 
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcBatchUpdateExample {

    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/studenttribedb";
        String username = "root";
        String password = "root";

        Connection connection = null;

        try {
            // Step 1: Load the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Step 2: Establish the connection
            connection = DriverManager.getConnection(jdbcURL, username, password);

            // Step 3: Create a SQL insert query
            String sql = "INSERT INTO employees (name, department, salary) VALUES (?, ?, ?)";

            // Step 4: Create PreparedStatement
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // Step 5: Add multiple sets of parameters to the batch
            preparedStatement.setString(1, "Raju");
            preparedStatement.setString(2, "HR");
            preparedStatement.setDouble(3, 50000);
            preparedStatement.addBatch();

            preparedStatement.setString(1, "Ramesh");
            preparedStatement.setString(2, "Finance");
            preparedStatement.setDouble(3, 60000);
            preparedStatement.addBatch();

            preparedStatement.setString(1, "Mohan");
            preparedStatement.setString(2, "IT");
            preparedStatement.setDouble(3, 70000);
            preparedStatement.addBatch();

            // Step 6: Execute batch
            int[] updateCounts = preparedStatement.executeBatch();

            // Step 7: Process the result
            System.out.println("Batch update completed. Number of rows affected: " + updateCounts.length);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    // Step 8: Close the connection
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
