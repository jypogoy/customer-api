package com.yogop.customerapi.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.sql.Date;

/**
 * @author Jeffrey Y. Pogoy
 * @created 11 Sep 2017 5:46 PM
 */
@Data
@XmlRootElement
public class Customer {

    private long id;
    private String name;
    private String address;
    private Date dateAdded;

    public Customer() {
    }

    public Customer(long id, String name, String address, Date dateAdded) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateAdded = dateAdded;
    }
}
