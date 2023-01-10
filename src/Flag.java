 class Flag {

    private MatrixElementImage flagMap;
    private int countOfClosedBoxes;

    void start(){
        flagMap = new MatrixElementImage ( Box.CLOSED );
//        for(Coordinate el : Ranges.getCoordinateAround ( new Coordinate ( 4,4 ) ))
//        flagMap.setImageElement (el, Box.OPENED );
        countOfClosedBoxes = Ranges.getSize ().x * Ranges.getSize ( ).y;
    }

    Box getImageMap(Coordinate coord){
        return flagMap.getImage ( coord );
    }

       void setOpenedToBox(Coordinate coord) {

        flagMap.setImageElement ( coord, Box.OPENED );
        countOfClosedBoxes--;
     }

     private void setFlagetToBox(Coordinate coord) {
        flagMap.setImageElement ( coord, Box.FLAG );
     }

     public void toggeleFlagetToBox(Coordinate coord) {
         switch (flagMap.getImage ( coord )) {
             case FLAG -> setClosedToBox ( coord );
             case CLOSED -> setFlagetToBox ( coord );
         }
     }

     private void setClosedToBox(Coordinate coord) {
         flagMap.setImageElement ( coord, Box.CLOSED );
     }

      int getCountOfClosedBixes() {
        return countOfClosedBoxes;
     }

       void setBombedToBox(Coordinate coord) {
        flagMap.setImageElement ( coord, Box.BOMBED );

     }

      void setOpenedToCloseBombBox(Coordinate coordEl) {
        if(flagMap.getImage ( coordEl ) == Box.CLOSED){
            flagMap.setImageElement ( coordEl, Box.OPENED );
        }
     }

      void setNoBombToFlagedSafeBox(Coordinate coordEl) {
            if(flagMap.getImage ( coordEl ) == Box.FLAG){
                flagMap.setImageElement ( coordEl, Box.NOBOMB );
            }
     }



     int getCountOfFlagedBoxesAround(Coordinate coord) {
         int countBomb = 0;
         for(Coordinate el : Ranges.getCoordinateAround ( coord )){
             if(flagMap.getImage ( el ) == Box.FLAG){
                 countBomb++;
             }
         }
         return countBomb;
     }

 }
