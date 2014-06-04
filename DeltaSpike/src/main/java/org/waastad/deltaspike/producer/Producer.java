/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.waastad.deltaspike.producer;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import org.waastad.deltaspike.controller.SessionController;
import org.waastad.deltaspike.qialifier.CurrentController;

/**
 *
 * @author helge
 */
public class Producer {
    
    @Produces
    @SessionScoped
    @Named("sessionController")
    @CurrentController
    public SessionController getSessionController(@New SessionController sessionController) {
        return sessionController;
    }
    
}
