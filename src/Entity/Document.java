/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author Tee Zhuo Xuan
 */
public class Document {

    protected String code;
    protected Timestamp actualCreatedDateTime;
    protected Date createdDate;
    protected byte[] signedDocPic;
    protected String status;
    protected Timestamp modifiedDateTime;
}
