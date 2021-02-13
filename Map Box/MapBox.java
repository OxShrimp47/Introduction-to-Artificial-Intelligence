/*Name:Tommy Lee Truong
 *Last Edit:Sept 20 2019
 *Program Name: Map Box
 */
import java.util.LinkedList;

public class MapBox {
	double Westmost=0.0;
	double Eastmost=0.0;
	double Northmost=0.0;
	double Southmost=0.0;
	public MapBox() {
		this.Westmost= Westmost();
		this.Eastmost=Eastmost();
		this.Northmost=Northmost();
		this.Southmost=Southmost();
	}
	public LinkedList<Location> locations = new LinkedList<Location>();
	public LinkedList<String> name =new LinkedList<String>();
	public double Westmost() {
		double x=0.0;
		for(int i=0; i<locations.size();i++) {
			if(locations.get(i).longitude < x||i==0) {
				x= locations.get(i).longitude;
			}
		}
		return x;
	}
	public double Eastmost() {
		double x=0.0;
		for(int i=0; i<locations.size();i++) {
			if(locations.get(i).longitude > x||i==0) {
				x= locations.get(i).longitude;
			}
		}
		return x;
	}
	public double Northmost() {
		double x=0.0;
		for(int i=0; i<locations.size();i++) {
			if(locations.get(i).latitude > x||i==0) {
				x= locations.get(i).latitude;
			}
		}
		return x;
	}
	public double Southmost() {
		double x=0.0;
		for(int i=0; i<locations.size();i++) {
			if(locations.get(i).latitude < x||i==0) {
				x= locations.get(i).latitude;
			}
		}
		return x;
	}
	public boolean recordLocation (Location x) {
		if (name.contains(x.name)==false) {
			locations.add(x);
			name.add(x.name);
			return true;
		}
		return false;
	}
}
