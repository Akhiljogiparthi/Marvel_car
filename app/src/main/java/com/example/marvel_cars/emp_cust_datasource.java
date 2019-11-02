package com.example.marvel_cars;

import java.util.ArrayList;
import java.util.List;

public class emp_cust_datasource {
    private static emp_cust_datasource instance = null;
    List<emp_customer_data> customer;

    private emp_cust_datasource() {
        customer = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            emp_customer_data customerList = new emp_customer_data();
            customerList.Name = "mad" + i;
            customerList.Email = "mad314@cegep.com";
            customerList.phonenumber = "123456789" + i;
            customerList.password = "a"+i;
            customer.add(customerList);
        }
    }
    static emp_cust_datasource getInstance() {
        if (instance == null) {
            instance = new emp_cust_datasource();
        }
        return instance;
    }
}


