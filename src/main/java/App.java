import bll.Manager;

import java.sql.SQLException;

public class App {
    private Manager instance = null;

    public void start() throws SQLException {
        instance = Manager.getInstance();
    }
}
