import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ranges {

    private static Coordinate size;
    private static ArrayList<Coordinate> allCoordinate;
    private static Random ran = new Random ( );

    public static void setSize(Coordinate _size) {
        size = _size;
        allCoordinate = new ArrayList<> ( );

        for (int i = 0 ; i < size.y ; i++) {
            for (int j = 0 ; j < size.x ; j++) {
                allCoordinate.add ( new Coordinate ( j, i ) );
            }
        }
    }

    public static Coordinate getSize() {
        return size;
    }


    public static ArrayList<Coordinate> getAllCoordinate() {
        return allCoordinate;
    }

    static boolean inRange(Coordinate coord) {
        return coord.x >= 0 && coord.x < size.x &&
                coord.y >= 0 && coord.y < size.y;
    }

    static Coordinate getRandomCoordinates() {
        return new Coordinate ( ran.nextInt ( size.x ),
                                ran.nextInt ( size.y ) );
    }

    static List<Coordinate> getCoordinateAround(Coordinate coord){
        Coordinate around;
        List<Coordinate> coordinateList = new ArrayList<> (  );
        for (int x = coord.x - 1; x <= coord.x + 1 ; x++){
            for(int y = coord.y - 1; y <= coord.y + 1; y ++ ){
                if(inRange ( around = new Coordinate ( x,y ) )){
                    if(!around.equals ( coord )){
                        coordinateList.add ( around );
                    }
                }
            }
        }

        return coordinateList;
    }
}
