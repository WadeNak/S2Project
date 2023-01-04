import java.awt.*;
import javax.swing.*;
import java.util.Random;
import java.util.ArrayList;


public class TicTacToe extends JPanel implements MouseListener,MouseMotionListener{

   public static void main(String args[]) {
    JFrame frame = new JFrame("TicTacToe");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    TicTacToe panel = new TicTacToe();
   
    frame.add(panel);

    frame.setSize(300, 200);
    frame.setVisible(true);
  }

  public XandO(){
      myFrame = new JFrame("XandO");
        myFrame.add(this);
        
        constructImage(fileName);

        // these eyes fit right on Einstein's head.  
        playerX = new Eye(269, 290, 49, 37);
        eye_2 = new Eye(372, 290, 49, 37);
        addMouseListener(this);
        addMouseMotionListener(this);
        myFrame.setVisible(true);
  }

Random randGen = new Random();

public void paintComponent(Graphics g) {
    super.repaint(); // don't worry about this -- it 'clears the screen'

    g.drawLine(0,100,150,100);
    g.drawLine(100,0,100,150);
    g.drawLine(0, 50, 150, 50);
    g.drawLine(50,0,50,150);
    
    
}

public void mouseClicked (MouseEvent event) {
        eye_1.movePupil(event.getX(), event.getY());
        eye_2.movePupil(event.getX(), event.getY());
        
        repaint();
    }

    public void mouseMoved(MouseEvent event){
        eye_1.movePupil(event.getX(), event.getY());
        eye_2.movePupil(event.getX(), event.getY());
        
        repaint();
    }
    public void mouseDragged(MouseEvent event){
        eye_1.movePupil(event.getX(), event.getY());
        eye_2.movePupil(event.getX(), event.getY());
        
        repaint();
    }
  
    public void mouseReleased (MouseEvent event) {
    }
    
    public void mousePressed (MouseEvent event) {
    }
    
    public void mouseEntered (MouseEvent event) {
    }


ArrayList<String> someSquares = new ArrayList<String>() {
    {
       add("");
       add("");
       add("");
       add("");
       add("");
       add("");
       add("");
       add("");
       add("");

    }
 };

 // returns a random element from the someNames ArrayList
 public String randomName() {
    //FINISH THIS: MAKE SURE IT NEVER REPEATS until all used
    return someSquares.get(randGen.nextInt(someSquares.size()));
 }

 ArrayList<Color> someColors = new ArrayList<Color>() {
    {
       add(Color.black);
       add(Color.blue);
       add(Color.cyan);
       add(Color.gray);
       add(Color.green);
       add(Color.magenta);
       add(Color.yellow);
       add(Color.orange);
       add(Color.red);
    }
 };



}