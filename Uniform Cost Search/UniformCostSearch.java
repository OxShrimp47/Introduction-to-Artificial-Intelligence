/*Name:Tommy Lee Truong
 *Last Edit:Oct 11 2019
 *Program Name: Uniform Cost Search
 */
import java.util.*;
public class UniformCostSearch {
	StreetMap map;
	String start;
	String end;
	int depthlim;
	public int nodeExpansionCount=0;
	public UniformCostSearch() {}
	public Node UniformCostSearch(boolean a) {
		Node x = new Node();
		List<Node> checked =new LinkedList<Node>();
		double lowestCost= x->children[0]->partialPathCost;
		double mainCost=(double)depthlim;
		Node goal = new Node();
		for(int i=0;i<x->children.size();i++) {
			if (lowestCost >= mainCost) {
				return goal;
			}
			if(x->children[i]->partialPathCost<=lowestCost && checked.contains(x->children[i])==false) {
					checked.add(x->children[i]);
					if (x->children[i].loc.name==end && checked.contains(x->children[i])==true) {
						mainCost = x->children[i]->partialPathCost;
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
