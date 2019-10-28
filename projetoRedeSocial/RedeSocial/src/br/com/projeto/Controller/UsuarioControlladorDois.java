package br.com.projeto.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.bens.UsuarioDois;
import br.com.projeto.redesocial.UsuarioDAODois;

/**
 * Servlet implementation class UsuarioControlladorDois
 */
@WebServlet("/UsuarioControlladorDois")
public class UsuarioControlladorDois extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioControlladorDois() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsuarioDois usu = new UsuarioDois();
		String acao = request.getParameter("acao");
		UsuarioDAODois usuDAODois = new UsuarioDAODois();
		
		if(acao != null && acao.contentEquals("lis")) {
			List<UsuarioDois> lista = usuDAODois.buscaTodosPago(usu);
			request.setAttribute("lista", lista);
			RequestDispatcher saida = request.getRequestDispatcher("listaUsuario.jsp");
			saida.forward(request, response);
		}
		else if(acao != null && acao.contentEquals("alt")) {
				String nome_usuario = request.getParameter("nome_usuario");
				UsuarioDois usuario = usuDAODois.buscaporId(nome_usuario);
				request.setAttribute("usuario", usuario);
				request.getRequestDispatcher("AlteraCadastro.jsp").forward(request, response);
		}
		else if(acao != null && acao.contentEquals("cadPago")) {
			RequestDispatcher saida = request.getRequestDispatcher("CadastroPago.jsp");
			saida.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String snome_usuario = request.getParameter("nome_usuario");
		String ssenha = request.getParameter("senha");
		String sdata_nascimento = request.getParameter("data_nascimento");
		String sdata_ciencia = request.getParameter("data_ciencia");
		String sestado = request.getParameter("estado");
		String scidade = request.getParameter("cidade");
		String ssalario = request.getParameter("salario");
		String snivelInstrucao = request.getParameter("nivelInstrucao");
		String sempresa = request.getParameter("empresa");
		String snum_cartao = request.getParameter("num_cartao");
		String snome_resp = request.getParameter("nome_resp");
		String sdt_validade = request.getParameter("dt_validade");
		String scvc = request.getParameter("cvc");
		
		
		UsuarioDois usuario = new UsuarioDois();
		usuario.setNome_usuario(snome_usuario);
		usuario.setSenha(ssenha);
		usuario.setData_nascimento(sdata_nascimento);
		usuario.setData_ciencia(sdata_ciencia);
		usuario.setEstado(sestado);
		usuario.setCidade(scidade);
		usuario.setSalario(ssalario);
		usuario.setNivelInstrucao(snivelInstrucao);
		usuario.setEmpresa(sempresa);
		usuario.setNum_Cartao(snum_cartao);
		usuario.setNome_Resp(snome_resp);
		usuario.setDt_Validade(sdt_validade);
		usuario.setCvc(scvc);
		
		UsuarioDAODois usuDAODois = new UsuarioDAODois();
		usuDAODois.update(usuario);
		PrintWriter out = response.getWriter();
		response.sendRedirect("UsuarioControlladorDois?acao=lis");
	}
}


