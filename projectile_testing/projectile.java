package projectile_testing;

import java.awt.Color;
import java.awt.Graphics2D;

public abstract class projectile extends Thread {
	/**
	 * projectile will start writing on the page (g) using the text in the given
	 * buffer. projectile set as a abstract class
	 */

	private int x = 0;
	private int y = 0;
	private int dx = 0;
	private int dy = 0;
// Acceleration, ddy is gravity
	private int ddx = 0;
	private int ddy = -1;
	
	protected int explodeTime = 400;
	
	protected String projectileName;
	protected Color projectileColor;
	private String[] projectiles = {"orangeboom", "waterboom"};
	
	
	
	public projectile(String theText, int x, int y, int dx, int dy, Color projectileColor) {
		this.projectileName = theText;
		this.x = x;
		this.y = y;
		this.dx = dx;
		this.dy = dy;
		this.projectileColor = projectileColor;
		
		
	}
	
	public void run() {

		while (y <= 450) {

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				System.out.println("Ready!!");
			}
			
			
			this.x = this.x + this.dx;
			this.y = this.y + this.dy;
			//simulation of the gravity
			this.dy = this.dy + 1;
			
			System.out.println("Projectile emission==>   " + projectiles[0] + "  |  " + projectiles[1]);
			System.out.println("x= " + x + " | " + "y= " + y + " | " + "dx= " + dx + " | " + "dy= " + dy);
			
		}
		
		explode();
		
	
		
	}
	
//	public void explode() {
//		
//		this.dx = 0;
//		this.dy = 0;
//		
//		System.out.println("BOOM!BOOM!SPLASH!");
//		
//		return;
//		
//	}
	
	abstract void explode();

	// Draw the projectile
	public void Paint(Graphics2D g2d) {
		g2d.setColor(projectileColor);
		g2d.fillOval(x, y, 30, 30);
			
	}
}
