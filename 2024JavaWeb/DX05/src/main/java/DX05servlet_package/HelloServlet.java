package DX05servlet_package;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import calculatorPackage.Cal_03_Operation;



/**
 * Servlet implementation class HelloServlet
 */
@WebServlet(
		urlPatterns = { "/HelloServlet" }, 
		initParams = { 
				@WebInitParam(name = "priorityExpression", value = "value")
		})

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String outputResult="";
		String priorityExpression = request.getParameter("priorityExpression");
		
		Cal_03_Operation a=new Cal_03_Operation();
		
		if(!priorityExpression.contains("(")) {
			outputResult=Double.toString(a.getResultOfArithmeticExpression(priorityExpression));
			System.out.print("arithmeticExpression = "+priorityExpression+ "\n");	}
		else
			outputResult=Double.toString(a.getResultOfArithmeticExpression(a.transferPriorityToArithmeticExpression(priorityExpression)));	    
	    // Perform your desired operation using the expression
	    //String outputMessage = "This is server which received your parameter : " + expression;
	    response.setContentType("text/html");
	    PrintWriter writer = response.getWriter();
	    writer.println("<html><body>");
	    writer.println("<h1>" + "Arithmetic Expression: " + priorityExpression+"</h1><br />");
	    writer.println("<h1>Its result is " + outputResult + "</h1>");
	    writer.println("</body></html>");
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
