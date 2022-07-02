/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Tee Zhuo Xuan
 */
public class SalesOrder<T> extends Document {

    private Customer billToCust;
    private Customer deliverToCust;
    private String custPOReference;
    private Quotation quotRef;
    private String referenceType; // understand the refernce is belong to what type of source document
    private T reference; // quotation source document
    private Staff salesPerson;
    private String currencyCode;
    private Date requiredDeliveryDate;
    private String pymtTerm;
    private String shipmentTerm;
    private List<Item> items;
    private BigDecimal gross;
    private BigDecimal discount;
    private BigDecimal subTotal;
    private BigDecimal nett;
    private Staff issuedBy;
    private Staff releasedAVerifiedBy;
    private Customer customerSignature;
}
