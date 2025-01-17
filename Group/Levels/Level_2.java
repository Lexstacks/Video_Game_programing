
import java.awt.Graphics;
import java.util.Random;

public class Level_2 extends GameBase {
	boolean active = false;

	// Parallax Assets for Level 2
	ImageLoader background2a = new ImageLoader(0, 0, "background2.png");
	ImageLoader background2b = new ImageLoader(background2a.x + width, 0, "background2.png");
	ImageLoader midground2a = new ImageLoader(0, 0, "midground2.png");
	ImageLoader midground2b = new ImageLoader(midground2a.x + width, 0, "midground2.png");
	ImageLoader foreground2a = new ImageLoader(0, 0, "foreground2.png");
	ImageLoader foreground2b = new ImageLoader(foreground2a.x + width, 0, "foreground2.png");

	//needs work
	Zombies[] test = { new Zombies(((width) + (width * 1) / 4), height - 200, 27 * 3, 51 * 3),
			new Zombies(((width) + (width * 2) / 4), height - 200, 27 * 3, 51 * 3),
			new Zombies(((width) + (width * 3) / 4), height - 200, 27 * 3, 51 * 3),
			new Zombies(((width) + (width * 4) / 4), height - 200, 27 * 3, 51 * 3),
			new Zombies(((width) + (width * 5) / 4), height - 200, 27 * 3, 51 * 3),
			new Zombies(((width) + (width * 6) / 4), height - 200, 27 * 3, 51 * 3),
			new Zombies(((width) + (width * 7) / 4), height - 200, 27 * 3, 51 * 3),
			new Zombies(((width) + (width * 8) / 4), height - 200, 27 * 3, 51 * 3),
			new Zombies(((width) + (width * 9) / 4), height - 200, 27 * 3, 51 * 3),
			new Zombies(((width) + (width * 10) / 4), height - 200, 27 * 3, 51 * 3),
			new Zombies(((width) + (width * 11) / 4), height - 200, 27 * 3, 51 * 3),
			new Zombies(((width) + (width * 12) / 4), height - 200, 27 * 3, 51 * 3),
			new Zombies(((width) + (width * 13) / 4), height - 200, 27 * 3, 51 * 3),
			new Zombies(((width) + (width * 14) / 4), height - 200, 27 * 3, 51 * 3),
			new Zombies(((width) + (width * 15) / 4), height - 200, 27 * 3, 51 * 3), };

	public Level_2(GameBase game) {
		active = false;
	}

	public void inGameLoop() {
	}

	public void draw(Graphics g) {

		// Paint level 2 background
		background2a.draw(g);
		background2b.draw(g);
		midground2a.draw(g);
		midground2b.draw(g);
		foreground2a.draw(g);
		foreground2b.draw(g);


//		//draws the number of Zombiess based on how many Zombiess there are in each level
//		for (int i = 0; i < test.length; i++) {			
//		test[i].draw(g);
//		}

	}

}