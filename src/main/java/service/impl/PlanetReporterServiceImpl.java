package service.impl;

import data.Planet;
import service.PlanetReporterService;

public class PlanetReporterServiceImpl implements PlanetReporterService {
    public void print(Planet planet){
        System.out.println("Acceleration of gravity = "+planet.getAccelerationOfGravity());
    }
}
