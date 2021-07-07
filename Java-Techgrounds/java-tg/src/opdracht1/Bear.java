package opdracht1;

import java.util.ArrayList;
import java.util.Arrays;

public class Bear extends Animal{

    public String type = "";
    int weights;

    public Bear(String naam, int leeftijd, String types) {
        super(naam, leeftijd);
        type = types;
        System.out.println(types);
    }

    public Bear(String naam, int leeftijd, String types, int weight) {
        super(naam, leeftijd);
        type = types;
        this.weights = weight;
        System.out.println(types);
    }

    private void showType() {
        System.out.println("beer type : " + this.type);
        System.out.println("Animal type : " +  Animal.type);
    }

    @Override
    public void feed() {
        super.feed();
        System.out.println("De beer heeft de arts opgegeten");
    }

    public void feed(String feed) {
        System.out.println("De beer heeft de arts opgegeten");
    }

    @Override
    public void visitVet() {
        super.visitVet();
    }

    public static void main(String[] args) {
        Animal pier = new Animal("Pier", 20);
        Bear brown_bear = new Bear("Gert", 20, "Brown Bear");
        Bear polar_bear = new Bear("Henk", 25, "Polar Bear");
        Bear[] bears = {brown_bear , polar_bear};
        Animal[] animals = {brown_bear , polar_bear, pier};
        brown_bear.showType();
        polar_bear.showType();
        for (Bear beer : bears) {
            beer.feed();
        }
        for (Animal animal : animals) {
            animal.feed();
        }
    }
}
