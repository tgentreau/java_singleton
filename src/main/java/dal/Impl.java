package dal;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Impl {
    Connection connection = Tools.getConnection();
    private static final String SQL_SELECT_ALL = "select * from auteur";

    public Impl() throws SQLException {
    }

    public List<Object> selectAll() throws SQLException {
        ResultSet resultSet = null;
        List<Object> auteurs = new ArrayList<>();
        try(Statement statement = connection.createStatement()) {
            resultSet = statement.executeQuery(SQL_SELECT_ALL);
            while (resultSet.next()) {
                auteurs.add(resultSet.getString(2));
            }
        } catch (SQLException e) {
            throw new SQLException(e);
        }
        return auteurs;
    }
}
