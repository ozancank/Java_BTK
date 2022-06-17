import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
	static String userName = "root";
	static String password = "Sifre123";
	static String dbUrl = "jdbc:mysql://localhost:3306/world?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(dbUrl, userName, password);
	}

	public void showErrorMessage(SQLException exception) {
		System.out.println("Error : " + exception.getMessage());
		System.out.println("Error code : " + exception.getErrorCode());
	}
}
