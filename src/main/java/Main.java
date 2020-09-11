
import services.CityServices;

import java.io.IOException;


public class Main {


    public static void main(String[] args) throws IOException {
        CityServices cityServices= new CityServices();
        System.out.println("Input sisayang : ");
        System.out.println(cityServices.getCitiesByInputString("sisayang"));
        System.out.println("Input pulxu pqnjzng : ");
        System.out.println(cityServices.getCitiesByInputString("pulxu pqnjzng"));
        System.out.println("Input zogjakarta : ");
        System.out.println(cityServices.getCitiesByInputString("zogjakarta"));
    }

}
