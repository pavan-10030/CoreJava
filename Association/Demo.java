class Os{
	private String name;
	private int size;
	public Os(String name, int size) {
		this.name=name;
		this.size=size;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getSize()
	{
		return this.size;
	}
}

class Charger{
	
	private String brand;
	private float voltage;
	
	public Charger(String brand,float voltage)
	{
		this.brand=brand;
		this.voltage=voltage;
	}
	
	public String getBrand()
	{
		return this.brand;
	}
	
	public float getVoltage()
	{
		return this.voltage;
	}
}


class Mobile{
	
	public Os os = new Os("Android",2);
	
	public void method(Charger c)
	{
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
	}
	
}



public class Demo {

	public static void main(String[] args) {
		
		Mobile m = new Mobile();
		Charger c = new Charger("Samsung",12.5f);
		System.out.println(m.os.getName());
		System.out.println(m.os.getSize());
		m.method(c);
		
		m=null;

		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());

	}

}
