import data.impl.*;
import service.impl.PlanetReporterServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PlanetReporterServiceImpl planetReporterServiceImpl = new PlanetReporterServiceImpl();
        Scanner sc = new Scanner(System.in);
        char number = ' ';
        while (true) {
            System.out.println("\nКакую планету выбираете?");
            System.out.println("1 - Mercury");
            System.out.println("2 - Venus");
            System.out.println("3 - Earth");
            System.out.println("4 - Mars");
            System.out.println("5 - Jupiter");
            System.out.println("6 - Saturn");
            System.out.println("7 - Uranus");
            System.out.println("8 - Neptune");
            System.out.println("\n9 - Выйти с программы");
            number = sc.next().charAt(0);
            switch (number){
                case '1':
                    planetReporterServiceImpl.print(new MercuryPlanetImpl());
                    break;
                case '2':
                    planetReporterServiceImpl.print(new VenusPlanetImpl());
                    break;
                case '3':
                    planetReporterServiceImpl.print(new EarthPlanetImpl());
                    break;
                case '4':
                    planetReporterServiceImpl.print(new MarsPlanetImpl());
                    break;
                case '5':
                    planetReporterServiceImpl.print(new JupiterPlanetImpl());
                    break;
                case '6':
                    planetReporterServiceImpl.print(new SaturnPlanetImpl());
                    break;
                case '7':
                    planetReporterServiceImpl.print(new UranusPlanetImpl());
                    break;
                case '8':
                    planetReporterServiceImpl.print(new NeptunePlanetImpl());
                    break;
                case '9':
                    System.exit(0);
                    break;
                default:
                    System.out.println("Нет такого номера планеты, пробуй еще");
                    break;
            }
        }
    }
}
