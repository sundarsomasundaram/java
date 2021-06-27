package com.zuhlke.storage.service;

import com.zuhlke.storage.connect.DBConnection;
import com.zuhlke.storage.obj.Store;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

import java.sql.*;
import java.util.List;

import static com.zuhlke.storage.constants.CommonConstants.INSERT_STATEMENT;

public class Service {
    private final static Logger LOGGER = Logger.getLogger(Service.class.getName());

    /**
     * @param store_list
     */
    public void create(List<Store> store_list) {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = (Connection) new DBConnection().getCon();
            stmt = (Statement) conn.createStatement();
            PreparedStatement pstmt = conn.prepareStatement(INSERT_STATEMENT);
            int i = 0;
            for (Store store : store_list) {
                pstmt.setString(1, store.getRow_ID());
                pstmt.setString(2, store.getOrder_ID());
                pstmt.setDate(3, store.getOrder_Date());
                pstmt.setDate(4, store.getShip_Date());
                pstmt.setString(5, store.getShip_Mode());
                pstmt.setInt(6, store.getQuantity());
                pstmt.setBigDecimal(7, store.getDiscount());
                pstmt.setBigDecimal(8, store.getProfit());
                pstmt.setString(9, store.getProduct_ID());
                pstmt.setString(10, store.getCustomerName());
                pstmt.setString(11, store.getCategory());
                pstmt.setString(12, store.getCustomer_ID());
                pstmt.setString(13, store.getProduct_Name());
                i++;
//                pstmt.setString((i % 12) + 8, store.getSegment());
//                pstmt.setString((i % 12) + 9, store.getCountry());
//                pstmt.setString((i % 12) + 10, store.getCity());
//                pstmt.setString((i % 12) + 11, store.getState());
//                pstmt.setString((i % 12) + 12, store.getPostal_Code());
//                pstmt.setString((i % 12) + 13, store.getRegion());
//                pstmt.setString((i % 12) + 16, store.getSub_Category());
//                pstmt.setString((i % 12) + 18, store.getSales());

                pstmt.addBatch();// add batch
                if (store_list.size() == i)// insert when the batch size is fully added.
                    pstmt.executeBatch();
            }
            LOGGER.log(Priority.ERROR, "Records are inserted in the table successfully.");
        } catch (SQLIntegrityConstraintViolationException except) {
            LOGGER.log(Priority.ERROR, except.getErrorCode() + ", " + except.getMessage());
        } catch (BatchUpdateException except) {
            LOGGER.log(Priority.ERROR, except.getErrorCode() + ", " + except.getMessage());
        } catch (SQLException except) {
            LOGGER.log(Priority.ERROR, except.getErrorCode() + ", " + except.getMessage());
        } finally {
            try {
                if (stmt != null)
                    conn.close();
            } catch (SQLException se) {
                LOGGER.log(Priority.ERROR, se.getErrorCode() + ", " + se.getMessage());
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                LOGGER.log(Priority.ERROR, se.getErrorCode() + ", " + se.getMessage());
            }
        }
    }
}
