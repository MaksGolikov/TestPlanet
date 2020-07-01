package data.impl;

import data.Planet;

public class VenusPlanetImpl implements Planet {
    private final static double AccelerationOfGravity = 8.87;
    private final static int planetNumberFromTheSun = 2;
    private final static String nameOfPlanet = "Venus";

    public double getAccelerationOfGravity() {
        return AccelerationOfGravity;
    }

}
