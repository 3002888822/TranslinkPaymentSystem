package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private UserDao userDao;
	
	@Override
	public void init() throws ServletException {
		userDao = new UserDao();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("email");
        String password = req.getParameter("password");
        String firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");
        String mobile = req.getParameter("mobile");
        User user = new User();
        user.setName(firstname);
        user.setLastname(lastname);
        user.setMobile(mobile);
        user.setUsername(username);
        user.setPassword(password);

        try {
            if (userDao.newUser(user)) {
                //HttpSession session = request.getSession();
                // session.setAttribute("username",username);
                resp.sendRedirect("registersuccess.jsp");
            } else {
                HttpSession session = req.getSession();
                session.setAttribute("user", username);
                resp.sendRedirect("register_failed.jsp");
            }
        } catch (ClassNotFoundException e) {
            System.err.print(e.getStackTrace());
        }
	}
}
