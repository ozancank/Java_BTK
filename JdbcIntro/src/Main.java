import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws SQLException {
		selectDemo();
		addDemo();
		updateDemo();
		Connection connection = null;
		DbHelper helper = new DbHelper();
		PreparedStatement statement = null;
		ResultSet resultSet;
		try {
			connection = helper.getConnection();
			String sql = "delete from country where id=?";
			statement = connection.prepareStatement(sql);
			statement.setInt(1, 3);
			int result = statement.executeUpdate();
			System.out.println("Kayýt silindi");
		} catch (SQLException exception) {
			helper.showErrorMessage(exception);
		} finally {
			statement.close();
			connection.close();
		}
	}

	private static void updateDemo() throws SQLException {
		Connection connection = null;
		DbHelper helper = new DbHelper();
		PreparedStatement statement = null;
		ResultSet resultSet;
		try {
			connection = helper.getConnection();
			String sql = "update country set Name='Ýstanbul2', Region='TRR' where id=?";
			statement = connection.prepareStatement(sql);
			statement.setInt(1, 2);
			int result = statement.executeUpdate();
			System.out.println("Kayýt güncellendi");
		} catch (SQLException exception) {
			helper.showErrorMessage(exception);
		} finally {
			statement.close();
			connection.close();
		}
	}

	private static void addDemo() throws SQLException {
		Connection connection = null;
		DbHelper helper = new DbHelper();
		PreparedStatement statement = null;
		ResultSet resultSet;
		try {
			connection = helper.getConnection();
			String sql = "insert into country (Code,Name,Continent,Region) values(?,?,?,?)";
			statement = connection.prepareStatement(sql);
			statement.setString(1, "34");
			statement.setString(2, "Ýstanbul");
			statement.setString(3, "TR");
			statement.setString(4, "TR");
			int result = statement.executeUpdate();
			System.out.println("Kayýt eklendi");
		} catch (SQLException exception) {
			helper.showErrorMessage(exception);
		} finally {
			statement.close();
			connection.close();
		}
	}

	private static void selectDemo() throws SQLException {
		Connection connection = null;
		DbHelper helper = new DbHelper();
		Statement statement = null;
		ResultSet resultSet;
		try {
			connection = helper.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select Code,Name,Continent,Region from country");
			ArrayList<Country> countries = new ArrayList<Country>();
			while (resultSet.next()) {
				countries.add(new Country(resultSet.getString("Code"), resultSet.getString("Name"),
						resultSet.getString("Continent"), resultSet.getString("Region")));
			}
			System.out.println(countries.size());
		} catch (SQLException exception) {
			helper.showErrorMessage(exception);
		} finally {
			connection.close();
		}
	}
}
