import java.awt.Color;
import java.awt.Graphics;

	
public class Bar {
	
	public static int j = 700;
	public static int i = 500;
	public static int dj = 6;
	public static int Width;
	public static int width = 30;
	public static int height = 80;
	float xt = tower.x ;
	float wt = tower.width ;
	float yt = tower.y ;
	float ht = tower.height;
	float rad = Ball.radius;
	float xc = Ball.x - rad ;
	float yc = Ball.y - rad ;
	
	public Bar(StartingPoint sp)
	{
		Width = sp.getWidth();
	}
	public void check (){
		if ( (tower.x + tower.width >= j )&& ( tower.x <= (j + width)) && ( tower.y + tower.height >= i ) && ( yt <= i + height))
		{ System.out.print("to gamhses");
		}
		else if(tower.y >= 580) { 
			System.out.println(" gay");
			 tower.dx = -1 * tower.dx;
			 tower.dy = -1 * tower.dy;
		}
		
			if ( (Ball.x + Ball.radius >= j )&& ( Ball.x <= (j + width)) && ( Ball.y + Ball.radius >= i ) && ( Ball.y <= i + height))
			{ System.out.print("thn rouf");
				}
	}
	public int getPosition()
	{
		return j;
	}
	
	public void moveBack()
	{
		if(j + dj >770){
			
			j=770;
		}
		else
		{
			j+=dj;
		}
	}
	
	public void moveFront()
	{
		if(j -dj <0 ){
			j =0;
		}
		else
		{
			j -=dj;
		}
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.BLUE);
		g.fillRect(j,i, width, height);
	}
}
