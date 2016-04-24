package nardes.tomio.gabriel.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class ConnectionFactory {

	Connection getConnection() {

		try {
			
			final String database = System.getenv("typeDB");
			return DriverManager.getConnection("jdbc:" + database + "://localhost:8080/x", "root", "");
		
		} catch (final SQLException e) {
			throw new RuntimeException("Error");
		}
	}
}