package com.example.snippet.Classes;

import java.util.Random;

public class Customer {
    Random random = new Random();
    public Long id;
    public String custname;
    public String custemail;
    public Long custphone;
    public String custcity;
    public Customer() {
    }
    public Customer(String custname, String custemail, Long custphone, String custcity) {
        this.id =  random.nextLong(1234567,Integer.MAX_VALUE);
        this.custname = custname;
        this.custemail = custemail;
        this.custphone = custphone;
        this.custcity = custcity;
    }
    
}
