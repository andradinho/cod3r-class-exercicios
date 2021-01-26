package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDataQueryQuest {

	public static void main(String[] args) throws SQLException {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o ID: ");
		int data = input.nextInt();

		String sqlSelect = "SELECT code, name FROM people WHERE code = ?";
		String sqlUpdate = "UPDATE people SET name = ? WHERE code = ?";
		
		Connection connection = ConnectionFactory.getConnection();
		PreparedStatement stmt = connection.prepareStatement(sqlSelect);
		stmt.setInt(1, data);
		ResultSet result = stmt.executeQuery();
		
		if(result.next()) {
			Person p = new Person(result.getInt(1), result.getString(2));
			System.out.println("Nome atual: " + p.getName());
			input.nextLine();
			
			System.out.println("Informe o novo nome: ");
			String newData = input.nextLine();
			
			stmt.close();
			stmt = connection.prepareStatement(sqlUpdate);
			stmt.setString(1, newData);
			stmt.setInt(2, data);
			stmt.execute();
			
			System.out.println("Nome alterado com sucesso.");
		} else {
			System.out.println("Dado não encontrado.");
		}
		
		stmt.close();
		connection.close();
		input.close();
	}
}
