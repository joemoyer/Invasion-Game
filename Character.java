package pack;

import java.awt.event.KeyEvent;

public class Character {
	
	public static boolean up, down, left, right;
	public static int x = 0, y = 0, playerSpeed = 5;
	
	public static void move() {
		if (up && !down) {
			y += playerSpeed;
		}
		if (down && !up) {
			y -= playerSpeed;
		}
		if (left && !right) {
			x += playerSpeed;
		}
		if (right && !left) {
			x -= playerSpeed;
		}
	}
	
	public static int getX() {
		return x;
	}
	
	public static int getY() {
		return y;
	}
	
	public static void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_W || key == KeyEvent.VK_UP) {
			up = true;
		}
		if (key == KeyEvent.VK_S || key == KeyEvent.VK_DOWN) {
			down = true;
		}
		if (key == KeyEvent.VK_A || key == KeyEvent.VK_LEFT) {
			left = true;
		}
		if (key == KeyEvent.VK_D || key == KeyEvent.VK_RIGHT) {
			right = true;
		}
	}
	
	public static void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_W || key == KeyEvent.VK_UP) {
			up = false;
		}
		if (key == KeyEvent.VK_S || key == KeyEvent.VK_DOWN) {
			down = false;
		}
		if (key == KeyEvent.VK_A || key == KeyEvent.VK_LEFT) {
			left = false;
		}
		if (key == KeyEvent.VK_D || key == KeyEvent.VK_RIGHT) {
			right = false;
		}
	}
	
}
