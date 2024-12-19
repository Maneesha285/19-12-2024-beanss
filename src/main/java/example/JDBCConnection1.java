package example;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCConnection1 {
    public static void main(String[] args) {
        try {
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/swiggy","root","root");
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from account");
            while (resultSet.next()){
                String name=resultSet.getString("name");
                Double mobile=resultSet.getDouble("mobile");
                Double balance=resultSet.getDouble("balance");
                System.out.println("name: "+name  + " , mobile: "+mobile  + ",balance: "+balance);

            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
