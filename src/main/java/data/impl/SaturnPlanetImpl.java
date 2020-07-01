package data.impl;

import data.Planet;

public class SaturnPlanetImpl implements Planet {
    private final static double AccelerationOfGravity = 10.44;
    private final static int planetNumberFromTheSun = 6;
    private final static String nameOfPlanet = "Saturn";

    public double getAccelerationOfGravity() {
        return AccelerationOfGravity;
    }

}
