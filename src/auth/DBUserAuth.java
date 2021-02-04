package auth;


import entity.Users;

import java.sql.*;


public class DBUserAuth  {

    public Users findUser(String name, String password) {

        Connection connection = DBService.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM authuser WHERE name = ? and password = ?"
            );
            statement.setString(1, name);
            statement.setString(2, password);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {

                return new Users(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("password"),
                        rs.getString("nik")

                );


            }
            return null;
        } catch (SQLException throwables) {
            throw new RuntimeException("SWW", throwables);
        } finally {
            DBService.close(connection);
        }

    }



}
