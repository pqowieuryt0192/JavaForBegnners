import java.util.Vector;

public class DisplayVehicleVector extends MyFrame
{
	public void run()
	{
		Vector<Vehicle> Vehicles=new Vector<Vehicle>();
		Vehicles.add(new Car(10,30,3,0));
		Vehicles.add(new Car(10,100,5,0));
		Vehicles.add(new Train(10,180,7,0));
		Vehicles.add(new Train(10,230,10,0));
		Vehicles.add(new Truck(10,280,15,0));
		Vehicles.add(new Truck(10,330,20,0));
		for (int i=0; i<30; i++)
		{
			clear();
			for(int j=0; j<Vehicles.size(); j++)
			{
				Vehicles.get(j).draw(this);
				Vehicles.get(j).move();
			}
			sleep(0.06);
		}
	}

}
