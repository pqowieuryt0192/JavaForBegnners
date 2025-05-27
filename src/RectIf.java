
public class RectIf extends MyFrame{
public void run() {
	int x=30;
	setColor(0,128,0);
	int i;
	for(i=0 ; i<9 ; i++)
	{
		if (i==0)
		{
			fillRect(x,80,10,10);
			
		}
		else if(i==1) 
		{
			fillRect(x,80,10,20);
		}
		
		else if(i==2)
		{
			fillRect(x,80,10,30);
		}
		else if(i==3)
		{
			fillRect(x,80,10,40);
		}
		else if(i==4)
		{
			fillRect(x,80,10,50);
		}
		else if(i==5)
		{
			fillRect(x,80,10,60);
		}
		else if(i==6)
		{
			fillRect(x,80,10,70);
		}
		else if(i==7)
		{
			fillRect(x,80,10,80);
		}
		else if(i==8)
		{
			fillRect(x,80,10,90);
		}
		else 
		{
			fillRect(x,80,10,100);
		}
		x+=20;
	}
	
}
}
