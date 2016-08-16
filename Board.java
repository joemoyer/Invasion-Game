package pack;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class Board extends JPanel implements ActionListener{
	
	private Timer timer;
	private final int DELAY = 10;
	
	static Image background;

	public Board() {
		initBoard();
		LoadImages();
	}
	
	private void LoadImages() {
		background = new ImageIcon("background.png").getImage();
	}
	
	public void initBoard() {
		addKeyListener(new TAdapter());
		setFocusable(true);
		setBackground(Color.GRAY);
		
		timer = new Timer(DELAY, this);
		timer.start();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		doDrawing(g);

		Toolkit.getDefaultToolkit().sync();
	}

	private void doDrawing(Graphics g) {

		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(background, Character.getX(), Character.getY(), null);
		g2d.drawLine(2, 2, 100, 100);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		Character.move();
		repaint();
	}
	
	private class TAdapter implements KeyListener {

		@Override
		public void keyPressed(KeyEvent e) {
			Character.keyPressed(e);
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			Character.keyReleased(e);
			
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
