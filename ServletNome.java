package atividade_avaliativa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletNome
 */
@WebServlet("/ServletNome")
public class ServletNome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletNome() {
        super();
        // TODO Auto-generated constructor stub
        
    }
        
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       PrintWriter saida = response.getWriter();
		saida.write("<HTML><BODY>");
		saida.write("Olá, " + request.getParameter("nome") + ", seja bem vindo(a)!!! <BR>");
		saida.write("Seu primeiro nome é: " + request.getParameter("nome") + ".<BR>" + "E seu sobrenome é " + request.getParameter("nome2") + ".<BR>" );
		saida.write("Agradecemos pelas informações Sr./Sra. " + request.getParameter("nome2"));
		saida.write("</BODY></HTML>");
		saida.close();
    }

}
