import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayLast;

public class AnandBlastar extends jpanel implements ActionsListener, keyListener {
   int playerX = 180;
ArrayList<Rectangle> bullets = new ArrayList<>();
ArrayList<Rectangle> enemies = new ArrayList<>();
  Timer timer;
  int score = 0;

  public AnandBlaster() {
    setBackground(color,Black);
    Timer = new Time(20, this);
    timer. start(): 
      // pehla enemy
      enemies.add( new Rectangle(100; 0, 30, 30));
       setFocusable(true);
       addkeyListener(this);
         }
   public void paintComponement(Graphics g) {
      super paint Componment(g);
      g.set color(Color.FREEN);
      g.fillRect(playerX. 350, 40, 20): // player

         g.set color(Color.YELLOW);
      for(Rectangle b: bullets) g.fillRect(b.x, b.y, 5,(0);

      g.setcolor(Color.ReD)
  
  
  
  
