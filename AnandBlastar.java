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

      g.setcolor(Color.RED);
      for(Rectangle e: enimies) g.fillRect(e.x,e.y,e.width,e.height);

      g.setcolor(Color.WHITE);
      g.drawString("Score.:"+Score+"/By Anand", 10, 20);
         }
   public void actionperformed (ActionEvent e) {
      for(int i = 0; i < bullets.size(); i++) {
         bullets.get(i).y -= 5;
      if (bullets.get(i).y <0) bullets.remove (i);
    }
      for (int i = 0; i < enimies.size(); i++) {
         enemies.get(i).y += z;
         if(enemies.get(i).y > 400) {
            enemies.get(i).y = 0;
            enimies.get.x = (int)(Math.random()*350);
         }
      }
       // collision check
      for (int i = 0; i < bullets.size(); i++) {
         for(int j = 0; j < enemies.size(); j++) {
            if (bullets.get(i).intersects(enemies.get(j))) {
               bullets.remove(i);
            enemies.get(j).y = 0;
          enemies.get(j).x =(int)(Math.random()*350);
               score++;
         if(score %5 == 0) enemies.add(new Rectangle((int)(Math.random()* 350), 0, 30, 30));
               break;
            }
         }
      })
        repaint();
         }
   public void keyPressed(KeyEvent k) {
      if (k.getKey Code() == KeyEvent.VK_LEFT && playerX > 0 playerX -= 15;
      if (k.getKey Code() == KeyEvent.VK_RIGHT && playerX < 360) playerX += 15;
      if (k.getKey Code() == KeyEvent.VK_SPACE) bullets.add(new Rectangle(playerX+18, 340, 5, 10));
         }
   public void keyPressed(KeyEvent k) {}
   public void keyTyped(KeyEvent k) {}
   
  public static void main(String[] args {
 JFrame f = new JFrame("Anand Blastar - RDJ Music Games");
  f.add(new AnandBlastar());
f.setSize(400,450);
f.setDefultCloseOperation(JFrane.EXIT_ON_CLOSE);
     f.setVisible(true);
    }
}

   

             
