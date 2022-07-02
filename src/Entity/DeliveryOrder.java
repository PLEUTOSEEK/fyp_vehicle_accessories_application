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
// multi purpose document
public class DeliveryOrder<T> extends Document {

    private Address companyAddr; // company = Thir Shen
    private Contact companyContact;
    private SalesOrder SO;
    private Date deliveryDate;
    private ReturnDeliveryNote RDN;
    private String referenceType; // understand the refernce is belong to what type of source document
    private T reference;
    private List<Item> items;
    private Staff issuedBy;
    private Staff releasedAVerifiedBy;
    private Staff deliveryBy;
    private Customer itemReceivedBy;

}
