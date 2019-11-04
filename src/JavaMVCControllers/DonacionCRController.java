/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMVCControllers;

import JavaMVCViews.*;
import JavaMVCModels.*;

/**
 *
 * @author Andrei Leon Salas
 */
public class DonacionCRController {
    
    private DonacionCRModel model;
    private DonacionCRView view;
    
    public void startApplication(DonacionCRModel model,DonacionCRView view) {
        // View the application's GUI
        //view = new DonacionCRView();
        //model = new DonacionCRModel();
        this.view = new DonacionCRView();
        this.model = new DonacionCRModel();
        this.view.setController(this);
        this.view.setVisible(true);
        
    }
    
    public String getMessage() {
        try {
            //DonacionCR model = new DonacionCRModel();
            return this.model.getDemotext();
        } catch (Exception er) {
            return "There was an error.";
        }
    }
    
    public void writeMessage(String message) {
        try {
            //DonacionCR model = new DonacionCRModel();
            this.model.setDemotext(message);
        } catch (Exception er) {
            
        }
    }
}
