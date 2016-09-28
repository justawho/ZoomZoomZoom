/* @author Mikhail "Justin"-Guy Lessey-Hordatt
 * An Abstract Vehicle provides an interface for a family of products.
 * 
 * Explination brought by stackoverflow. 
 * 
 * The abstract class inheritance is used when the derived class shares the core 
 * properties and behaviour of the abstract class. The kind of behaviour that 
 * actually defines the class.On the other hand interface inheritance is used when 
 * the classes share peripheral behaviour, ones which do not necessarily define the
 * derived class.
 * For eg. A Car and a Truck share a lot of core properties and behaviour of an 
 * Automobile abstract class, but they also share some peripheral behaviour like 
 * Generate exhaust which even non automobile classes like Drillers or PowerGenerators 
 * share and doesn't necessarily defines a Car or a Truck, so Car, Truck, Driller 
 *and PowerGenerator can all share the same interface IExhaust. 
 */
package VehiclePackage;


public abstract class Vehicle
{

    String name;
    String colour;
    Integer wheels;
    Integer doors;
    Integer speed;

    abstract String honk();     //All vehicles give a string representation of their horn.

    abstract String move();     // Vehicles move differently, A vignette of the vehicle moving. 

    String getName()
    {
        return name;
    }

    void setName(String name)
    {
        this.name = name;
    }

    String getColour()
    {
        return colour;
    }

    void setColour(String colour)
    {
        this.colour = colour;
    }

    Integer getNumWheels()
    {
        return wheels;
    }

    void setNumWheels(Integer wheels)
    {
        this.wheels = wheels;
    }

    Integer getNumDoors()
    {
        return doors;
    }

    void setNumDoors(Integer doors)
    {
        this.doors = doors;
    }

    Integer maxSpeed()
    {
        return speed;
    }

    void setMaxSpeed(Integer speed)
    {
        this.speed = speed;
    }
    
    public String toString(){
        return "This "+ name+", goes " + speed+" miles per hour. It has, "+doors+
                " doors, and "+ wheels+ " wheels. The most common colour of "
                +name+"s is "+colour+".";
    }

}
