package br.com.projeto.redesocial;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.projeto.bens.UsuarioDois;

public class UsuarioDAODois {
	private Connection con = Conexao.getConnection();
	
	public void cadastro(UsuarioDois usuario) {
		String sql = "INSERT INTO Cad_UsuarioPago(nome_usuario, senha, data_nascimento, data_ciencia, estado, cidade, salario, nivelInstrucao, empresa, num_cartao, nome_resp, dt_validade, cvc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, usuario.getNome_usuario());
			preparador.setString(2, usuario.getSenha());
			preparador.setString(3, usuario.getData_nascimento());
			preparador.setString(4, usuario.getData_ciencia());
			preparador.setString(5, usuario.getEstado());
			preparador.setString(6, usuario.getCidade());
			preparador.setString(7, usuario.getSalario());
			preparador.setString(8, usuario.getNivelInstrucao());
			preparador.setString(9, usuario.getEmpresa());
			preparador.setString(10, usuario.getNum_Cartao());
			preparador.setString(11, usuario.getNome_Resp());
			preparador.setString(12, usuario.getDt_Validade());
			preparador.setString(13, usuario.getCvc());
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Cadastrado com sucesso!");
		} catch (SQLException e) {
			System.out.println("Erro! " + e.getMessage());
		}
	}
		
	public UsuarioDois autenticacao(UsuarioDois usuario) {
		UsuarioDois usuRetorno = null;
		String sql = "SELECT * FROM Cad_UsuarioPago WHERE nome_usuario = ? AND senha = ?";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, usuario.getNome_usuario());
			preparador.setString(2,  usuario.getSenha());
			ResultSet resultado = preparador.executeQuery();
			
			if(resultado.next()) {
				usuRetorno = new UsuarioDois();
				usuRetorno.setNome_usuario(resultado.getString("nome_usuario"));
				usuRetorno.setSenha(resultado.getString("senha"));
			}
			System.out.println("Encontrado com sucesso!");
		}
		catch(SQLException e) {
			System.out.println("Erro de SQL: " + e.getMessage());
		}
		return usuRetorno;	
		
	}
	
	public UsuarioDois buscaporId(String nome_usuario) {
		UsuarioDois usuRetorno = null;
		String sql = "SELECT * FROM Cad_Usuario WHERE nome_usuario=?";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, nome_usuario);
			ResultSet resultado = preparador.executeQuery();
			
			if(resultado.next()) {
				usuRetorno = new UsuarioDois();
				usuRetorno.setNome_usuario(resultado.getString("nome_usuario"));
				usuRetorno.setSenha(resultado.getString("senha"));
				usuRetorno.setData_nascimento(resultado.getString("data_nascimento"));
				usuRetorno.setData_ciencia(resultado.getString("data_ciencia"));
				usuRetorno.setEstado(resultado.getString("estado"));
				usuRetorno.setCidade(resultado.getString("cidade"));
				usuRetorno.setSalario(resultado.getString("salario"));
				usuRetorno.setNivelInstrucao(resultado.getString("nivelInstrucao"));
				usuRetorno.setEmpresa(resultado.getString("empresa"));
				usuRetorno.setNum_Cartao(resultado.getString("num_cartao"));
				usuRetorno.setNome_Resp(resultado.getString("nome_resp"));
				usuRetorno.setDt_Validade(resultado.getString("dt_validade"));
				usuRetorno.setCvc(resultado.getString("cvc"));
			}
			System.out.println("Encontrado com sucesso!");
		} catch (SQLException e) {
			System.out.println("Erro de SQL: " + e.getMessage());
		}
		return usuRetorno;
	}
	
	public List<UsuarioDois> buscaTodosPago(UsuarioDois usuario) {
		String sql = "SELECT * FROM Cad_UsuarioPago";
		List<UsuarioDois> lista = new ArrayList<UsuarioDois>();
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			ResultSet resultados = preparador.executeQuery();
			while(resultados.next()) {
				UsuarioDois usu = new UsuarioDois();
				usu.setNome_usuario(resultados.getString("nome_usuario"));
				usu.setSenha(resultados.getString("senha"));
				usu.setData_nascimento(resultados.getString("data_nascimento"));
				usu.setData_ciencia(resultados.getString("data_ciencia"));
				usu.setEstado(resultados.getString("estado"));
				usu.setCidade(resultados.getString("cidade"));
				usu.setSalario(resultados.getString("salario"));
				usu.setNivelInstrucao(resultados.getString("nivelInstrucao"));
				usu.setEmpresa(resultados.getString("empresa"));
				usu.setNum_Cartao(resultados.getString("num_cartao"));
				usu.setNome_Resp(resultados.getString("nome_resp"));
				usu.setDt_Validade(resultados.getString("dt_validade"));
				usu.setCvc(resultados.getString("cvc"));
				
				lista.add(usu);
			}
		}
		catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
		}
		return lista;
		
	}
	
	public void update(UsuarioDois usuario) {
		String sql = "UPDATE Cad_UsuarioPago SET senha = ?, data_nascimento = ?, data_ciencia = ?, estado = ?, cidade = ?, salario = ?, nivelInstrucao = ?, empresa = ?, num_cartao = ?, nome_resp = ?, dt_validade = ?, cvc = ? WHERE nome_usuario=?";
		PreparedStatement preparador;
		try {
			preparador = con.prepareStatement(sql);
			preparador.setString(1,  usuario.getNome_usuario());
			preparador.setString(2,  usuario.getSenha());
			preparador.setString(3,  usuario.getData_nascimento());
			preparador.setString(4,  usuario.getData_ciencia());
			preparador.setString(5,  usuario.getEstado());
			preparador.setString(6,  usuario.getCidade());
			preparador.setString(7,  usuario.getSalario());
			preparador.setString(8,  usuario.getNivelInstrucao());
			preparador.setString(9,  usuario.getEmpresa());
			preparador.setString(10,  usuario.getNum_Cartao());
			preparador.setString(11,  usuario.getNome_Resp());
			preparador.setString(12,  usuario.getDt_Validade());
			preparador.setString(13,  usuario.getCvc());
			
			preparador.execute();
			preparador.close();
			System.out.println("Alterado com sucesso!");

		} catch (SQLException e) {
			System.out.println("Erro - " + e.getMessage());
		}
		
	}
		
	public UsuarioDois autenticacao1(UsuarioDois usuario) {
		UsuarioDois usuRetorno = null;
		String sql = "SELECT * FROM Cad_UsuarioPago WHERE nome_usuario = ? AND senha = ?";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, usuario.getNome_usuario());
			preparador.setString(2,  usuario.getSenha());
			ResultSet resultado = preparador.executeQuery();
			
			if(resultado.next()) {
				usuRetorno = new UsuarioDois();
				usuRetorno.setNome_usuario(resultado.getString("nome_usuario"));
				usuRetorno.setSenha(resultado.getString("senha"));
			}
			System.out.println("Encontrado com sucesso!");
		}
		catch(SQLException e) {
			System.out.println("Erro de SQL: " + e.getMessage());
		}
		return usuRetorno;	
		
	}
	

}
