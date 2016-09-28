/* @author Mikhail "Justin"-Guy Lessey-Hordatt
 * Unable to learn all that I needed to create a file logger in time required.
 * class is set up to be unique using Singleton Design Pattern methodologies 
 * 
 */
package VehiclePackage;

import java.util.logging.Logger;

public class VehicleLogger
{

    //Method set up for Singleton Pattern. 
    private static VehicleLogger uniqueInstance;

    private VehicleLogger()
    {

    }

    public static VehicleLogger getInstance()
    {
        if (uniqueInstance == null)
        {
            uniqueInstance = new VehicleLogger();
        }
        return uniqueInstance;
    }

}
