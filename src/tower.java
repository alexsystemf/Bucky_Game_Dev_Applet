import java.awt.Color;
import java.awt.Graphics;


public class tower {
	public static float x =400;
	public static float y = 100;
	
	public static float width = 10;
	public static float height = 10;
	public static float flag  = Math.abs(x - Bar.j)  ;
	public static float flag1 = Math.abs(y - Bar.i) ;
	public static float dx=  flag / 350;
	public static float dy = flag1 / 350;
	
	public void update (){
		
		x+=dx;
		y+=dy;
				
	}
	public void paint(Graphics g)
	{   
		g.drawRect((int)(x),(int)(y), (int)(width)  , (int)(height));
		g.fillRect((int)(x), (int)(y), (int)(width) ,( int)(height));
		g.setColor(Color.CYAN);
		
	}
}
