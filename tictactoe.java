import java.awt.*;
import javax.swing.*;
import java.util.Random;
import java.util.ArrayList;

public class tictactoe extends JPanel {




public void paintComponent(Graphics g) {
    super.repaint(); // don't worry about this -- it 'clears the screen'

    g.setColor(Color.white);
    g.fillRect(0, 0, windowWidth, windowHeight); // draw a nice white background
    g.setColor(Color.black);
    g.drawLine(startLine, 0, startLine, windowHeight); // draw a starting line
    g.drawLine(startLine + trackLength, 0, startLine + trackLength, windowHeight); // finish
    drawRacers(g);
}


ArrayList<String> someNames = new ArrayList<String>() {
    {
       // this is a simple way of initializing an ArrayList in Java, but not
       // something you need to know for this course.
       // These are names of real race horses, as reported by 'the internet'.
       add("dulcify");
       add("whirlaway");
       add("gumshoe");
       add("skipteaser");
       add("kissed by a fish");
       add("rakatack");
       add("viscosity");
       add("flattermeforever");
       add("sonneteer");
       add("cigar starter");
       add("flat out fast");
       add("gothic soldier");
       add("sexy librarian");
       add("fishy advice");
       add("motel princess");
       add("lunatique");
       add("panicking petunia");
       add("wingspan");
       add("southern missle");
       add("excessive moves");
       add("paul bunyans axe");
       add("a storm it is");
       add("dawn of war");
    }
 };

 // returns a random element from the someNames ArrayList
 public String randomName() {
    //FINISH THIS: MAKE SURE IT NEVER REPEATS until all used
    return someNames.get(randGen.nextInt(someNames.size()));
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
       add(Color.pink);
    }
 };



}