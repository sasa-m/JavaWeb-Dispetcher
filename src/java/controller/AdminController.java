
package controller;

import core.BaseController;


public class AdminController extends BaseController {
    
    public void details(){
        redirect("details");
    }
    
    public void help(){
        redirect("help");
    }
    
}
