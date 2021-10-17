import DATA.Temperature;
import DATA.TemperatureException;
import DATA.UniteTemperature;

/*****************************
 | Created by IntelliJ IDEA. |
 | User: HUBERT Samuel       |
 *****************************/

public class TestTemperature
{
	public static void main(String[] args)
	{
		UniteTemperature u1 = UniteTemperature.F;
		System.out.println(u1.pointEbulitionEau);
		System.out.println(UniteTemperature.F.pointEbulitionEau);

		System.out.println(UniteTemperature.convertTo(12, UniteTemperature.F, UniteTemperature.C));

		try {
			Temperature tc1 = new Temperature(-275, UniteTemperature.C);
			System.out.println(tc1);
		} catch (TemperatureException ex) {
			System.out.println("Trop froid !!!");
		}
	}
}
