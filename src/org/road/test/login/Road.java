package org.road.test.login;

public class Road {
public void bike() {
System.out.println("Bike is Road Transport");
}
public void cycle() {
	System.out.println("Cycle is Road Transport");
}
public void bus() {
	System.out.println("Bus is Road Transport");
}
public void car() {
	System.out.println("Car is Road Transport");
}
public static void main(String[] args) {
	Road r = new Road();
	r.bike();
	r.cycle();
	r.bus();
	r.car();
}
}
