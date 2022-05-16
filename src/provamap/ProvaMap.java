package provamap;

import java.util.HashMap;
import java.util.Map;

public class ProvaMap {

	public static void main(String[] args) {
		Map<String, String> capitali = new HashMap<String, String>();
		capitali.put("Italy", "Rome");
		capitali.put("England", "London");
		capitali.put("Sweden", "Stoccolma");
		// TODO
		capitali.put("Congo", "Kinshasa");
		capitali.put("Germany", "Berlin");
		capitali.put("Norway", "OSLO");

		System.out.println(capitali.size());

		for (String capitaliItem : capitali.keySet()) {
			System.out.println("Il paese: " + capitaliItem + " ha come capitale: " + capitali.get(capitaliItem));
		}

	}

}
