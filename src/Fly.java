/**
 * PROJECT TITLE: FrogsProject
 * PROGRAM TITLE: Frog.java
 * PURPOSE OF PROJECT: Simulate how a pond ecosystem works.
 * VERSION or DATE: 12/20/2021
 * AUTHORS: Kim Villatoro
 * USER INSTRUCTIONS:
 * CLASS DESCRIPTION:
 */
public class Fly extends Pond {

    private double mass;
    private double speed;

    protected Fly(double mass, double speed) {
        this.mass = mass;
        this.speed = speed;
    }


    protected Fly(double mass) {
        this.mass = mass;
        this.speed = 10;
    }


    protected Fly() {
        this.mass = 5;
        this.speed = 10;
    }


    public String toString() {
        if (mass == 0) {
            System.out.printf("I'm dead, but I used to be a fly with a speed of %.2f. \n", speed);
        } else {
            System.out.printf("I'm a speedy fly with %.2f speed and %.2f mass. \n", speed, mass);
        }
        return null;
    }


    protected double grow(int addMass) {
        mass =  mass + addMass;

        if (mass < 20) {
            double speedIncrease = 20 - mass;
            speed = speed + speedIncrease;
        }

        if(mass >= 20) {
            double speedDecrease = mass - 20;
            speed = speed - speedDecrease * (0.5);
        }

        return speed;
    }


    protected boolean isDead() {
        if (mass == 0) {
            return true;
        }
        return false;
    }


    protected void setMass(double mass) {
        this.mass = mass;
    }


    protected void setSpeed(double speed) {
        this.speed = speed;
    }


    protected double getMass() {
        return mass;
    }


    protected double getSpeed() {
        return speed;
    }


}//end Fly class
