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
public class CustomerInquiry<T> extends Document {

    private String referenceType;
    private T reference;
    private Customer billToCust;
    private Customer deliverToCust;
    private String currencyCode;
    private Date requiredDeliveryDate;
    private String pymtTerm;
    private String shipmentTerm;
    private Staff salesPerson;
    private List<Item> items;
    private BigDecimal gross;
    private BigDecimal discount;
    private BigDecimal subTotal;
    private BigDecimal nett;
    private Staff issuedBy;
}
