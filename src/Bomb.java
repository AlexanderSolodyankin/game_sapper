 class Bomb {
    private MatrixElementImage bombMap;
    private int totalBomb;

    Bomb(int totalBomb){
        this.totalBomb = totalBomb;
        fixBombCount ();
    }

    void start(){
        bombMap = new MatrixElementImage ( Box.ZERO );

        for (int i = 0 ; i < totalBomb ; i++) {
            placeBomb ();
        }

    }

    Box getImageMap(Coordinate coord){
        return bombMap.getImage ( coord );
    }

    private void  fixBombCount(){
        int maxBombs = Ranges.getSize ().x * Ranges.getSize ( ).y / 2;
        if(totalBomb  >  maxBombs){
            totalBomb = maxBombs;
        }
    }

    private void placeBomb(){

        while (true) {
            Coordinate coordinate = Ranges.getRandomCoordinates ( );
            if(Box.BOMB == bombMap.getImage ( coordinate )){
                continue;
            }
            bombMap.setImageElement ( coordinate, Box.BOMB );
            incNumbersAroundBomb ( coordinate );
            break;
        }

    }

    private void incNumbersAroundBomb(Coordinate coord){

        for (Coordinate around : Ranges.getCoordinateAround ( coord )){
            if(Box.BOMB != bombMap.getImage ( around )) {
                bombMap.setImageElement ( around, bombMap.getImage ( around ).getNextNumberBox ( ) );
            }
        }
    }

      int getTotalBombs() {
        return totalBomb;
     }
 }
