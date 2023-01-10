package draft;

import java.sql.*;

public class ConnectSQL {
    private static String url = "jdbc:postgresql://localhost:5432/postgres";
    private static String user = "postgres";
    private static String password = "7809";

    public static Connection connect(){
        Connection connect = null;

        try {
            connect = DriverManager.getConnection ( url, user, password );
            System.out.println ("Мы подключились к базе данных" );

        }catch (SQLException except){
            System.out.println (except.getMessage () );

        }catch (Exception except){
            System.out.println ( except.getClass ().getName () + ": " + except.getMessage ());
        }


        return connect;
    }


    public static String getUsers (){
        String users = "";
        int count;
        String sql = "select count(*) from users;";

        try{
            Connection connect = connect ();
            Statement stat = connect.createStatement ();
            ResultSet result = stat.executeQuery ( sql );

            result.next ();
            count = result.getInt ( "count" );
                users = "" + count ;

                result.close ();
                stat.close ();
                connect.close ();

        }catch (SQLException e){
            System.out.println (e.getMessage () );
        }
        return users ;
    }


    public static String getAllUsers (){
        String users = "";
        int count;
        String sql = "select * from users;";

        try{
            Connection connect = connect ();
            Statement stat = connect.createStatement ();
            ResultSet result = stat.executeQuery ( sql );

            while (result.next ()){
//                users = users + result.getInt ( "id" ) + " " +
//                        result.getString ( "login" ) + " " +
//                        result.getString ( "email" ) + " " +
//                        result.getString ( "pass" ) + " \n" ;

                users = users + result.getInt ( 1 ) + " " +
                        result.getString ( 2 ) + " " +
                        result.getString ( 3 ) + " " +
                        result.getString ( 4 ) + " \n" ;
            }

            result.close ();
            stat.close ();
            connect.close ();

        }catch (SQLException e){
            System.out.println (e.getMessage () );
        }
        return users ;
    }


    public static String newUsers(String login, String password, String email){
        int line = 0;
        String sql = String.format (  "insert into users (login, email, pass)\n" +
                "values ( '%s','%s','%s');", login, email, password ) ;

        try {
            Connection conn = connect ();
            PreparedStatement pstmt = conn.prepareStatement ( sql );

            line = pstmt.executeUpdate ();
            pstmt.close ();
            conn.close ();

        }catch (SQLException e){
            System.out.println (e.getMessage () );
        }

        return line == 1? "Данные успешно внесены в БД": "Что то пошло не так";

    }


    public static String newUsers(String sqlScript){
        int line = 0;

        try {
            Connection conn = connect ();
            PreparedStatement pstmt = conn.prepareStatement ( sqlScript );

            line = pstmt.executeUpdate ();
            pstmt.close ();
            conn.close ();

        }catch (SQLException e){
            System.out.println (e.getMessage () );
        }

        return line == 1? "Данные успешно внесены в БД": "Что то пошло не так";

    }


}
