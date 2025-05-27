
public class RectIf extends MyFrame{
public void run() {
	int x=30;
	setColor(0,128,0);
	int i;
	for(i=0 ; i<9 ; i++)
	{
		if (i==0)
		{
			fillRect(x,80,10,100);
			
		}
		else if(i==1) 
		{
			fillRect(x,85,10,100);
		}
		
		else if(i==2)
		{
			fillRect(x,90,10,100);
		}
		else if(i==3)
		{
			fillRect(x,95,10,100);
		}
		else if(i==4)
		{
			fillRect(x,100,10,100);
		}
		else if(i==5)
		{
			fillRect(x,105,10,100);
		}
		else if(i==6)
		{
			fillRect(x,110,10,100);
		}
		else if(i==7)
		{
			fillRect(x,115,10,100);
		}
		else if(i==8)
		{
			fillRect(x,120,10,100);
		}
		else 
		{
			fillRect(x,125,10,100);
		}
		x+=20;
	}
	
}
}
