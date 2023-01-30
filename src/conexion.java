import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class conexion {
    public conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion =  DriverManager.getConnection("jdbc:mysql://localhost/Estudiantes","root","0986167219");
            Statement s = conexion.createStatement();
            ResultSet rs = s.executeQuery("select * from datosEstudiantes");
            while(rs.next()){
                System.out.println(rs.getString("Nombre") + " "+ rs.getString(2));
            }
            conexion.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
