package servlet;

import com.google.common.base.Strings;
import com.sda.model.Tweet;
import com.sda.model.User;
import com.sda.service.MyTwitterService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "publishServlet", value = "/public")
public class PublishServlet extends HttpServlet {

    public static final String AUTHOR_COOKIE = "author-cookie";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


//        User author = (String) req.getParameter("author");
//        String message = (String) req.getParameter("message");
//
//        MyTwitterService service = MyTwitterService.getInstance();
//
//        if (Strings.isNullOrEmpty(author) && Strings.isNullOrEmpty(message)) {
//            resp.sendRedirect("/public.jsp?error");
//        } else {
//            Cookie authorCookie = new Cookie(AUTHOR_COOKIE, author);
//            authorCookie.setMaxAge(900);
//            resp.addCookie(authorCookie);
//
//            Tweet myTweet = new Tweet(author, message, System.currentTimeMillis());
//            service.addTweet(myTweet);
//            resp.sendRedirect("/index.jsp");
//        }
    }
}
