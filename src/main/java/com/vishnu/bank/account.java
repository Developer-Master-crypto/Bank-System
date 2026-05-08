package com.vishnu.bank;

 
 public class account {
    private String name;
    private long  phone;
    private int age;
    private String address;
    private String email;
    private int income;
    private int PIN;
    private double amount;


    public  account(String name, long phone, int age, String address, String email, int income, int PIN, double amount){ 
        this.name=name;
        this.phone=phone;
        this.address=address;
        this.email=email;
        this.income=income;
        this.PIN=PIN;
        this.age=age;
        this.amount=amount;


    }

    public String getname(){
        return name;
    }

    public void  setname(String name){
        this.name=name;
    }

    public long  getphone(){
        return phone;
    }

    public void  setphone(long phone){
        this.phone=phone;
    }

    public int getage(){
        return age; 
    }

    public void setage(int age){
        this.age=age; 
    }

    public String getaddress(){
            return address;
    }
    
    public void setaddress(String address){
        this.address=address;
    }
    
    public String getemail(){
        return email;
    }
    
    public void setemail(String email){
        this.email=email;
    }
    
    public int getincome(){
        return income;
    }
    
    public void  setincome(int income){
        this.income=income;
    }
    
    public int getPIN(){
        return PIN;
    }
    
    public void setPIN(int PIN){
        this.PIN=PIN;
    }
    
    public double getamount(){
        return amount;
    }
    
    public void setamount(double amount){
        this.amount=amount;
    }   

} 