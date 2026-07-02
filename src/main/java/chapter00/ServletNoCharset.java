package chapter00;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// 2. charsetを設定しない版（文字化け確認用）
@WebServlet("/sample01")
public class ServletNoCharset extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        // charset未設定 → 日本語が文字化けする
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>文字化け確認用ページ</h1>");
        out.println("</body></html>");
    }
}