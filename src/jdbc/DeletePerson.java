package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletePerson {

	public static void main(String[] args) throws SQLException {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Informe o Id: ");
		int code = input.nextInt();
		
		Connection connection = ConnectionFactory.getConnection();
		String sql = "DELETE FROM people WHERE code = ?";
		
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setInt(1, code);
		
		if(stmt.executeUpdate() > 0) {
			System.out.println("Pessoa excluida com sucesso.");
		} else {
			System.out.println("Dado não encontrado.");
		}
		
		connection.close();
		input.close();
	}
}
