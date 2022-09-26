//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AlienHorde implements Iterable<Alien>
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<>();

		for(int i = 0 ; i < size; i++){
			int xind = i%9;
			int yind = (int)i/9;
			Alien al = new Alien(85*xind, 60*yind, 30, 30, 5);
			aliens.add(al);
		}
		System.out.println(aliens.size());
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for(Alien a : aliens){
			a.draw(window);
		}
	}

	public void moveEmAll()
	{
		for(int i = 0; i < aliens.size(); i++){
			aliens.get(i).move("LEFT");
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for(int i = 0; i < aliens.size(); i++){
			a: for(int j = 0; j < shots.size(); j++){
				if(StarFighterUtilities.collision(aliens.get(i), shots.get(j))){
					aliens.remove(i);
					shots.remove(j);
					i--;
					break a;
				}
			}
		}
	}

	public String toString()
	{
		return "";
	}

	@Override
	public Iterator<Alien> iterator() {
		return aliens.iterator();
	}
}
