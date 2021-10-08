package core;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public abstract class BaseController {
    
    public HttpServletRequest request;
    public HttpServletResponse response;
    
    public void redirect(String myPage){
        try {
            RequestDispatcher rs = request.getRequestDispatcher(myPage + ".jsp");
            rs.forward(request, response);
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
    }
    
}
