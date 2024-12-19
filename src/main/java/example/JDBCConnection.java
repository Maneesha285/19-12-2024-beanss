package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCConnection {
    public static void main(String[] args) {
        try {


            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swiggy", "root", "root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from customer");
            while (resultSet.next()) {
                double salary = resultSet.getDouble("salary");
                int age =resultSet.getInt("age");
                String name=resultSet.getString("name");
                System.out.println("name: "+name  +  " , salary: "+salary +  "  ,age: "+age );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

