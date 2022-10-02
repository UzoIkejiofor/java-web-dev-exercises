package exercises;

import java.util.ArrayList;
import java.util.Collections;
public class PlanetsExample {
    public static void main (String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uranus");
        planets.add("Neptune");
        planets.add("Pluto");

        System.out.println(planets.size());
        System.out.println(planets.contains("Earth"));
        System.out.println(planets.indexOf("Uranus"));
        Collections.sort(planets);
        System.out.println(planets);


    }
}
