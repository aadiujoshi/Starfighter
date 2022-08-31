//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;

	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		super(x, y);
	}

	public Ammo(int x, int y, int s)
	{
		this(x, y);
		speed = s;
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return 0;
	}

	public void draw( Graphics window )
	{
		window.drawString("\uD809\uDC2A", 0, 0);
	}
	
	
	public void move( String direction )
	{
		//add code to draw the ammo
	}

	public String toString()
	{
		return "";
	}
}
