package com.example.marvel_cars;

import java.util.ArrayList;
import java.util.List;

public class user_datasource {
    private static user_datasource instance = null;
    List<user_vehicledata> vehicle;
    private user_datasource(){
        vehicle =new ArrayList<>();
        for (int i=0;i<10;i++) {
            user_vehicledata vehiclelist = new user_vehicledata();
            vehiclelist.Name ="audi"+i;
            vehiclelist.price=50.0+i;
            vehiclelist.seats=5;
            vehicle.add(vehiclelist);
        }
    }

    static user_datasource getInstance(){
        if(instance==null){
            instance=new user_datasource();
        }
        return instance;
    }
}
