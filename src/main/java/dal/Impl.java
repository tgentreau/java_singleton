package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Impl {
    Connection connection = Tools.getConnection();
    PreparedStatement preparedStatement = connection.prepareStatement("requete");

    public Impl() throws SQLException {
    }
}
