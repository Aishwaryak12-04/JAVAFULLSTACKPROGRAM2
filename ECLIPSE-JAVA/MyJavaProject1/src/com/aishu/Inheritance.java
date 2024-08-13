package com.aishu;

class Vehicle {

	void noOfEngine() {

		System.out.println("I have one engine");

	}

}

class TwoWheeler extends Vehicle {

    void noOfWheels() { 

        System.out.println("I have Two Wheels");

    }

}



class Bike extends TwoWheeler {

    void brandName() {

        System.out.println("Brand name is Royal Enfield");

    }

}
 class Scooty extends TwoWheeler {

	 void brandName () {

		 System.out.println("Brand name is Jupiter");

	 }

 }

public class Inheritance {

    public static void main(String[] args) {

        Bike bike = new Bike();
        

        bike.noOfEngine();

        bike.noOfWheels();

        bike.brandName();

        

        Scooty scooty = new Scooty();

        scooty.noOfEngine();

        scooty.noOfWheels();

        scooty.brandName();

    }

}