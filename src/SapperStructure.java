import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class SapperStructure extends JFrame{

    private Game game;

    private final int IMAGE_SIZE = 50;
    private final int COLUMN = 9;
    private final int ROWS = 9;
    private final int BOMBS = 10;

    private JPanel panel ;
    private JLabel label;



    public static void startGame(){
        new SapperStructure ();
    }

    private SapperStructure(){
        game = new Game ( COLUMN, ROWS, BOMBS );
        game.start ();
        setImage ();
        initLabel ();
        initPanel ();
        createWindow ();

    }

    private void createWindow(){

        setVisible ( true );
        setDefaultCloseOperation ( EXIT_ON_CLOSE );
        setTitle ( "Supper_Draft" );
        setResizable ( false );
        setIconImage (getImage ( "titleIcon" )); // Добавили иконку для окошка предварительно его скачав
        pack();
        setLocationRelativeTo ( null );
    }

    private void initLabel(){
        label = new JLabel ( "Игра Началась" );
        add(label, BorderLayout.NORTH);
    }

    private void initPanel(){
        panel = new JPanel (  ){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent ( g );
                for(Coordinate el : Ranges.getAllCoordinate ()){
                    g.drawImage ( (Image) game.getBoxImage ( el ).image, el.x * IMAGE_SIZE, el.y * IMAGE_SIZE , this );
                }
            }
        };
        panel.addMouseListener ( new MouseAdapter ( ) {
            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX () / IMAGE_SIZE;
                int y = e.getY () / IMAGE_SIZE;
                Coordinate coord = new Coordinate ( x, y );
                if(e.getButton () == MouseEvent.BUTTON1){
                    game.pressLeftButton(coord);
                }
                if(e.getButton () == MouseEvent.BUTTON3){
                    game.pressRigthButton(coord);
                }
                if(e.getButton () == MouseEvent.BUTTON2){
                    game.start ();
                }
                label.setText ( getMessage() );
                panel.repaint (  );
            }
        } );
        panel.setPreferredSize ( new Dimension (
                Ranges.getSize ().x * IMAGE_SIZE,
                Ranges.getSize ().y * IMAGE_SIZE
        ) );
        add(panel);
    }

    private String getMessage() {

        Random ran = new Random (  );
        switch (game.getGameState ()){
            case PLAYED : return ran.nextBoolean ()? "Подумай дважды" :
                                 ran.nextBoolean ()? "Бомба где то рядом":
                                 ran.nextBoolean ()? "Оку ратнее!!!!":
                                 ran.nextBoolean ()? "Тут что то происходит" : "Напряжение висит в воздухе";

            case BOMBED: return  ran.nextBoolean ()? "Вы проиграли!!!!":
                                 ran.nextBoolean ()? "Вас разорвало на мелкие кусочки!!!!!!":
                                 ran.nextBoolean ()? "Кровь, Мясо и Кишки!!!!!!": "Это была ваша последняя ошибка";

            case WINNER: return ran.nextBoolean ()? "Вы ВЫЙГРАЛИ!!!!":
                                 ran.nextBoolean ()? "ТЕПРЬ МЫ СМОЖЕМ ДВИГАТСЯ ДАЛЬШЕ!!!!!!":
                                 ran.nextBoolean ()? "Интеллект на уровне Гениев!!!!!!": "И Без одной Ошибки?!";

            default: return "Добро Пожаловать в игру.";
        }
    }

    private Image getImage(String nameImage){
        ImageIcon icon = new ImageIcon ( getClass ().getResource (  "/img/" + nameImage + ".png") );
        return icon.getImage ();
    }

    private void setImage(){
        for(Box el : Box.values ()){
            el.image = getImage ( el.name ().toLowerCase () );
        }
    }

}
