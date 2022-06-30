/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.sql.Date;

/**
 *
 * @author Tee Zhuo Xuan
 */
public class Staff extends Person {

    private String staffID;
    private Place workPlace; // or department
    private Date entryDate; // or join date, when he start to work within this company
    private Date createdDate;
    private Date modifiedDate;
    private Staff reportTo;
    private String empType; // full/ part time

}
