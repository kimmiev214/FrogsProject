/**
 * PROJECT TITLE: FrogsProject
 * PROGRAM TITLE: Frog.java
 * PURPOSE OF PROJECT: Simulate how a pond ecosystem works.
 * VERSION or DATE: 12/20/2021
 * AUTHORS: Kim Villatoro
 * USER INSTRUCTIONS:
 * CLASS DESCRIPTION: Pond.java file is a driver, meaning it will contain and run Frog and Fly objects and “drive” their values according to a simulated set of actions.
 */
public class Pond {

    public static void main(String[] args) {

        Frog peepo = new Frog("Peepo");
        Frog pepe = new Frog("Pepe", 10, 15);
        Frog peepaw = new Frog("Peepaw", 4.6, 5);
        Frog pepperoni = new Frog("Pepperoni");

        Fly fly1 = new Fly(1, 3);
        Fly fly2 = new Fly(6);
        Fly fly3 = new Fly();

        Frog.setSpeciesName("1331 Frogs"); //set species name to "1331 Frogs"

        peepo.toString(); //description of Peepo
        peepo.eat(fly2); //attempt to eat fly2


        fly2.toString(); //description of fly2

        peepo.grow(8);
        peepo.eat(fly2);

        fly2.toString();

        peepo.toString();

        pepperoni.toString();

        peepaw.grow(4);
        peepaw.toString();

        pepe.toString();

    }//end main class


}//end Pond class
