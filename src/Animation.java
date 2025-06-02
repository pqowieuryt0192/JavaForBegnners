
public class Animation extends MyFrame{
	public void run() {
int y=100;
int x=30;

while(true)
{
	
while(x<=170) 
{
clear();
setColor(0,128,0);

fillOval(x,y,100,100);
x+=5;


sleep(0.06);
}

while(y<=200) 
{
clear();
setColor(0,128,0);

fillOval(x,y,100,100);
y+=5;


sleep(0.06);
}

while(x>=30) 
{
clear();
setColor(0,128,0);

fillOval(x,y,100,100);
x-=5;


sleep(0.06);
}
while(y >= 200) 
{
clear();
setColor(0,128,0);

fillOval(x,y,100,100);
y+=5;

sleep(0.06);
}
if(y>=200)
{
	
}
//eles
{
	
}
}

}
	
}