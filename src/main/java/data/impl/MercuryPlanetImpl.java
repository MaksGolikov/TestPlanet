package data.impl;

import data.Planet;

public class MercuryPlanetImpl implements Planet {
    private final static double AccelerationOfGravity = 3.7;
    private final static int planetNumberFromTheSun = 1;
    private final static String nameOfPlanet = "Mercury";

    public double getAccelerationOfGravity() {
        return AccelerationOfGravity;
    }


}
