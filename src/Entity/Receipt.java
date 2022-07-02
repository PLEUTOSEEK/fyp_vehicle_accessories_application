/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.util.List;

/**
 *
 * @author Tee Zhuo Xuan
 */
public class Receipt<T> extends Document {

    private Invoice INV;
    private String referenceType; // understand the refernce is belong to what type of source document
    private T reference;
    private List<Item> items;
    private double ttlPayable;
    private double paidAmt;
    private double paidAmtPrev;
    private double balUnpaid;
    private Staff issuedBy;
    private Staff releasedAVerifiedBy;
    private Customer customerSignature;
}
