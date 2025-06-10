public class DiaplayCarsTrains extends MyFrame
{
public void run()
{
	Vehicle[] Vehicles=new Vehicle[6];
	Vehicles[0]=new Car(10,30,3,0);
	Vehicles[1]=new Car(10,100,5,0);
	Vehicles[2]=new Train(10,180,7,0);
	Vehicles[3]=new Train(10,230,10,0);
	Vehicles[4]=new Truck(10,280,15,0);
	Vehicles[5]=new Truck(10,330,20,0);
	for (int i=0; i<30; i++)
	{
		clear();
		for(int j=0; j<Vehicles.length; j++)
		{
			Vehicles[j].draw(this);
			Vehicles[j].move();
		}
		sleep(0.06);
	}
}

}
