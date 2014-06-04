/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.waastad.deltaspike.controller;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.deltaspike.core.api.scope.ViewAccessScoped;
import org.waastad.deltaspike.qialifier.CurrentController;

/**
 *
 * @author helge
 */
@Named
@ViewAccessScoped
public class ViewController implements Serializable {

    private static final long serialVersionUID = 1403241548402413891L;
    @Inject
    @CurrentController
    private SessionController sessionController;

    @PostConstruct
    public void construct() {
        System.out.println("ViewController postconstruct: " + new Date());
    }
    
    @PreDestroy
    public void destroy(){
        System.out.println("ViewController postdestroy: " + new Date());
    }

    public String doAction() {
        return "/secure/customer/index.xhtml?faces-redirect=true";
    }

}
