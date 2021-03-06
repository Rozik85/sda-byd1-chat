package servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "loginServlet", value = "/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String nick = req.getParameter("nick");
        String password = req.getParameter("password");

        if (nick.equals("darek") && password.equals("123")) {
            Cookie authorCookie = new Cookie("userid", "1");
            authorCookie.setMaxAge(600);
            resp.addCookie(authorCookie);

            resp.sendRedirect("/index.jsp");
        } else {
            resp.sendRedirect("/login.jsp?error=1");
        }
    }
}
