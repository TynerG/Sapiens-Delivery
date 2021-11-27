package com.yde.sapiensdelivery.use_cases;

import com.yde.sapiensdelivery.entities.Customer;
import com.yde.sapiensdelivery.entities.DeliveryMan;

import java.util.ArrayList;

public class DeliveryManManager {
    private DeliveryMan deliveryMan;

    /**
     * Creates an OrderManager given an already existing deliveryMan
     */
    public DeliveryManManager(DeliveryMan deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    /**
     * return the Delivery man's name
     */
    public String getName(){
        return this.deliveryMan.getName();
    }

    /**
     * return the Delivery man's Location
     */
    public ArrayList<Integer> getLocation(){
        return this.deliveryMan.getLocation();
    }

    /**
     * return the Delivery man's PhoneNumber
     */
    public String getPhoneNumber(){
        return this.deliveryMan.getNumber();
    }

    /**
     * return the Delivery man's user name
     */
    public String getUsername(){
        return this.deliveryMan.getUname();
    }

    /**
     * return the Delivery man's password
     */
    public String getPassword(){
        return this.deliveryMan.getPassword();
    }

    /**
     * return the Delivery man's Social Insurance Number
     */
    public long getSin(){
        return this.deliveryMan.getSin();
    }

    /**
     * return the Delivery man's mode of Transportation
     */
    public String getTransport(){
        return this.deliveryMan.getTransport();
    }

    /**
     * return the Delivery man's rate
     */
    public double getRate(){
        return this.deliveryMan.getRate();
    }

    /**
     * set the Delivery man's name
     */
    public void setName(String name){
        this.deliveryMan.setName(name);
    }

    /**
     * set the Delivery man's location in the following format
     * {longitude, latitude}
     */
    public void setLocation(ArrayList<Integer> location){
        this.deliveryMan.setLocation(location);
    }

    /**
     * set the Delivery man's phone number
     */
    public void setPhoneNumber(String number){
        this.deliveryMan.setNumber(number);
    }

    /**
     * set the Delivery man's username
     */
    public void setUsername(String username){
        this.deliveryMan.setUname(username);
    }

    /**
     * set the Delivery man's password
     */
    public void setPassword(String password){
        this.deliveryMan.setPassword(password);
    }

    /**
     * set the Delivery man's Social Insurance Number
     */
    public void setSin(long id){
        this.deliveryMan.setSin(id);
    }

    /**
     * set the Delivery man's mode of transportation.
     */
    public void setTransport(String transport){
        this.deliveryMan.setTransport(transport);
    }

    /**
     * set the Delivery man's rate.
     */
    public void setRate(float rate){
        this.deliveryMan.setRate(rate);
    }
}