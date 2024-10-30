package org.transport.test.login;
import org.road.test.login.Road;
import org.air.test.login.Air;
import org.water.test.login.Water;
public class Transport {
	public void transportForm() {
		System.out.println("There are 3 types of mode of Transport : Road,Water,Air");
	}
	public static void main(String[] args) {
		Transport t = new Transport();
		t.transportForm();
		Road r = new Road();
		r.bike();
		r.cycle();
		r.bus();
		r.car();Air a = new Air();
		a.aeroPlane();
		a.helicopter();
		Water w = new Water();
		w.boat();
		w.ship();
	}
}
