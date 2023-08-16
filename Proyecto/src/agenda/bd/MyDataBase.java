package agenda.bd;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyDataBase {

    private String url = "jdbc:mysql://localhost/agendas";
    private String user = "root";
    private String password = "";
    private Connection con = null;

    public void conectar() {
        try {
            con = DriverManager.getConnection(url, user, password);
            System.out.println("estas conectado");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void desconectar() {
        try {
            if (con != null) {
                con.close();
            }
            System.out.println("estas desconectado");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    public void insertarAgenda(Agenda agenda){
        conectar();
        String sql = "INSERT INTO agenda()";
        
        
        
        
    }
    
    
    

    
}
