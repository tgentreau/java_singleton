package bll;

import dal.DAOFactory;
import dal.Impl;

import java.sql.SQLException;

public class Manager {
    private static volatile Manager instance = null;
    private static Impl impl;
    private Manager() throws SQLException {
        impl = DAOFactory.getDAO();
    }

    public static final Manager getInstance() throws SQLException {
        if(Manager.instance == null) {
            synchronized (Manager.class) {
                if(Manager.instance == null) {
                    Manager.instance = new Manager();
                }
            }
        }
        return Manager.instance;
    }
}
