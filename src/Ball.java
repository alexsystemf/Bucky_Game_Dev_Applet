import java.awt.Color;
import java.awt.Graphics;


public class Ball {
	public static float x = 200;
	public static float y = 200;
	public static float dx = 2;
	public static float dy = 2;
	public static float radius = 40;
	Bar bar;
	public Ball(StartingPoint sp)
	{
		bar = new Bar(sp);
	}
	public void update(StartingPoint sp)
	{
		if(x +dx > sp.getWidth() -radius)
		{	x = sp.getWidth()- radius - 1;
			dx = -dx;
		}
		else if(x+dx <20 && (bar.getPosition() <= y || bar.getPosition()+90 >=y) )
		{
			x = 20 ;
			dx = -dx;
		}
		else
		{
			
			x +=dx;
		}
		
		if(y +dy > sp.getHeight() -radius+1)
		{
			y = sp.getHeight() - radius + 1;
			dy = -dy;
		
		}
		else if(y +dy < 0  )
		{
			y = 0 ;
			dy = -dy;
		}
		else
		{
			y +=dy;
		}
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.CYAN);
		g.fillOval((int)(x),(int)(y),(int)(radius),(int)(radius));
	}
	
}
