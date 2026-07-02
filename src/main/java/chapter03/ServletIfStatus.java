package chapter03;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// 8. if文でstatusを分岐（true/falseで200/404を切り替え）
@WebServlet("/sample07")
public class ServletIfStatus extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");

        boolean flag = true; // ここをtrue/falseで切り替えて検証

        if (flag) {
            response.setStatus(HttpServletResponse.SC_OK);
        } else {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
        }

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>if文によるStatus切り替え</h1>");
        out.println("<p>flag: " + flag + "</p>");
        out.println("<p>Status: " + response.getStatus() + "</p>");
        out.println("</body></html>");
    }
}