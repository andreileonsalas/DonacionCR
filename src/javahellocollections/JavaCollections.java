/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahellocollections;

import JavaMVCControllers.*;
import JavaMVCModels.DonacionCRModel;
import JavaMVCViews.*;

/**
 *
 * @author Andrei Leon Salas
 */
public class JavaCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DonacionCRView view = new DonacionCRView();
        //IniciateSession sesion = new IniciateSession(view);
        DonacionCRModel model = new DonacionCRModel();
        DonacionCRController controller = new DonacionCRController();
        // Start the application
        controller.startApplication(model,view);
    }
}
