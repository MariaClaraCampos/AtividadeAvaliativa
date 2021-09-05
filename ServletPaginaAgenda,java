package atividades;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletPaginaAgenda
 */
@WebServlet("/ServletPaginaAgenda")
public class ServletPaginaAgenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPaginaAgenda() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("index.jsp");
		PrintWriter saida = response.getWriter();
		saida.write("<HTML><TITLE>PaginaAgenda</TITLE><BODY>");
		saida.write("Bem vindo ao formulário para cadastrar seus dados.<BR>");
		saida.write("Clique em prosseguir para cadastrar seus dados.<BR>");
		saida.write("<form action=\"/atividade/Index.jsp\" method=\"get\">");

		saida.write("<input type=\"submit\" value=\"PROSSEGUIR\" />");
		
		saida.write("</form>");
		saida.write("</BODY></HTML>");
		saida.close();
			}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
