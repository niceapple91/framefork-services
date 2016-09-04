package com.soap.bussiness.model.constructorsDAO;

/**
 * Created by Администратор on 04.09.2016.
 */


import com.adidas.sef.ws.schema.model.*;
import com.soap.properties.SimplePropertyCreator;


public class MacroModelConstructor {

    public static MacroModel createTN_MM(){
        MacroModel macroModel = new MacroModel();
        SimplePropertyCreator reader = new SimplePropertyCreator();
        macroModel.setMidSoleDescription(reader.getProperty("midSoleDescription"));
        macroModel.setOutSoleDescription(reader.getProperty("outSoleDescription"));
        macroModel.setSilhouetteDescription(reader.getProperty("silhouetteDescription"));
        return macroModel;
    }

}
