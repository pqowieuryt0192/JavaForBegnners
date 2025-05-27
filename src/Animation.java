
public class Animation extends MyFrame{
	public void run() {
int y=100;
int x=30;

for(int i=0 ; i<3 ; i++) 
{
	
while(x<=170) 
{
clear();
setColor(0,128,0);
System.out.println(x);
System.out.println(y);
fillOval(x,y,100,100);
x+=5;


sleep(0.06);
}
while(x>=30) 
{
clear();
setColor(0,128,0);
System.out.println(x);
System.out.println(y);
fillOval(x,y,100,100);
x-=5;


sleep(0.06);
}

}

}
	
}