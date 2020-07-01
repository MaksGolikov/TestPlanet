import data.impl.EarthPlanetImpl;
import data.impl.MercuryPlanetImpl;
import service.impl.PlanetReporterServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PlanetReporterServiceImpl planetReporterServiceImpl = new PlanetReporterServiceImpl();
        Scanner sc = new Scanner(System.in);
        String str = null;
        while (true) {
            System.out.println("Какую планету хотите посмотреть? НАПИШИТЕ ЕЕ НАЗВАНИЕ НА АНГЛИЙСКОМ!! \n  Например:  \"Earth\" , or \"Mercury\" ");
            str = sc.nextLine();
            switch (str){
                case MercuryPlanetImpl.nameOfPlanet:
                    planetReporterServiceImpl.print(new MercuryPlanetImpl());
                    System.exit(0);
                    break;
                case EarthPlanetImpl.nameOfPlanet:
                    planetReporterServiceImpl.print(new EarthPlanetImpl());
                    System.exit(0);
                    break;
                default:
                    System.out.println("Нет такой планеты, пробуй еще");
                    break;
            }
        }
    }
}
