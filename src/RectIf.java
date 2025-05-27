
public class RectIf extends MyFrame{
public void run() {
	int x=30;
	setColor(0,128,0);
	int i;
	for(i=0 ; i<9 ; i++)
	{
		if (i==0)
		{
			setColor(0,0,0);
			fillRect(x,80,10,100);
			
		}
		else if(i==1) 
		{
			setColor(26,26,26);
			fillRect(x,80,10,100);
		}
		
		else if(i==2)
		{
			setColor(51,51,51);
			fillRect(x,80,10,100);
		}
		else if(i==3)
		{
			setColor(77,77,77);
			fillRect(x,80,10,100);
		}
		else if(i==4)
		{
			setColor(102,102,102);
			fillRect(x,80,10,100);
		}
		else if(i==5)
		{
			setColor(128,128,128);
			fillRect(x,80,10,100);
		}
		else if(i==6)
		{
			setColor(153,153,153);
			fillRect(x,80,10,100);
		}
		else if(i==7)
		{
			setColor(179,179,179);
			fillRect(x,80,10,100);
		}
		else if(i==8)
		{
			setColor(204,204,204);
			fillRect(x,80,10,100);
		}
		else 
		{
			setColor(230,230,230);
			fillRect(x,80,10,100);
		}
		x+=20;
	}
	
}
}
