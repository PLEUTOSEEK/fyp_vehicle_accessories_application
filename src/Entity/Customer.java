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
public class Customer extends Person {

    private String custID;
    private String bankAccProvider;
    private String bankAccNo;
    private Address billToAddr;
    private List<CollectAddress> dlvrAddrs;
    private String custType; // organization or personal
}
