package concept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {

    private Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/pizzashop",
                "root", "");
    }

    public boolean checkUser(String email) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT Email FROM users WHERE Email = ?")) {

            preparedStatement.setString(1, email);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
               
                return true;
            } else {
                System.out.println("User not found");
                return false;
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

   
    public boolean validatePass(String pass)
    {
    	try (Connection connection = getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("SELECT Email FROM users WHERE Password = ?")) {

               preparedStatement.setString(1, pass);
               ResultSet resultSet = preparedStatement.executeQuery();

               if (resultSet.next()) {
                   System.out.println("Login Succesfull");
                   return true;
               } else {
                   System.out.println("Incorrect Password");
                   return false;
               }
           } catch (SQLException | ClassNotFoundException e) {
               e.printStackTrace();
               return false;
           }
    }

}
