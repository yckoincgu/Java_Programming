package DX06servlet_package;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import objTemplate.Cal_04_PriorityExpression;
//import calculatorPackage.Cal_03_Operation;

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
		String priorityExpression=request.getParameter("priorityExpression");
		Cal_04_PriorityExpression a=new Cal_04_PriorityExpression();
		String outputResult;
		
		if(!priorityExpression.contains("(")) {
			outputResult=Double.toString(a.getResultOfArithmeticExpression(priorityExpression));
			System.out.print("arithmeticExpression = "+priorityExpression+ "\n");	}
		else
			outputResult=Double.toString(a.getResultOfArithmeticExpression(a.transferPriorityToArithmeticExpression(priorityExpression)));	 
		
		
	    response.setContentType("text/html");
	    PrintWriter writer = response.getWriter();
	    writer.println("<html><body>");
	    writer.println("<h1>" + "Arithmetic Expression: " + priorityExpression+"</h1><br />");
	    writer.println("<h1>Its result is " + outputResult + "</h1>");
	    writer.println("</body></html>");		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
