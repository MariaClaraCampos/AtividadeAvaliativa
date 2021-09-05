package atividades;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletCalculadora
 */
@WebServlet("/ServletCalculadora")
public class ServletCalculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCalculadora() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter saida = response.getWriter();
		
		String V1 = request.getParameter("PrimeiroValor");
		String V2 = request.getParameter("SegundoValor");
		String other = request.getParameter("Opcao");
		
		double num1 = Double.parseDouble(V1);
		double num2 = Double.parseDouble(V2);
		double result = 0;
		
		if(other.equals("+")){
			result = num1 + num2;
		}
		
		else if(other.equals("-")){
			result = num1 - num2;
		}
		
		else if(other.equals("*")){
			result = num1 * num2;
		}
		
		else if(other.equals("/")){
			result = num1 / num2;
		}
		
		saida.print("<h3>Resultado da operação</h3>" + result);
	}

}
