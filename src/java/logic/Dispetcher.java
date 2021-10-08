
package logic;

import core.BaseController;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Dispetcher", urlPatterns = {"/mydispetcher"})
public class Dispetcher extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
        
        String page = request.getParameter("page");
        String cont = request.getParameter("cont");
        
        try {
            Class c = Class.forName("controller." + cont + "Controller");
            BaseController bc = (BaseController) c.newInstance();
            bc.request = request;
            bc.response = response;
            
            Method m = c.getMethod(page, null);
            m.invoke(bc, null);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
  
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
