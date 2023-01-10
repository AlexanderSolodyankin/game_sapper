package draft;

import java.sql.*;

public class DataBase {
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String name = "postgres";
    private static final String  password = "7809";


    public static Connection connect(){
        Connection conn = null;
            try{
                conn = DriverManager.getConnection(url,name, password);
                System.out.println("Подключились");

            }catch (Exception e){
                System.out.println(e.getClass().getName() + ": " + e.getMessage() + " ");
            }
        return conn;
    }

    public static String getCountUsers(){
        String sql = "select * from users where login like '%a%';";
        int count = 0;
        String line = "";
        try{
            Connection conn = connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()){
                line =  line +  rs.getString(1) +" " + rs.getString(2) +" " + rs.getString(3) +" " + rs.getString(4) + "\n" ;
                count++;
            }
//            count = rs.getInt(1);

            rs.close();
            stmt.close();
            conn.close();

        }catch (Exception e){
            System.out.println(e.getClass().getName() + ": " + e.getMessage() + " 11111");
        }
        return line;
    }
}
