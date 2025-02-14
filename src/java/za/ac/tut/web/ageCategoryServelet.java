package za.ac.tut.web;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.business.AgeCategoryClass;

public class ageCategoryServelet extends HttpServlet {
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        int age=Integer.parseInt(request.getParameter("age"));
        
        AgeCategoryClass aG = new AgeCategoryClass();
        String catergory = aG.determineAgeCategory(age);
        
        
        request.setAttribute("age", age);
        request.setAttribute("catergory", catergory);
        
        RequestDispatcher rD = request.getRequestDispatcher("output.jsp");
        rD.forward(request, response);
        
        
    }


  
}
