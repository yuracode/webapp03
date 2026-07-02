package chapter00;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// 4. 404エラーを返す
@WebServlet("/sample03")
public class ServletNotFound extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        resp.sendError(HttpServletResponse.SC_NOT_FOUND, "このページは意図的に404を返しています");
    }
}