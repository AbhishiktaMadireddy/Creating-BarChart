/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bargraph;
import processing.core.*;



public class Main extends PApplet{
    @Override
    public void setup(){
        int windowWidth = Integer.parseInt(args[1]);
        int windowHeight = Integer.parseInt(args[2]);
        size(windowWidth, windowHeight);
        float dataMax = 0;
        float dataValues[] = new float [args.length-3];
        float normalisedValues[] = new float [dataValues.length];
        float barWidth = 0;
        float maxHeight = windowHeight - 20;
        float locationX = 0;
        float locationY = 0;

        //loop to copy the elements in args to dataValues array excludind the first three arguments
        for(int i = 3; i < args.length; i++){
             dataValues[i-3] = Float.parseFloat(args[i]);

         }
        //loop to find the largest value from the arguments given in dataValues array
        for(int i = 0; i < dataValues.length; i++){
               if(dataValues[i] > dataMax)
                 dataMax = dataValues[i];
         }
         //loop to find the normalisedvalues by dividing every values with the largest number
         for(int i = 0; i< dataValues.length; i++){
            normalisedValues[i] = (dataValues[i]/dataMax);
         }
        //To calculate the barwidth of the number of bars present
          barWidth = (((windowWidth-5)/dataValues.length) - 5);
                System.out.println(barWidth);
                background(205);
                //smooth edges for the bars, visual refinement
                smooth();
     public static void main(String[] args) {
        //Create an array which will be sent to the PApplet's main function
        //This array should include the arguments from the comand line and
        //the arguments that processing requires. The first two will be used by
        //the Processing API and the rest will be used by our program.
        String tempArgs[] = new String[args.length + 2];

        //Set the parameters which will be used by Processing's API
        tempArgs[0] = "--bgcolor=#FFFFFF";
        tempArgs[1] = "bargraph.Main";

        //Append the arguments from the command line to the end of the tempArray
        for(int i = 2; i < tempArgs.length; i++){
            tempArgs[i] = args[i-2];

        }

        //Send the String array to the PApplet's main function.
        PApplet.main(tempArgs);
    }

}
    
    
   
