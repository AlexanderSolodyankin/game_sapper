package jdbc_Data_Base_Lessons;

import java.sql.*;

public class InputJDBC {
  private static Connection connSQL = null;


    public static void createTableSQL (){
        try {
            connSQL = ConnectorSQL.connect ();
            Statement statmt = connSQL.createStatement ();
            statmt.executeUpdate ("create table users (\n" +
                    "id integer primary key, \n" +
                    "user_name varchar unique not null \n" +
                    ");"  );

            statmt.close ();
            connSQL.close ();

            System.out.println ("Таблица успешно создана" );

        }catch (SQLException sqlE){
            System.out.println (sqlE.getClass () );
        }
    }

    public static void insertSQL(){
        try {
            Connection conn = ConnectorSQL.connect ();
            PreparedStatement prStat = conn.prepareStatement ( "insert into users(id, user_name) values (3, 'Alex2');" );
            prStat.executeUpdate ();

            prStat.close ();
            conn.close ();
            System.out.println ("Данные успешно внесены" );


        }catch (SQLException sqlE){
            System.out.println (sqlE.getClass () );
        }
    }

    public static void selectSQL(){
        try{
            Connection conn = ConnectorSQL.connect ();
            Statement stat = conn.createStatement ();
            ResultSet resulSQL = stat.executeQuery ( "select * from users;" );
           while (resulSQL.next ()) {
               System.out.print ( resulSQL.getInt ( "id" ) + " " );
               System.out.println ( resulSQL.getString ( "user_name" ) );
           }

           resulSQL.close ();
           stat.close ();
           conn.close ();


        }catch (SQLException sqlException){
            System.out.println (sqlException.getMessage () );
        }
    }

}
