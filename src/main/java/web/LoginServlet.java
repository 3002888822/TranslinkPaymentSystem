package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private UserDao userDao;
	
	@Override
	public void init() throws ServletException {
		userDao = new UserDao();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
        String password = req.getParameter("password");
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        try {
            if (userDao.validate(user)) {
                //HttpSession session = request.getSession();
                // session.setAttribute("username",username);
                resp.sendRedirect("loginsuccess.jsp");
            } else {
                HttpSession session = req.getSession();
                session.setAttribute("user", username);
                resp.sendRedirect("after_login.jsp");
            }
        } catch (ClassNotFoundException e) {
            System.err.print(e.getStackTrace());
        }
	}
}
