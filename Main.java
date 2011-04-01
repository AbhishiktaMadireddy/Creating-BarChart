/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bargraph;
import processing.core.*;



public class Main extends PApplet{
    

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
    
    
   