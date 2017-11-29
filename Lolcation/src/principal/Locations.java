package principal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The Class Locations.
 */
class Locations implements Iterable<Location> {
	
	/** The locations. */
	private List<Location> locations;

	/**
	 * Instantiates a new locations.

	 *
	 * @param locations the locations
	 */
	public Locations() {
		this.locations = new ArrayList<Location>();
	}

	/**
	 * Gets the locations.
	 *
	 * @return the locations
	 */
	public List<Location> getLocations() {
		return locations;
	}
	/**
	 * Ajouter une location.
	 * @param location Location à ajouter.
	 */
	public void add(Location location) {
		locations.add(location);
	}

	@Override
	public Iterator<Location> iterator() {
		return locations.iterator();
	}
	
	
	
	
}
