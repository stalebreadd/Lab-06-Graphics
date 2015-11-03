// Lab06Bst.java
// This is the student, starting version of Lab06B which is divided into 8 cells.
// The first cell -- "Draw Random Points" -- is provided as an example.
// Students need to complete the other 7 cells on their own.


import java.awt.*;
import java.applet.*;


public class Lab06Bst extends Applet
{
    public void paint(Graphics g)
    {
        // Draw Grid
        Expo.drawLine(g,250,0,250,650);
        Expo.drawLine(g,500,0,500,650);
        Expo.drawLine(g,750,0,750,650);
        Expo.drawLine(g,0,325,1000,325);

        // Draw 10,000 Random Points
        for (int count = 1; count <= 10000; count++)
        {
            Expo.setRandomColor(g);
            int x = Expo.random(5,245);
            int y = Expo.random(5,320);
            Expo.drawPoint(g,x,y);
        }


        // Draw 1000 Random Lines
        for (int counts = 1; counts <= 1000; counts++)
        {
            Expo.setRandomColor(g);
            int x1 = Expo.random(255,495);
            int y1 = Expo.random(5,320);
            int x2 = Expo.random(255,495);
            int y2 = Expo.random(5,320);
            Expo.drawLine(g,x1,y1,x2,y2);
        }

        
        // Draw 1000 Random Rectangles
        for (int counter = 1; counter <= 1000; counter++)
        {
            Expo.setRandomColor(g);
            int x1 = Expo.random(505,745);
            int y1 = Expo.random(5,320);
            int x2 = Expo.random(505,725);
            int y2 = Expo.random(5,320);
            Expo.fillRectangle(g,x1,y1,x2,y2);
        }

        // Draw 500 Random Triangles
        for (int counters = 1; counters <= 500; counters++)
        {
            Expo.setRandomColor(g);
            int q = Expo.random(755,995);
            int w = Expo.random(5,320);
            int e = Expo.random(755,995);
            int r = Expo.random(5,320);
            int t = Expo.random(755,995);
            int y = Expo.random(5,320);
            
            Expo.fillPolygon(g,q,w,e,r,t,y);
        }

        // Draw 100 Random Initials
        for (int counters = 1; counters <= 100; counters++)
        {
            Expo.setRandomColor(g);
            int q = Expo.random(5,235);
            int w = Expo.random(340,650);
            Expo.drawString(g,"SS",q,w);
        }
        // Draw 500 Random Stars with a constant radius of 30 and a random # of points






        // Draw 1000 Random Circles with random radii






        // Draw 250 Random Arcs with 2 random radii, random start and random finish






    }

}




