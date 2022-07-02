/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.sql.Timestamp;

/**
 *
 * @author Tee Zhuo Xuan
 */
public class Document extends Entity {

    protected String code;
    protected Timestamp actualCreatedDateTime;
    protected byte[] signedDocPic;
    protected String status;

}
