import javax.swing.*;

import java.awt.event.*;
import java.util.Random;
import java.awt.*;

public class GamePanel extends JPanel implements ActionListener {

	private static final int SCREEN_WIDTH = 600;
	private static final int SCREEN_HEIGHT = 600;
	private static final int UNIT_SIZE = 25;
	private static final int GAME_UNITS = (SCREEN_HEIGHT * SCREEN_WIDTH) / UNIT_SIZE;
	private static final int DELAY = 75;
	private final int[] x = new int[GAME_UNITS];
	private final int[] y = new int[GAME_UNITS];
	private int bodyParts = 6;
	private int applesEaten;
	private int appleX;
	private int appleY;
	private char direction = 'R';
	private boolean running = false;
	private Timer timer;
	private Random random;

	public GamePanel() {
		Random random = new Random();
		this.setPreferredSize(new Dimension(this.SCREEN_WIDTH, this.SCREEN_HEIGHT));
		this.setBackground(Color.black);
		this.setFocusable(true);
		this.addKeyListener(new MyKeyAdapter());
		startGame();
	}

	public void startGame() {
		newApple();
		running = true;
		timer = new Timer(DELAY, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}

	public void draw(Graphics g) {
		for (int i = 0; i < SCREEN_HEIGHT / UNIT_SIZE; i++) {
			g.drawLine(i * UNIT_SIZE, 0, i * UNIT_SIZE, SCREEN_HEIGHT);
			g.drawLine(0, i * UNIT_SIZE, SCREEN_HEIGHT, i * UNIT_SIZE);

		}
	}

	public void move() {

	}

	public void newApple() {
		appleX = random.nextInt((int) SCREEN_WIDTH / UNIT_SIZE) * UNIT_SIZE;
		appleY = random.nextInt((int) SCREEN_HEIGHT / UNIT_SIZE) * UNIT_SIZE;
	}

	public void checkApple() {

	}

	public void checkCollisions() {

	}

	public void gameOver(Graphics g) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public class MyKeyAdapter extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {

		}
	}

}
