package draft;

import java.sql.*;
import java.util.List;

public class TestInputDataBase {


    public static void createTableSQL(String nameTable, List<String> param){
        String sql = String.format ( "create table %s (" +
                "id serial primary key,", nameTable );

        for (int i = 0 ; i < param.size () ; i++) {
            sql = sql + param.get ( i ) +  (param.size () - 1 != i? ",":"") + "\n";
        }
        sql += ");";

        try {
            Connection conn = ConnectSQL.connect ();
            Statement statement = conn.createStatement ();
            statement.executeUpdate ( sql );
            statement.close ();
            conn.close ();

            System.out.println ("Таблица успешно создана" );
        }catch (SQLException sqlE){
            System.out.println (sqlE.getMessage () );
        }
    }

    public static void insertInfoUser(String login, String email, String pass){
        String sql = String.format ( "insert into users(user_login, user_email, user_password) " +
                "values ('%s', '%s', '%s')", login, email, pass);
        try {
            Connection conn = ConnectSQL.connect ();
            PreparedStatement statement = conn.prepareStatement ( sql );
            statement.executeUpdate ();
            statement.close ();
            conn.close ();
            System.out.println ("Данные успешно внесены!!!" );
        }catch (SQLException sqlE){
            System.out.println (sqlE.getMessage () );
        }
    }

    public static void insertInfoUserInfo(String name, String serName, String patrol, int age, long forKey){
        String sql = String.format ( "insert into user_info(user_name, user_ser_name, user_patrol, user_age, user_id) " +
                "values ('%s', '%s', '%s', '%s', '%s')", name, serName, patrol, age, forKey);
        try {
            Connection conn = ConnectSQL.connect ();
            PreparedStatement statement = conn.prepareStatement ( sql );
            statement.executeUpdate ();
            statement.close ();
            conn.close ();
            System.out.println ("Данные успешно внесены!!!" );
        }catch (SQLException sqlE){
            System.out.println (sqlE.getMessage () );
        }
    }

    public static String selectUser (){
        String sql = "Select * from users;";
        String line = "";

        try {
            Connection conn = ConnectSQL.connect ();
            Statement statement = conn.createStatement ( );
            ResultSet resultSet = statement.executeQuery ( sql );

            while (resultSet.next ()){
                line = line + String.format ( "%s,  %s,  %s,  %s.  \n",
                        resultSet.getInt ( 1 ),
                        resultSet.getString ( 2 ),
                        resultSet.getString ( 3 ),
                        resultSet.getString ( 4 ) );
            }



        }catch (SQLException sqlE){
            System.out.println (sqlE.getMessage () );
        }

        return line;
    }
    public static String selectUserInfo (){
        String sql = "Select * from user_info;";
        String line = "";

        try {
            Connection conn = ConnectSQL.connect ();
            Statement statement = conn.createStatement ( );
            ResultSet resultSet = statement.executeQuery ( sql );

            while (resultSet.next ()){
                line = line + String.format ( "%s,  %s,  %s, %s,  %s,  %s.  \n",
                        resultSet.getInt ( 1 ),
                        resultSet.getString ( 2 ),
                        resultSet.getString ( 3 ),
                        resultSet.getString ( 4 ),
                        resultSet.getString ( 5 ),
                        resultSet.getString ( 6 )
                );
            }



        }catch (SQLException sqlE){
            System.out.println (sqlE.getMessage () );
        }

        return line;
    }


    public static String selectUserAllInfo (){
        String sql = "select u.id, u.user_login, u.user_email, ui.user_name , ui.user_ser_name , ui.user_age  from users u \n" +
                "join user_info ui on ui.user_id = u.id;";
        String line = "";

        try {
            Connection conn = ConnectSQL.connect ();
            Statement statement = conn.createStatement ( );
            ResultSet resultSet = statement.executeQuery ( sql );

            while (resultSet.next ()){
                line = line + String.format ( "%s,  %s,  %s, %s,  %s,  %s.  \n",
                        resultSet.getInt ( 1 ),
                        resultSet.getString ( 2 ),
                        resultSet.getString ( 3 ),
                        resultSet.getString ( 4 ),
                        resultSet.getString ( 5 ),
                        resultSet.getString ( 6 )
                );
            }



        }catch (SQLException sqlE){
            System.out.println (sqlE.getMessage () );
        }

        return line;
    }
}
