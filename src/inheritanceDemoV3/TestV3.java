package inheritanceDemoV3;

public class TestV3 {
    public static void main(String[] args){
        Animal animal1 = new Animal();
        System.out.println("Display from the super class: " + animal1);

        // mammal1 inherit values that are from the super class
        Mammal mammal1 = new Mammal();
        System.out.println("Inherited values: " + mammal1);

        // mammal1 update new values based on what you set
        mammal1.setBeingDangerous(false);
        mammal1.setNumberOfLegs(2);
        mammal1.setDiet("Omnivore");
        System.out.println(" Updated values: " + mammal1);
    }

}
