package equationfinder;
import javax.swing.*;

/**
 *
 * @author Jaken Herman
 * 1/15/2015
 * 
 * This extremely simple program finds both the slope and the equation for
 * a user-specified set of 2 points on a graph.
 */
public class EquationFinder {

    public static void main(String[] args) {
        
        String y2s = JOptionPane.showInputDialog("What is the second y-value?");
        double y2 = Double.parseDouble(y2s);
        
        String y1s = JOptionPane.showInputDialog("What is the first y-value?");
        double y1 = Double.parseDouble(y1s);
        
        String x2s = JOptionPane.showInputDialog("What is the second x-value?");
        double x2 = Double.parseDouble(x2s);
        
        String x1s = JOptionPane.showInputDialog("What is the first x-value?");
        double x1 = Double.parseDouble(x1s);
        
        /*no need to call calculateSlope on its own, it will show slope dialog
        box within our calling offindEquation
        */
        
        findEquation(calculateSlope(y2, y1, x2, x1), y2, y1, x2, x1);
        System.exit(0);
    }
    
    
    public static double calculateSlope(double y2, double y1, 
                                        double x2, double x1){
        
        //m = (y2-y1)/(x2-x1)
        
        double slope = (y2-y1)/(x2-x1);
        JOptionPane.showMessageDialog(null,"The slope is " + slope);
        return slope;
    }
    
    
    public static String findEquation(double slope, double y2, double y1,
                                      double x2, double x1){
        
        double b = y2 - (slope*x2);
        
        String bString = String.valueOf(b);
        
        //y = mx + b
        String slopeString = String.valueOf(slope);
        String equation = String.format("y = %s x + %s", slopeString, b);
        JOptionPane.showMessageDialog(null, 
                String.format("The slope is %s",equation));
        
        return equation;
    }
}
