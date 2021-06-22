package telephone;

import java.util.Scanner;

public class iPhone extends Smartphone {
	
	//4545645645645645645645645645
	//deneme
	public static void music() {
		System.out.println("whic song do you wantto listen:");
		iTunes(tc.nextLine());
		// that line is for test purpose
	}

	private static void iTunes(String nextLine) {
		
	}

	public static void appStore() {
		System.out.println("You can use AppStore");
	}

	@Override
	public void call(String name) {
		//TODO:  overriding run-time polymorphism - dynamic polymorphism
		System.out.println("Do you want to use FaceTime");
		String faceTime = sc.nextLine();
		if (faceTime.contains("yes")) {
			faceTimeCall(name);
		} else {
			super.call(name);
		}
	}

	public void faceTimeCall(String name) {
		System.out.println("Calling " + name + " via facetime");

	}

	public iPhone(String oS) {
		System.out.println(" You can achieve iPhone Class  ");
		OS = oS;
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	Scanner sc = new Scanner(System.in);
	static Scanner tc = new Scanner(System.in);
}