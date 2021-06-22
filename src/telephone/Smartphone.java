package telephone;

public abstract class  Smartphone extends MobilePhone {
	String OS;

	public Smartphone() {
		this.phoneType = "SmartPhone";
		System.out.println(" You can achieve SmartPhone Class");
	}

	public static void navigation(String destination){
		System.out.println("Calculating route to "+ destination.toUpperCase()+" from Smartphone Class");
	}public static void navigation(){
			navigation("Home");
	}

	
}
