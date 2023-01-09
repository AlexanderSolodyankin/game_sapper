import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {

    private JPanel panel = new JPanel (  )
    {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent ( g );
//            g.drawImage ( getImage ( "num1" ),0,0, this );
//            g.drawImage ( getImage ( "num2" ),100,0, this );
//            g.drawImage ( getImage ( "num3" ),170,0, this );
//            g.drawImage ( getImage ( "num4" ),250,0, this );
//            g.drawImage ( getImage ( "bomb" ),0,150, this );
//            g.drawImage ( getImage ( "flag" ),50,250, this );
//            g.drawImage ( getImage ( "locked" ),100,350, this );
//            g.drawImage ( getImage ( "unlock" ),150,400, this );

            for (int i = 0 ; i <  500; i+= 50) {
                for (Swapper el : Swapper.values ( )) {
                    g.drawImage ( (Image) el.image, el.ordinal ( ) * 50, i, this );
                }
            }

        }
    };

    public static void startGame(){
        new Game ();
    }

    private Game(){
        setImage ();
        initPanel ();
      createWindow ();
    }

    private void createWindow(){
        setVisible ( true );
//        setSize ( 500, 500 );
        setDefaultCloseOperation ( EXIT_ON_CLOSE );
        setTitle ( "Sapper 0.2" );
        setResizable ( false );
        pack ();
        setLocationRelativeTo ( null );
    }

    private void initPanel(){
//        panel = new JPanel (  ){
//            @Override
//            protected void paintComponent(Graphics g) {
//                super.paintComponent ( g );
////                g.drawLine ( 200,200,300,200 );
////                g.drawLine ( 200,200,200,300 );
////                g.drawLine ( 300,200,300,300 );
////                g.drawLine ( 200,300,300,300 );
//                g.drawImage ( getImage ( "" ), 0 , 0 , this );
//            }
//        };
        panel.setPreferredSize ( new Dimension ( 8 * 50, 8 * 50 ) );
        add(panel);
    }


    private Image getImage(String nameImage){

        ImageIcon icon = new ImageIcon ( getClass ().getResource (  "/img/"+ nameImage +".png" ));
        System.out.println (icon );
        return icon.getImage ();
    }

    private void setImage(){
        for(Swapper el : Swapper.values ()){
                el.image = getImage ( el.name ( ).toLowerCase ( ) );
        }
    }


}
