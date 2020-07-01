package data.impl;

import data.Planet;

public class UranusPlanetImpl implements Planet {
    private final static double AccelerationOfGravity = 8.87;
    private final static int planetNumberFromTheSun = 7;
    private final static String nameOfPlanet = "Uranus";

    public double getAccelerationOfGravity() {
        return AccelerationOfGravity;
    }

}
