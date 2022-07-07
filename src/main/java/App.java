import bll.Manager;

import java.sql.SQLException;
import java.util.List;

public class App {
    private static Manager instance = null;

    public static List<Object> start() throws SQLException {
        instance = Manager.getInstance();
        return instance.getAllAuteurs();
    }

    public static void main(String[] args) throws SQLException {
        System.out.println(start());
    }
}
