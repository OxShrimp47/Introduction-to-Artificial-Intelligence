/*Name:Tommy Lee Truong
 *Last Edit:Sept 27 2019
 *Program Name: Breadth 1st Search
 */
import java.util.*;

public class BFSearch {
	Map stateSpace;
	public String startName;
	public String finishName;
	int depthLimit = 10000;
	public int nodeExpansionCount=0;
	//default constructor
	public BFSearch() {}
	//constructor with state space and search parameters specified...
	private List<Location> stateSave(List<Location> L, Location start) {
		List<Location> L2= new ArrayList<Location>();
		for(int i=0; i< L.size();i++) {
			if (start.findRoad(L.get(i)) != null) {
				L2.add(L.get(i));
			}
		}
		return L2;
	}	
	public BFSearch(Map stateSpace, String startName, String finishName, int depthLimit) {
		LinkedList<Node> q= new LinkedList();
		List<Location> Loc= new ArrayList<Location>();
		List<Location> Loc2= new ArrayList<Location>();
		List<Road> Rd= new ArrayList<Road>();
		Node head = null;
		Node tail = null;
		head.loc = stateSpace.findLocation(finishName);
		tail.loc = stateSpace.findLocation(finishName);
		Loc=stateSpace.locations;
		Loc=stateSave(Loc,head.loc);
		
		/*for(int i=0; i< stateSpace.locations.size();i++) {
			if (stateSpace.findLocation(startName).findRoad(Loc.get(i)) != null) {
				head.children.get(i).loc=Loc.get(i);
			}
		}*/
		for(int i=0; i< Loc.size();i++) {
			stateSave(stateSpace.locations,Loc.get(i));
		}
		/*
		for(int i=0; i< stateSpace.locations.size();i++) {
			if (stateSpace.findLocation(startName).findRoad(Loc.get(i)) != null) {
				Rd.add(stateSpace.findLocation(startName).findRoad(Loc.get(i)));
			}
		}*/
		Frontier space;
		
	}
	public Node search(boolean useRepeatedStateChecking) {
		Node n = new Node();
		if(useRepeatedStateChecking==false) {
			return n;
		}
		if(useRepeatedStateChecking==true) {}
		/*Node q = stateSpace.locations.startName;
		while(stateSpace.locations.name != startName) {
			stateSpace.locations.parent;
		}
		
	
		
		for(int i=0;i<stateSpace.locations.size();i++) {
			check[i]=false;
			q=q->child;
		}
		finishName=loc.names;
		if(q->parent!=NULL && useRepeatedStateChecking==true) {
			check =true;
			check=check->parent;
			q=q->parent;
			nodeExpansionCount++;
			this.search(check);
		}
		else if(q->child != NULL && useRepeatedStateChecking ==false);
			check=true;
			check=check->child;
			q=q->child;
			nodeExpansionCount++;
			this.search(check);
		}*/

		//Initialize the expansion count
		nodeExpansionCount=0;
		
	}
}
