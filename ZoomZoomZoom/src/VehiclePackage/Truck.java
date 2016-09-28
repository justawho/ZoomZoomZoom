/* @author Mikhail "Justin"-Guy Lessey-Hordatt
 * 
 * 
 * 
 */
package VehiclePackage;


public class Truck extends Vehicle
{

    public Truck()
    {
        this.colour = "Red";
        this.name = "Truck";
        this.wheels = 4;
        this.doors = 4;
        this.speed = 120;
    }

    @Override
    public String honk()
    {
        return ("Beep Beep I'm A truck!");
    }

    @Override
    public String move()
    {
        return ("This truck is going very dangerously down the highway, 120mph to be exact!");
    }

}
