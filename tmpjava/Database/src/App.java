import java.sql.*;
public class App {
    public static void main(String[] args) throws Exception {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(Exception e){}
        Connection con;
        String uri = "jdbc:mysql://localhost/students? useSSL=true&characterEncoding=utf-8";
        String user = "root";
        String password = "root";
        try{
            con = DriverManager.getConnection(uri,user,password);
            Statement sql = con.createStatement();
            ResultSet rs = sql.executeQuery("SELECT * FROM mess");
            while(rs.next()){
                String number = rs.getString(1);
                System.out.println(number);
            }
            con.close();
        }
        catch(SQLException e){
            System.out.println(e);
        }
    }
}
