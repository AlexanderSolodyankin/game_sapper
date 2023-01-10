public class MatrixElementImage {
    private Box[] [] matrix;

    MatrixElementImage(Box defaultImage){
        matrix = new Box[Ranges.getSize ( ).x][Ranges.getSize ( ).y];
        for(Coordinate el : Ranges.getAllCoordinate ()){
            matrix[el.x][el.y] = defaultImage;
        }
    }

    Box getImage(Coordinate coord){
        if(Ranges.inRange(coord))
        return matrix[coord.x][coord.y];
        return null;
    }
    void setImageElement(Coordinate coord, Box image){
        if(Ranges.inRange(coord))
            matrix[coord.x][coord.y] = image;
    }
}
