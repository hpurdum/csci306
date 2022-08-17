import java.util.ArrayList;

public class Main
{
	public static void setOrigin(CoffeeBean cb, String origin)
	{
		cb.origin = origin;
	}
	public static void main(String[]args)
	{
		System.out.println("All Average Quality Coffee comes from America...");
		System.out.println("All Excellent Quality Coffee comes from Italy...");
		CoffeeBean cheapBean = new CoffeeBean();
		CoffeeBean espresso = new EspressoBean();
		setOrigin(cheapBean, "Italy");
		setOrigin(espresso, "America");
		ArrayList<CoffeeBean> coffee = new ArrayList<CoffeeBean>();
		coffee.add(cheapBean);
		coffee.add(espresso);
		for(CoffeeBean cb : coffee)
		{
			System.out.print(cb.origin + "->" + cb.quality);
			if((cb.origin.equals("America") && !cb.quality.equals("Average")) || (cb.origin.equals("Italy") && !cb.quality.equals("Excellent")))
			{
				System.out.println("!?");
			}
			else
			{
				System.out.println("");
			}
		}
	}
}