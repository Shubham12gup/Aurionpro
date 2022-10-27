package com.aurionpro.test;

import java.util.*;

import com.aurionpro.model.Doctor;

public class DoctorTest {

	public static void main(String[] args) {
		ArrayList<Doctor> doctor = new ArrayList<Doctor>();
		doctor.add(new Doctor(101, "Ashish", "Gastrology", 1000));
		doctor.add(new Doctor(102, "Ritesh", "Gastrology", 1500));
		doctor.add(new Doctor(103, "Reena", "Neurology", 2000));
		doctor.add(new Doctor(104, "Rizwan", "Neurology", 1500));
		doctor.add(new Doctor(106, "Harshal", "ENT", 1000));
		doctor.add(new Doctor(105, "Shivam", "Cardiology", 3000));
		doctor.add(new Doctor(107, "Shubh", "Gynaecology", 4000));
		
		
		//Sorting by Name
		System.out.println("\nSorting by Name");
		Collections.sort(doctor);
		for(Doctor d: doctor) {
			System.out.println(d);
		}
		
//		//Sorting by Fees
//		System.out.println("Sorting by Fees");
//		Collections.sort(doctor);
//		for(Doctor d: doctor) {
//			System.out.println(d);
//		}

	}

}
