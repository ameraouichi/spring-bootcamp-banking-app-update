package com.alibou.banking.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class DetailedAddress {

    private String street;
    private String city;
    private String state;
    private String zip;
}
