package projectile_testing;

import java.awt.Color;

public class waterboom extends projectile {

	public waterboom(String theText, int x, int y, int dx, int dy, Color projectileColor) {
		super(theText,x, y, dx, dy, projectileColor);
		
		this.explodeTime = 400;

	}

	@Override
	public void explode() {
		
		System.out.println("WATER MONSTER EXPLODE!!!!!!!!! \n");
	}

}
