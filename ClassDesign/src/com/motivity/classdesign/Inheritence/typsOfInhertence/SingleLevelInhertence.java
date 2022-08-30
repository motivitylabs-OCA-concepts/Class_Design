package com.motivity.classdesign.Inheritence.typsOfInhertence;

class Redmi
{
    int productId;
    String productName;
    String brand;

    public Redmi() {
        System.out.println("this is super class constructor");
    }

    void warranty()
    {
        System.out.println(brand+" two years brand warranty ");
    }
}
class RedmiMobile extends Redmi//only one subclass extends super class is called single level
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

public class SingleLevelInhertence {
    public static void main(String[] args) {
        RedmiMobile mobile=new RedmiMobile();
        mobile.brand="redmi";
        mobile.productId=745822;
        mobile.productName="redmiK50pro";
        mobile.getDetails();
        mobile.warranty();
    }
}
