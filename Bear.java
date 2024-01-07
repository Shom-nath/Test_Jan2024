package HelloWorld;

public class Bear {
    String species;
    public Bear(String speciesOfBear) {
        species = speciesOfBear;
    }

    public static void main(String[] args) {
        Bear baloo = new Bear("Sloth bear - branch1");
        System.out.println(baloo); // Prints: Bear@4517d9a3
        // set object to null
        baloo = null;
        System.out.println(baloo); // Prints: null
    }
}
