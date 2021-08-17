package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Player {

    public boolean right, left;
    public int x, y;
    public int width, height;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
        this.width = 1;
        this.height = 1;
    }

    public void tick() {
        if (right) {
            x += 2;
        } else if (left) {
            x -= 2;
        }

        if (x + width > Game.WIDTH) {
            x = Game.WIDTH - width;
        } else if (x < 0) {
            x = 0;
        }
    }

    public void render(Graphics g) {
        g.setColor(new Color(0, 45, 255, 255));
        g.fillRect(x, y, width, height);

    }
}
