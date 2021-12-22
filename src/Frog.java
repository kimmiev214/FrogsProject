/**
 * PROJECT TITLE: FrogsProject
 * PROGRAM TITLE: Frog.java
 * PURPOSE OF PROJECT: Simulate how a pond ecosystem works.
 * VERSION or DATE: 12/20/2021
 * AUTHORS: Kim Villatoro
 * USER INSTRUCTIONS:
 * CLASS DESCRIPTION:
 */
public class Frog extends Pond {
    
    private final String name;
    private int age;
    private double tongueSpeed;
    private boolean isFroglet = true;

    private static String speciesName = "Rare Pepe";

    protected Frog(String name, int age, double tongueSpeed) {
        this.name = name;
        this.age = age;
        this.tongueSpeed = tongueSpeed;
    }


    protected Frog(String name, double ageInYears, double tongueSpeed) {
        this.name = name;
        age = (int) ageInYears;
        this.tongueSpeed = tongueSpeed;
    }


    protected Frog(String name) {
        this.name = name;
        age = 5;
        tongueSpeed = 5;
    }


    protected void grow(int numMonths) {
        age += numMonths;

        if(!(age < 7) && !(age > 1)) {
            isFroglet = false;
        }

        if (age < 12) {
            while (tongueSpeed <= 12) {
                tongueSpeed += numMonths;
            }


        }

        if (age >= 30) {
            int count = age - 30;
            tongueSpeed -= count;

            if (tongueSpeed < 5) {
                while (tongueSpeed < 5) {
                    tongueSpeed++;
                }
            }
        }

    }


    protected void eat(Fly fly) {
        boolean isCaught = false;

        if(fly.isDead() == true) {
            return;
        }

        if(fly.getSpeed() < tongueSpeed) {
            isCaught = true;
        }

        if(isCaught == true && fly.getMass() > age * 0.5) {
            grow(1);
        }

        if(isCaught == true) {
            fly.setMass(0);
        }

        if(isCaught == false) {
            fly.setMass(fly.getMass() + 1);
            fly.setSpeed(fly.getSpeed() + 1);
        }
    }


    public String toString() {

        if(age < 7 && age > 1) {
        } else isFroglet = false;

        if (isFroglet) {
            System.out.printf("My name is %s and I'm a rare froglet! I'm %d months old and my" +
                    " tongue has a speed of %.2f. \n", name, age, tongueSpeed);
        } else {
            System.out.printf("My name is %s and I’m a rare frog. I’m %d months old and my tongue has a speed of %.2f. \n", name, age, tongueSpeed);
        }
        return null;
    }


    protected static void setSpeciesName(String speciesName) {
        Frog.speciesName = speciesName;
    }


    protected String getSpeciesName() {
        return speciesName;
    }


}//end Frog class
