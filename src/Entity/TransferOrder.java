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
//multi purpose document
public class TransferOrder<T> extends Document {

    private Staff PIC;
    private Place destination;
    private String reqType;// understand the reference is belong to what type of source document
    private T reqTypeRef;// SO/ PO
    private List<Item> items;
    private Staff issuedBy;
    private Staff transferBy;
    private Staff itemReceivedBy;

}
