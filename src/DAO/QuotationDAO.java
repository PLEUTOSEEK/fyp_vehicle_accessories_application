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
import java.sql.Types;

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

            query = "INSERT INTO Quotation("
                    + "Quot_ID, "
                    + "CI_ID, "
                    + "Reference_Type, "
                    + "Reference, "
                    + "Bill_To_Cust, "
                    + "Deliver_To, "
                    + "Sales_Person, "
                    + "Currency_Code, "
                    + "Quot_Validity_Date, "
                    + "Required_Delivery_Date, "
                    + "Required_Delivery_Date, "
                    + "Payment_Term, "
                    + "Shipment_Term, "
                    + "Gross, "
                    + "Discount, "
                    + "Sub_Total, "
                    + "Nett, "
                    + "Issued_By, "
                    + "Released_And_Verified_By, "
                    + "Customer_Signed, "
                    + "Status, "
                    + "Created_Date, "
                    + "Actual_Created_Date, "
                    + "Signed_Doc_Pic, "
                    + "Modified_Date_Time"
                    + ")"
                    + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            ps = conn.prepareStatement(query);
            // bind parameter
            ps.setString(1, quotation.getCode());
            ps.setString(2, quotation.getCI().getCode());
            ps.setString(3, quotation.getReferenceType());
            ps.setNull(4, Types.VARCHAR);
            ps.setString(5, quotation.getBillToCust().getCustID());
            ps.setString(6, quotation.getDeliverToCust().getCollectAddrID());
            ps.setString(7, quotation.getSalesPerson().getStaffID());
            ps.setString(8, quotation.getCurrencyCode());
            ps.setDate(9, quotation.getQuotValidityDate());
            ps.setDate(10, quotation.getRequiredDeliveryDate());
            ps.setString(11, quotation.getPymtTerm());
            ps.setString(12, quotation.getShipmentTerm());
            ps.setBigDecimal(13, quotation.getGross());
            ps.setBigDecimal(14, quotation.getDiscount());
            ps.setBigDecimal(15, quotation.getSubTotal());
            ps.setBigDecimal(16, quotation.getNett());
            ps.setString(17, quotation.getIssuedBy().getStaffID());
            ps.setString(18, quotation.getReleasedAVerifiedBy().getStaffID());
            ps.setString(19, quotation.getCustomerSignature().getCustID());
            ps.setString(20, quotation.getStatus());
            ps.setDate(21, quotation.getCreatedDate());
            ps.setTimestamp(22, quotation.getActualCreatedDateTime());
            //ps.setString(23, quotation.getSignedDocPic()); // need to change to encoded 64 string
            ps.setTimestamp(24, quotation.getModifiedDateTime());

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
