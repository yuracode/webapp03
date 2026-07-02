package chapter03;


import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
// 5. 500エラーを返す
@WebServlet("/sample04")
public class ServletServerError extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            // double a = 1 / 0; // 故意に例外を発生させる
        response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "サーバー内部エラーの例");
    }
}