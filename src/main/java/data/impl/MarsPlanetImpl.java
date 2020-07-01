package data.impl;

import data.Planet;

public class MarsPlanetImpl implements Planet {
    private final static double AccelerationOfGravity = 3.71;
    private final static int planetNumberFromTheSun = 4;
    private final static String nameOfPlanet = "Mars";

    public double getAccelerationOfGravity() {
        return AccelerationOfGravity;
    }

}
