package dal;

import java.sql.SQLException;

public class DAOFactory {
    public static Impl getDAO() throws SQLException {return new Impl();}
}
