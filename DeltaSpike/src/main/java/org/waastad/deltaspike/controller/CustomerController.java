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
public class CustomerController implements Serializable {

    @Inject
    @CurrentController
    SessionController sessionController;

    private static final long serialVersionUID = 8238205035284019115L;
    
    @PostConstruct
    public void construct() {
        System.out.println("CustomerController postconstruct: " + new Date());
    }
    
    @PreDestroy
    public void destroy(){
        System.out.println("CustomerController postdestroy: " + new Date());
    }

    public String startCustomerConfig() {
        sessionController.setCustomerId(1);
        return String.format("/secure/site/index.xhtml?faces-redirect=true&customerId=%s", 1);
    }

}
