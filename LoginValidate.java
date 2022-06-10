package package1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginValidate
 */
public class LoginValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginValidate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		pw.print("I reached in servlet");
		
		String loginName= request.getParameter("loginName");
		String password= request.getParameter("password");
		
		pw.print(loginName + password);
		
		if(loginName.equals("Shivani") && password.equals("1234")){
			//pw.print("Welcome valid user");
			RequestDispatcher view = request.getRequestDispatcher("Valid.jsp");
			view.forward(request, response);
		
		}
		else{
			pw.print("Invalid User");
		}
	}

}
