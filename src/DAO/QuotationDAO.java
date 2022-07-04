/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.Quotation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Tee Zhuo Xuan
 */
public class QuotationDAO {

    public static void saveNewQuotation(Quotation quotation) throws SQLException {

        Connection conn = null;
        PreparedStatement ps = null;
        String query = "";
        ResultSet rs = null;

        try {
            conn = SQLDatabaseConnection.openConn();

            query = "INSERT INTO Quotation(Quot_ID)"
                    + " VALUES (?)";

            ps = conn.prepareStatement(query);
            // bind parameter
            ps.setString(1, quotation.getCode());

            ps.execute();
        } finally {
            try {
                ps.close();
            } catch (Exception e) {
                /* ignored */
            }
            try {
                conn.close();
            } catch (Exception e) {
                /* ignored */
            }
        }

    }

    public static String getLatestID() throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        String query = "";
        ResultSet rs = null;

        String latestID = "";

        try {
            conn = SQLDatabaseConnection.openConn();
            query = "select * from View_Quotation_LatestID";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            if (rs.next()) {
                latestID = rs.getString("Quot_ID");
            }

            return latestID;

        } finally {
            try {
                ps.close();
            } catch (Exception e) {
                /* ignored */
            }
            try {
                conn.close();
            } catch (Exception e) {
                /* ignored */
            }
        }
    }

}
