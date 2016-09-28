/* @author Mikhail "Justin"-Guy Lessey-Hordatt
 * 
 * 
 * 
 */
package VehiclePackage;


public class Motorcycle extends Vehicle
{

    public Motorcycle()
    {
        this.colour = "Blue";
        this.name = "Motorcycle";
        this.wheels = 2;
        this.doors = 0;
        this.speed = 200;
    }

    @Override
    public String honk()
    {
        return ("You hear a small honk but it swiftly zooms by you.");
    }

    @Override
    public String move()
    {
        return ("A tiny motorcylce race down the highway and almost hits those kids!");
    }

}
