/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correction;

import correction.GUI.MainWindowController;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author korabel245
 */
public class FileWorker {
    private static void newFile() throws FileNotFoundException {
        File gcFile = new File("gcode.txt");
            if(!gcFile.exists()){
            try {
                gcFile.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(MainWindowController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            PrintWriter out = new PrintWriter(gcFile.getAbsoluteFile());
            System.out.println("helloworldo");
            out.print("helloworldo");
            out.close();
    }
    
    private void openFile(){
    }
    
    
    
}
