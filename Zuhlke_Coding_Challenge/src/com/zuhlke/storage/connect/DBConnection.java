package com.zuhlke.storage.connect;

import com.zuhlke.storage.constants.CommonConstants;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private final static Logger LOGGER = Logger.getLogger(DBConnection.class.getName());
    private Connection con;

    public DBConnection(Connection con) {
        this.con = con;
    }

    public DBConnection() {
    }

    private Connection getDBConnection() {
        try {
            Class.forName(CommonConstants.DRIVER_NAME);
            con = DriverManager.getConnection(
                    CommonConstants.DB_URL, CommonConstants.user, CommonConstants.password);
        } catch (ClassNotFoundException e) {
            LOGGER.log(Priority.ERROR, e.getMessage());
        } catch (SQLException e) {
            LOGGER.log(Priority.ERROR, e.getErrorCode() + ", " + e.getMessage());
        }
        return con;
    }

    public Connection getCon() {
        return getDBConnection();
    }

    public void setCon(Connection con) {
        this.con = con;
    }
}  
