/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.sql.Date;
import java.util.List;

public class Quotation extends Document {

    private String reference;
    private Customer billToCust;
    private Address billToAddr;
    private String receiveCustName;
    private Address deliveryAddr;
    private String currencyCode;
    private Date validUntil;
    private Date requiredDeliveryDate;
    private String pymtTerm;
    private String shipmentTerm;
    private Staff salesPerson;
    private List<Item> items;
    private double gross;
    private double discount;
    private double subTotal;
    private double nett;
    private Staff issuedBy;
    private Staff releasedAVerifiedBy;
    private Customer customerSignature;

}
