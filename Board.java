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
		g2d.drawImage(background, 250, 250, null);
		g2d.drawLine(2, 2, 100, 100);
	}
	
	private class TAdapter implements KeyListener {

		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
