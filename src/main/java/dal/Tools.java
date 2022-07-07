package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Tools {
    public static Connection getConnection() throws SQLException {
        ResourceBundle config = ResourceBundle.getBundle("configuration");
        String url = config.getString("server");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(url).append("?").append("user=").append(config.getString("username"))
                .append("&").append("password=").append(config.getString("password"));
        try {
            return DriverManager.getConnection(stringBuilder.toString());
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }
}
