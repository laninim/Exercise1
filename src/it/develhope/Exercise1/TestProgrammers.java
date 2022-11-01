package it.develhope.Exercise1;

public class TestProgrammers {

    public static void main(String[] args) {
        Programmer Mauro = new Programmer();
        Mauro.name = "Mauro";
        Mauro.age = 32;
        Mauro.wearsGlasses = false;

        Programmer jimmy = new Programmer();
        jimmy.name = "Jimmy";
        jimmy.age = 45;
        jimmy.wearsGlasses = true;

        Mauro.drinkCoffee();
        Mauro.printDetails();

        jimmy.printDetails();
        jimmy.hasGlasses();


    }
}
