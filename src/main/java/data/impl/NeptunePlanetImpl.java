package data.impl;

import data.Planet;

public class NeptunePlanetImpl implements Planet {
    private final static double AccelerationOfGravity = 11.15;
    private final static int planetNumberFromTheSun = 8;
    private final static String nameOfPlanet = "Neptune";

    public double getAccelerationOfGravity() {
        return AccelerationOfGravity;
    }

}
