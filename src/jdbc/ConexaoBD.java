package jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexaoBD {
	public static void main(String[] args) {
        Properties props = new Properties();
        try {
            FileInputStream input = new FileInputStream("db.properties");
            props.load(input);
            input.close();

            String url = props.getProperty("db.url");
            String user = props.getProperty("db.user");
            String password = props.getProperty("db.password");

            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão bem-sucedida!");
            conn.close();

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo de propriedades: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Erro ao conectar no banco: " + e.getMessage());
        }
    }
}
