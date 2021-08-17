package pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Enemy {

	public double x,y;
	public int width,height;
	
	public Enemy(int x,int y) {
		this.x = x;
		this.y = y;
		this.width = 70;
		this.height = 10;
	}
	
	public void tick() {
		x+= (Game.ball.x - x - 6) * 0.07;
		if (x + width > Game.WIDTH) {
			x = Game.WIDTH - width;
		} else if (x < 0) {
			x = 0;
		}
	}
	
	public void render(Graphics g) {
		g.setColor(new Color(255,0,0, 168));
		g.fillOval((int)x,(int)y,width,height);
	}
	
}
