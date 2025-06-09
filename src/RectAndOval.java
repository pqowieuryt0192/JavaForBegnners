
public class RectAndOval extends MyFrame{
	public void run() {
				
		int y=100;
		int x=30;
		
		while(true)
		{
											
		while(x<=170) 
		{
		clear();
		setColor(0,128,0);

		fillRect(x+40,y,50,30);
		fillRect(x+20,y+30,90,20);
		fillOval(x+30,y+50,23,23);
		fillOval(x+75,y+50,23,23);
		x+=5;


		sleep(0.06);
		}

		while(x>=30) 
		{
		clear();
		setColor(0,128,0);

		fillRect(x+40,y,50,30);
		fillRect(x+20,y+30,90,20);
		fillOval(x+30,y+50,23,23);
		fillOval(x+75,y+50,23,23);
		x-=5;


		sleep(0.06);
		}
		}
		
	}
	
	
}

