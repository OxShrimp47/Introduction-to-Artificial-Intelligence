/*Name:Tommy Lee Truong
 *Last Edit:Oct 11 2019
 *Program Name: Astar Search
 */
import java.util.LinkedList;
import java.util.List;
public class AStarSearch {
	StreetMap map;
	String start;
	String end;
	int depthlim;
	public int nodeExpansionCount=0;
	public AStarSearch() {}
	public Node AStarSearch(boolean a) {
		Node x = new Node();
		List<Node> checked =new LinkedList<Node>();
		double lowestCost= x->children[0]->partialPathCost + heuristicValue(x->children[0]);
		double astarCost= 0;
		double mainCost=(double)depthlim;
		Node goal = new Node();
		for(int i=0;i<x->children.size();i++) {
			astarCost = x->children[i]->partialPathCost + heuristicValue(x->children[i]);
			if (lowestCost >= mainCost) {
				return goal;
			}
			if(astarCost<=lowestCost && checked.contains(x->children[i])==false) {
					checked.add(x->children[i]);
					if (x->children[i].loc.name==end && checked.contains(x->children[i])==true) {
						mainCost = x->children[i]->partialPathCost + heuristicValue(x->children[i];
					}
					for (int j =0; j<x->children[i]->children.size();j++) {
						x->children[i]->children[j]->partialPathCost=x->children[i]->children[j]->partialPathCost+x->children[i]->partialPathCost;
					}
					x=x->children[i];
			}
		}
		return x;
	}
}