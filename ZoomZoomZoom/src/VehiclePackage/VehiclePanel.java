/*@author Mikhail "Justin"-Guy Lessey-Hordatt
 * GUI component of program. 
 * Added ToString Button to show information about vehicle classes Instead of making 
 * Trillion different buttons. ToString method uses vehicle information to paint a picture.
 */
package VehiclePackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VehiclePanel
{

    String[] vehicles =
    {
        "Car", "Truck", "Motorcycle", "Boat", "Rocket"
    };
    JComboBox box = new JComboBox(vehicles);
    JButton honk = new JButton("Honk!");
    JButton move = new JButton("Move!");
    JButton stringTheory = new JButton("String Theory");
    JLabel label = new JLabel("Pick a Vehicle.");
    
    public VehiclePanel()
    {
        frame();
    }

    public void frame()
    {
        JFrame frame = new JFrame();

        
        
        
        frame.setSize(800, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel main = new JPanel();
        
        JPanel subPanel = new JPanel();
        subPanel.setPreferredSize(new Dimension(800,100));
        
        JPanel subPanel2 = new JPanel();
        

        
        main.add(subPanel);
        main.add(subPanel2);
        subPanel.add(label);
        subPanel2.add(box);
        subPanel2.add(honk);
        subPanel2.add(move);
        subPanel2.add(stringTheory);

        frame.add(main);
        frame.setVisible(true);
        honk.addActionListener((ActionEvent event) ->
        {
            String capture = box.getSelectedItem().toString();
            Vehicle vehicle = VehicleFactory.createVehicle(capture);

            label.setText(vehicle.honk());
        });

        move.addActionListener((ActionEvent event) ->
        {
            String capture = box.getSelectedItem().toString();
            Vehicle vehicle = VehicleFactory.createVehicle(capture);

            label.setText(vehicle.move());
        });
        
        stringTheory.addActionListener((ActionEvent event) ->
        {
            String capture = box.getSelectedItem().toString();
            Vehicle vehicle = VehicleFactory.createVehicle(capture);

            label.setText(vehicle.toString());
        });
    }

    public static void main(String[] args)
    {
        VehicleFactory vehicleFactory = new VehicleFactory();
        VehiclePanel vehiclePanel = new VehiclePanel();
    }
}
