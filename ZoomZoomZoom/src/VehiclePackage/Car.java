/* @author Mikhail "Justin"-Guy Lessey-Hordatt
 * 
 * 
 * 
 */
package VehiclePackage;


public class Car extends Vehicle
{

    public Car()
    {
        this.colour = "Black";
        this.name = "Car";
        this.wheels = 4;
        this.doors = 4;
        this.speed = 175;
    }

    @Override
    public String honk()
    {
        return ("Honk! Honk!");
    }

    @Override
    public String move()
    {
        return ("Your grandma is driving this car, Watch out grandma!");
    }

}
