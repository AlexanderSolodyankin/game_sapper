package jdbc_Data_Base_Lessons;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectorSQL {
    private static String url = "jdbc:postgresql://localhost:5432/postgres";
    private static String user = "postgres";
    private static String password = "7809";

    public static Connection connect(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection ( url, user, password );
            System.out.println ("Подключение к базе данных произошло успешно!!!" );

        }catch (SQLException sql){
            System.out.println (sql.getClass ().getName () + ": " + sql.getMessage () );
        }catch (Exception exc){
            System.out.println (exc.getClass ().getName () + ": " + exc.getMessage () );
        }

        return connection;
    }
}
