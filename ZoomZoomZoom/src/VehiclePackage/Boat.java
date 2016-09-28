/**
 *
 * @author Mikhail "Justin"-Guy Lessey-Hordatt
 */

package VehiclePackage;


public class Boat extends Vehicle
{

    public Boat()
    {
        this.colour = "White";
        this.name = "Boat";
        this.wheels = 0;
        this.doors = 73;
        this.speed = 45;
    }

    @Override
    public String honk()           
    {
        return ("BRRRRUuuuuuuuuuuuuuuuNNNNNNNTTTTTTTTTTTTTTTT ");
    }

    @Override
    public String move()            
    {
        return ("The boat meanders slowly out of view, thank you for"
                + " observing the no wake zone.");
    }

}
