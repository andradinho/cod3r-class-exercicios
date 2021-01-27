package jdbc;

public class DAOTest {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String sql = "INSERT INTO people (name) VALUES (?)";
		dao.include(sql, "João da Silva");
		dao.include(sql, "Ana Julia");
		dao.include(sql, "Djalma Pereira");
		
		dao.close();
	}
}
