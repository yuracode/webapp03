package chapter00;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/sample00")
public class ServletSample extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) 
        throws ServletException, IOException {
        // resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.print("Hello Servlet");
        // out.println("<html>");
        // out.println("<head>");
        // out.println("<title>Servlet Sample</title>");
        // out.println("</head>");
        // out.println("<body>");
        // out.println("<h1>Servlet Sample</h1>");
        // out.println("<p>This is a sample servlet.</p>");
        // out.println("</body>");
        // out.println("</html>");
    }
    
}
