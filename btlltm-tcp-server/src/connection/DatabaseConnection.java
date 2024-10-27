package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
    private Connection connection;

    public DatabaseConnection(){
        try {
        String url ="jdbc:sqlserver://" + serverName + ":" + portNumber + ":" + "\\" + instance + ";databaseName=" + dbName + ";encrypt=true;trustServerCertificate=true";
        if(instance == null || instance.trim().isEmpty()){
            url =  "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName + ";encrypt=true;trustServerCertificate=true;characterEncoding=UTF-8";
        }
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        this.connection = DriverManager.getConnection(url, userID, password);
        } catch (Exception ex){
            
        }
        
    }
    
    public Connection getConnection(){
        return this.connection;
    }
    
    
    private final String serverName = "HOSA\\SERVER";
    private final String dbName = "BTLLTM";
    private final String portNumber = "1433";
    private final String instance = "";
    private final String userID = "sa";
    private final String password = "123";
    
    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
