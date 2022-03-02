package projectile_testing;

import java.awt.Color;

public class orangeboom extends projectile{
	
		public orangeboom (String theText, int x, int y, int dx, int dy, Color projectileColor) {
		super (theText,x,y,dx,dy,projectileColor);
		
		this.explodeTime = 400;
					
	}
	
	@Override
	public void explode() {	
		
		System.out.println("ORANGE MONSTER EXPLODE!!!!!!!!! \n");		
		
		
	}		
}



