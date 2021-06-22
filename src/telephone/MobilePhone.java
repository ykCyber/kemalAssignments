package telephone;

public class MobilePhone {
    String serviceProvider;
    String phoneType="Classic Phone";
    int batteryCapacity;
    static {
        System.out.println("static block");
    }
    {
        System.out.println("instance block");
    }
    public MobilePhone() {
        System.out.println(" You can achieve Mobile Class  ");
    }

    public static void music() {
        System.out.println("Playing on RADIO ");
    }

    public void call(String name) {
        System.out.println("Calling  " + name + " via celular provider");
    }
    //TODO:: overloading : compile-time polymorphism - static polymorphism
    public void call(int number) {
        System.out.println("Calling +" + number + " via celular provider");
    }
}
