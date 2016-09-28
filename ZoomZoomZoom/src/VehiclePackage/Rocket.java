/* @author Mikhail "Justin"-Guy Lessey-Hordatt
 * 
 * 
 * 
 */
package VehiclePackage;


public class Rocket extends Vehicle
{
    
    public Rocket()
    {
        this.colour = "White";
        this.name = "Rocket";
        this.wheels = 0;
        this.doors = 3;
        this.speed = 24791;
        
    }

    @Override
    public String honk()
    {
        return ("You hear no horn because you are deafened by the Rocket taking off. "
                + "Also there is no horn for in space no one can hear you honk!");
    }

    @Override
    public String move()
    {
        return ("This rocket is blasting off again!");
    }

    @Override
    public String toString()
    {
        return "This " + name + ", goes at the speed of light! It has, " + doors
                + " doors, and " + wheels + " wheels. The most common colour of "
                + name + "s is " + colour + ".";
    }

}
