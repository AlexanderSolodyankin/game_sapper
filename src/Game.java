public class Game {

  private Bomb bomb;
  private Flag flag;
  private GameState gameState;

    public Game(int column, int rows, int bombs){
        Ranges.setSize ( new Coordinate ( column, rows ) );
        bomb = new Bomb ( bombs );
        flag = new Flag ();
    }

    public Box getBoxImage (Coordinate coordinate){

        if(flag.getImageMap ( coordinate ) == Box.OPENED){
            return bomb.getImageMap ( coordinate );
        }
        return flag.getImageMap ( coordinate );
    }

    public GameState getGameState() {
        return gameState;
    }

    public void start(){
        bomb.start ();
        flag.start ();
        gameState = GameState.PLAYED;
    }

    public void pressLeftButton(Coordinate coord) {
        if(gameOver()) return;
        openBox(coord);
        checkWinner ();
    }
    public void pressRigthButton(Coordinate coord) {
        if(gameOver()) return;
        flag.toggeleFlagetToBox ( coord );
    }

    private boolean gameOver() {

        if(gameState == GameState.PLAYED){
            return false;
        }
        start ();
        return true;
    }

    private void openBox(Coordinate coord) {
        switch (flag.getImageMap ( coord )){
            case OPENED: setOpenedToClosedBoxesAroundNumber ( coord ); return;
            case FLAG : return;
            case CLOSED: switch (bomb.getImageMap ( coord )){
                case ZERO: openBoxesAround(coord );return;
                case BOMB: openBombs(coord); return;
                default  : flag.setOpenedToBox ( coord ); return;
            }
        }
    }

    private void openBombs(Coordinate coord) {
        gameState = GameState.BOMBED;
        flag.setBombedToBox(coord);
        for(Coordinate coordEl : Ranges.getAllCoordinate ()){
            if(bomb.getImageMap ( coordEl ) == Box.BOMB){
                flag.setOpenedToCloseBombBox(coordEl);
            }else {
                flag.setNoBombToFlagedSafeBox(coordEl);
            }
        }
    }


    private void checkWinner(){
        if(gameState == GameState.PLAYED){
            if(flag.getCountOfClosedBixes() == bomb.getTotalBombs()){
                gameState = GameState.WINNER;
            }
        }
    }


    private void openBoxesAround(Coordinate coord) {
        flag.setOpenedToBox ( coord );
        for(Coordinate el : Ranges.getCoordinateAround ( coord )){
            openBox ( el );
        }
    }


    void setOpenedToClosedBoxesAroundNumber(Coordinate coord){
        if(bomb.getImageMap ( coord ) != Box.BOMB)
        if(flag.getCountOfFlagedBoxesAround ( coord ) == bomb.getImageMap ( coord ).getNumber()){
            for(Coordinate around: Ranges.getCoordinateAround ( coord )){
                if(flag.getImageMap ( around ) == Box.CLOSED){
                        openBox ( around );
                }
            }

        }

    }


}
