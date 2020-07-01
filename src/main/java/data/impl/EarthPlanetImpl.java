package data.impl;

import data.Planet;

public class EarthPlanetImpl implements Planet {
    private final static double AccelerationOfGravity = 9.8;
    private final static int planetNumberFromTheSun = 3;
    public final static String nameOfPlanet = "Earth";

    public double getAccelerationOfGravity() {
        return AccelerationOfGravity;
    }


}
