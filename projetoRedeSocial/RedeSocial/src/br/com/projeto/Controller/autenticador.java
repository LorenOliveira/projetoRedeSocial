package br.com.projeto.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.bens.Usuario;
import br.com.projeto.bens.UsuarioDois;
import br.com.projeto.redesocial.UsuarioDAO;
import br.com.projeto.redesocial.UsuarioDAODois;

/**
 * Servlet implementation class autenticador
 */
@WebServlet("/autenticador")
public class autenticador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public autenticador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String snome = request.getParameter("nome_usuario");
		String ssenha = request.getParameter("senha");
	
		Usuario usu = new Usuario();
		usu.setNome_usuario(snome);
		usu.setSenha(ssenha);
		
		UsuarioDAO usuDAO = new UsuarioDAO();
		Usuario usuAutenticado = usuDAO.autenticacao(usu);
		
		UsuarioDois usuDois = new UsuarioDois();
		usuDois.setNome_usuario(snome);
		usuDois.setSenha(ssenha);
		
		UsuarioDAODois usuDAODois = new UsuarioDAODois();
		UsuarioDois usuAutenticadoDois = usuDAODois.autenticacao(usuDois);
		
		if(usuAutenticado != null) {
			request.getRequestDispatcher("home.jsp").forward(request, response);
			
		}
		else if(usuAutenticadoDois != null) {
			request.getRequestDispatcher("home.jsp").forward(request, response);
			
		}
		else {
			response.sendRedirect("ErroLogin.jsp");
		}
	}

}
