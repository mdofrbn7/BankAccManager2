import javax.swing.JOptionPane;
import java.sql.*;

public class javaconnect {
	Connection conn = null;
	
	public static Connection ConncrDB() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:Bank.db");
			return conn;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			
			return null;
		}
	}

}
