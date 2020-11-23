package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheller;

public class Vehicle {
	public void VehicleNecessery() {
		System.out.println("Vehicle classification:");
	}

	public  void aura() {
		System.out.println("Car Aura");
	}
	public  void scooter() {
		System.out.println("scooteer added");

	}
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		FourWheeler f =new FourWheeler();
		ThreeWheeler th = new ThreeWheeler();
		TwoWheller t = new TwoWheller();
	v.VehicleNecessery();
	f.bus();
	f.car();
	f.lorry();
	th.Auto();
	t.bike();
	t.cycle();
	v.aura();
	v.scooter();
	}
	
}
