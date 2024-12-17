package JP01_package;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet(
		urlPatterns = { "/HelloServlet" }, 
		initParams = { 
				@WebInitParam(name = "inputExpression", value = "value")
		})
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String expression = getInitParameter("inputExpression");
	    // Perform your desired operation using the expression
	    String outputMessage = "This is server receiving your parameter : " + expression;
	    response.setContentType("text/html");
	    PrintWriter writer = response.getWriter();
	    writer.println("<html><body>");
	    writer.println("<h1>" + "Hello ..... " + "</h1><br />");
	    writer.println("<h1>" + outputMessage + "</h1>");
	    writer.println("</body></html>");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
