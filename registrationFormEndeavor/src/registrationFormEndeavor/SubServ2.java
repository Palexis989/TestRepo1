package registrationFormEndeavor;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SubServ2 extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException
		{String username = request.getParameter("username");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String surname = request.getParameter("surname");
		String nickname = request.getParameter("nickname");
		String email = request.getParameter("email");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/plain");
		
		out.println("Registration Servlet");
		out.println();
		
		out.println("doPost() method invoked...");
		
		out.println("Here is the parameters sent in the form section");
		out.println();
		
		out.println("Account Data:");
		out.println();
		out.println("Username: " + username);
		out.println("Password: " + password);
		out.println();
		
		out.println("User Data:");
		out.println();
		out.println("Name: " + name);
		out.println("Surname: " + surname);
		out.println("Nickname: " + nickname);
		out.println("Email: " + email);
		out.println();
		
		Account account = new Account(username, password);
		User user = new User(name, surname, nickname, email);
		
		System.out.println("Account object: ");
		System.out.println();
		System.out.println("Username: " + account.readUsername());
		System.out.println("Password: " + account.readPassword());
		System.out.println();
		
		System.out.println("User object: ");
		System.out.println();
		System.out.println("Name: " + user.readName());
		System.out.println("Surname: " + user.readSurname());
		System.out.println("Nickname: " + user.readNickname());
		System.out.println("Email: " + user.readEmail());
		
		}
		
		public void doGet(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException
	    {PrintWriter out = response.getWriter();
	    response.setContentType("text/plain");
	    
	    out.println("Registration Servlet");
	    out.println();
	    
	    out.println("Sorry, this feature (doGet() method) is currently unsupported");
	    out.println();
	    }
	
}
