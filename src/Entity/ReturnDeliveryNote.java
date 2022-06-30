/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author Tee Zhuo Xuan
 */
public class ReturnDeliveryNote extends Document {

    private SalesOrder SO;
    private Address companyAddr; // company = Thir Shen
    private Contact companyContact;
    private Date collectDate;
    private String inspectorMsg;
    private List<Item> items;
    private Staff issuedBy;
    private Staff inspectedBy;
    private Staff collectBackBy;
    private Customer itemPassedBackBy;
    private Staff itemReceivedBy;

}
