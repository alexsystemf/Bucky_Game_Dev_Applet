import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;


public class StartingPoint extends Applet implements Runnable , KeyListener {
	
	
	float y=0;
	float x=0;
	float radius = 40;
	float height = 800;
	float width = 600;
	private Image i;
	private Graphics doubleG;
	private Ball ball;
	private Bar bar; 
	private tower tower;
	double bgX =  0;
	double bgDx = .3;
	URL url;
	Image bg; 
	
	
	public void init() // initu
	{   tower = new tower();
	 	bar = new Bar(this);
		ball = new Ball(this);
		setSize((int)(height),(int)(width));
		addKeyListener(this);
		super.init();
		try 
		{
				url = getDocumentBase();
		}
		catch(Exception e)
		{
			
		}
		bg = getImage(url , "Images/backgroundtest.png");
	}
	public void start()
	{
		Thread thread = new Thread(this);
		thread.start();
		super.start();
	}
	public void run() {
		// TODO Auto-generated method stub
		//thread information
		
		while(true) // game Loop 
		{
			tower.update();
			ball.update(this);		
			repaint();
			bar.check();
					   	
			try {
				Thread.sleep(17);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	public void stop()
	{
		
		super.stop();
	}
	public void destroy()
	{
		
		super.destroy();
	}
	
	public void update(Graphics g) // doublebuffer
	{
		if(i==null)
		{
			i = createImage(this.getSize().width, this.getSize().height);
			doubleG = i.getGraphics();
		}
		doubleG.setColor(getBackground());
		doubleG.fillRect(0, 0, this.getSize().width, this.getSize().height);
		
		doubleG.setColor(getForeground());
		paint(doubleG);
		
		g.drawImage(i, 0,0,this);
	}
	
	public void paint(Graphics g)
	{   
		g.	drawImage(bg, (int) bgX, 0, this);
		ball.paint(g);
		bar.paint(g);
		tower.paint(g);
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyCode())
		{
		case KeyEvent.VK_A :
			bar.moveFront();
			break;
		case KeyEvent.VK_D:
			bar.check();
			break;
		case KeyEvent.VK_SPACE:
			// method for pressing Space
			
			break;
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyCode())
		{
		case KeyEvent.VK_A :
			x++;
			break;
		case KeyEvent.VK_D:
			// method for pressing D
			y++;
			break;
		case KeyEvent.VK_SPACE:
			// method for pressing Space
			System.out.println("X is " + x + " Y is "+y);
			break;
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
