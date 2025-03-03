/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;
import java.awt.*;
import java.applet.*;

public class DrawShapes extends Applet {
    Font font;
    Color redColor;
    Color blueColor;
    Color backgroundColor;
    
    public void init() {
        // The font is Arial size, 18 and is italicized
        font = new Font("Arial", Font.ITALIC, 18);
        
        //Some colors are predefined in the Color class
        redColor = Color.red;
        backgroundColor = Color.orange;
        
        //Colors can be created using Red, Green, Blue values
        blueColor = new Color(0,0,122);
        
        //Set the background Color of the applet
        setBackground(backgroundColor);
    }
    
    public void stop() {
    }
    
    /** This method paints the shapes to the screen */
    public void paint(Graphics graph) {
        //Set font
        graph.setFont(font);
        
        //Create a title
        graph.drawString("Draw Shapes",90,20);
        
        //Set the color for the first shape
        graph.setColor(blueColor);
        
        //Draw a rectangle using drawRect(x, y, width, height)
        graph.drawRect(120,120,120,120);
        
        //This will fill a rectangle
        graph.fillRect(115,115,90,90);
        
        //Set the color for the next shape
        graph.setColor(redColor);
        
        //Draw a circle using drawArc(x, y, width, height, startAngle, arcAngle)
        graph.drawArc(110,110,50,50,0,360);
        
        //Set color for next shape
        graph.setColor(Color.CYAN);
        
        //Draw another rectangle
        graph.drawRect(50,50,50,50);
        
        //This will fill a rectangle
        graph.fillRect(50,50,60,60);
    }
}
