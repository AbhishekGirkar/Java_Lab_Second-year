import java.applet.Applet;
import java.awt.*;

public class HousePicture extends Applet
{
   //-----------------------------------------------------------------
   //  Draws a house scene.
   //-----------------------------------------------------------------
   public void paint (Graphics page)
   {
      setBackground (Color.cyan);

      page.setColor (Color.gray);
      page.fillRect (0, 200, 400, 50);   // ground

      page.setColor (Color.blue);
      page.fillRect (50, 125, 300, 100);  // house

      page.setColor (Color.green);
      page.fillRect (180, 175, 40, 50);  // door 

      page.setColor (Color.yellow);
      page.fillRect (100, 155, 40, 25);  // window
      page.fillRect (260, 155, 40, 25);  // window

      page.setColor (Color.black);
      page.fillRect (40, 100, 320, 40);  // roof
      page.fillOval (210, 200, 6, 6);    // doorknob

      page.setColor (Color.red);
      page.fillRect (80, 80, 20, 40);  // chimney

      page.setColor (Color.darkGray);
      page.fillOval (80, 60, 20, 20);  // smoke
      page.fillOval (85, 50, 15, 25);  // smoke
      page.fillOval (90, 45, 15, 20);  // smoke

      page.setColor (Color.white);
      page.fillOval (200, 30, 80, 40);  // cloud
      page.fillOval (230, 40, 80, 40);  // cloud
   }
}
/* 
<APPLET code="HousePicture.class" width="500" height="500"?>
</APPLET>
*/ 