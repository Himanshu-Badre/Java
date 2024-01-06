  package basic;

public class MetroCity {
public static void main (String args[]){
	String CityName = "Satara" ;
	if(CityName.equals("Mumbai"))
	{
		System.out.println(CityName+" Is Metro City");
	}else if(CityName.equals("Nagpur"))
	{
		System.out.println(CityName+" Is Metro City");
	}
	else if(CityName.equals("Mumbai"))
	{
		System.out.println(CityName+" Is Metro City");
	}
	else if(CityName.equalsIgnoreCase("Pune")) 
	{
		System.out.println(CityName+" Is Metro City");
	}
	else if(CityName.equals("Nashik"))
	{
		System.out.println(CityName+" Is Metro City");
	}
	else 
	{
		System.out.println(CityName+" Is Non-Metro City");
	}
    }
}



