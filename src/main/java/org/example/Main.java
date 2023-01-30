package org.example;

import java.sql.*;
import java.util.ArrayList;



public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/DatabaseSQL", "postgres", "12345");


        PreparedStatement statement = connection.prepareStatement("SELECT * FROM telephone WHERE id>?");
        statement.setInt(1, 6);
        ResultSet resultSet = statement.executeQuery();
        ArrayList<Telephone> telephones = new ArrayList<Telephone>();
        while (resultSet.next()) {
            Telephone telephone = new Telephone();
            telephone.setId_telephone(resultSet.getInt("id"));
            telephone.setModel(resultSet.getString("model"));
            telephone.setColor(resultSet.getString("color"));
            telephones.add(telephone);}
        System.out.println(telephones);

        PreparedStatement statement1 = connection.prepareStatement("INSERT INTO telephone (model,color) VALUES(?,?)");
        statement1.setString(1,"Horizont");
        statement1.setString(2,"Gold");

        int count = statement1.executeUpdate();
        System.out.println(count);
        statement1.close();


    }
}