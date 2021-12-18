public class App {
    public static void main(String[] args) throws Exception {
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Hello, World!");
        }
        catch(Exception e){System.out.println("Hello");}
    }
}
