package SamplePackage;

public class Main {
    public static void main(String[] args) {
        PersonName myObj = new PersonName();
        myObj.setName("John");
        System.out.println(myObj.getName());
        myObj.setName("Bhargav");
        System.out.println(myObj.getName());

        System.out.println("Changes added as a part of the ticket T1234");
    }
}
