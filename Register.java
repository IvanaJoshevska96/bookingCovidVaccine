

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String idNum=request.getParameter("idNum");
		String age=request.getParameter("age");
		String address=request.getParameter("address");
        String municipality=request.getParameter("municipality");
        String mobile=request.getParameter("mobile");
        String email=request.getParameter("email");
       
        
        
        
        
        
        Member member=new Member(firstname,lastname,idNum,age,address,municipality,mobile,email);
        
        RegisterDao register=new RegisterDao();
       String res= register.insert(member);
		response.getWriter().print(res);
		
		
		
		
		
		
		
		
		
	}

}
