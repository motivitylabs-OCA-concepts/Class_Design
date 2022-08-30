package com.motivity.classdesign.Inheritence.typsOfInhertence;



class Redmi2
{
    int productId;
    String productName;
    String brand;

    public Redmi2() {
        System.out.println("this is super class constructor");
    }

    void warranty()
    {
        System.out.println(brand+" two years brand warranty ");
    }
}
class RedmiHeadPhones extends Redmi2//multiple classes extending same interface
{
    public RedmiHeadPhones() {
        super();//this is super class constructor
    }

    public void getDetails()
    {
        System.out.println("product id "+super.productId);//
        System.out.println("product name "+super.productName);
        System.out.println("brand  "+super.brand);
    }
    @Override
    void warranty() {
        super.warranty();
    }
}
class RedmiMobile1 extends Redmi2//multiple classes extending same interface
{

    public void getDetails()
    {
        System.out.println("product id "+productId);//accessing superclass variables
        System.out.println("product name "+super.productName);
        System.out.println("brand  "+super.brand);
    }
    @Override
    void warranty() {////accessing superclass methods
        super.warranty();
    }
}

public class HirarchicalInheritenceExample {
    public static void main(String[] args) {
        RedmiHeadPhones headPhone=new RedmiHeadPhones();
        headPhone.brand="redmi";
        headPhone.productId=786555;
        headPhone.productName="redmi buds 2";
        headPhone.getDetails();
        headPhone.warranty();
        System.out.println("*************************************************");
       RedmiMobile mobile=new RedmiMobile();
        mobile.brand="redmi";
        mobile.productId=745822;
        mobile.productName="redmiK50pro";
        mobile.getDetails();
        mobile.warranty();

    }
}
