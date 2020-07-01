package data.impl;

import data.Planet;

public class JupiterPlanetImpl implements Planet {
    private final static double AccelerationOfGravity = 24.79;
    private final static int planetNumberFromTheSun = 5;
    private final static String nameOfPlanet = "Jupiter";

    public double getAccelerationOfGravity() {
        return AccelerationOfGravity;
    }

}
