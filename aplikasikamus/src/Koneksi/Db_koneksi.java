package Koneksi;

/**
 *
 * @author hp
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Db_koneksi {
    private static Connection conn;
    public static Connection getKoneksi() {
    String host = "jdbc:mysql://localhost/aplikasi",
            user = "root",
            pass = "";
    try {
    DriverManager.registerDriver(new com.mysql.jdbc.Driver());
    conn = (Connection) DriverManager.getConnection(host, user, pass);
} catch (SQLException err) {
    JOptionPane.showMessageDialog (null, err.getMessage());
}
return conn;
}
}