/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.sql.Date;
import java.util.List;

public class Quotation<T> extends Document {

    private CustomerInquiry CI;
    private String referenceType;
    private T reference;
    private Customer billToCust;
    private Customer deliverToCust;
    private String currencyCode;
    private Date quotValidityDate; // Valid Until
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
