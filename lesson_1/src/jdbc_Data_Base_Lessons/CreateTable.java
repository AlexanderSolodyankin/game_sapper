package jdbc_Data_Base_Lessons;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {


    public static  void createTabe(String line){
        try{
            Connection conn = ConnectorSQL.connect ();

            Statement statement = conn.createStatement ();
            statement.executeUpdate ( "create table table2(\n" +
                    "id serial primary key,\n" +
                    "tab_name varchar\n" +
                    ");\n" );


            statement.close ();
            conn.close ();
        }catch (SQLException e){
            System.out.println ("Что то пошло не так" );
        }
    }
}
