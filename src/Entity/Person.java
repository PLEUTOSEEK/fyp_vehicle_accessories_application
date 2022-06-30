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
public class Person {

    protected byte[] avatarImg;
    protected String name;
    protected String gender;
    protected Date DOB; // date of birth
    protected String maritalStatus;
    protected String nationality;
    protected String IC;
    protected String honorifics;
    protected Address residentialAddr; // or permanent address
    protected Address corAddr; // corresponding address
    protected Contact contact;
    protected String occupation;

}
