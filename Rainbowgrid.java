import java.awt.*;
import hsa.Console;
import java.lang.Math;
import java.util.Random;

public class Rainbowgrid
{
    public static final int offset = 5;
    public static void main (String[] args)
    {
	Console c = new Console ();
	Color col, bg_col;
	Random rand = new Random();

	int[][] r = new int[32][25];
	int[][] g = new int[32][25];
	int[][] b = new int[32][25];

	for (int i = 0; i < 32; i++)
	    {
		for (int j = 0; j < 25; j++)
		{
		    r[i][j] = 255;
		    g[i][j] = 255;
		    b[i][j] = 255;
		} // for loop
	    } // for loop

	while(true)
	{
	    for (int i = 0; i < 32; i++)
	    {
		for (int j = 0; j < 25; j++)
		{
		    r[i][j] += (int)(rand.nextInt(2)*16-7.75);
		    r[i][j] = Math.max(0, Math.min(255, r[i][j]));
		    g[i][j] += (int)(rand.nextInt(2)*16-7.75);
		    g[i][j] = Math.max(0, Math.min(255, g[i][j]));
		    b[i][j] += (int)(rand.nextInt(2)*16-7.75);
		    b[i][j] = Math.max(0, Math.min(255, b[i][j]));

		    col = new Color (r[i][j], g[i][j], b[i][j]);
		    c.setColor (col);
		    c.fillOval (i*20+offset, j*20+offset, 20-offset, 20-offset);
		} // for loop
	    } // for loop
	} // while loop
    } // main method
} // Rainbowgrid class
