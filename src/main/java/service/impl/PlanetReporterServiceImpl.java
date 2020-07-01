package service.impl;

import data.Planet;

public class PlanetReporterServiceImpl {
    public void print(Planet planet){
        System.out.println("Acceleration of gravity = "+planet.getAccelerationOfGravity());
    }
}
