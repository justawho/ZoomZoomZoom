/*@author Mikhail "Justin"-Guy Lessey-Hordatt
 * Vehice Factory class used to instaniate different vehicle classes. 
 * 
 * 
 */
package VehiclePackage;


public class VehicleFactory
{

    public static Vehicle createVehicle(String type)
    {
        switch (type)
        {
            case "Truck":
                return new Truck();
            case "Car":
                return new Car();
            case "Motorcycle":
                return new Motorcycle();
            case "Rocket":
                return new Rocket();
            case "Boat":
                return new Boat();
            default:
                return null;

        }

    }

}
