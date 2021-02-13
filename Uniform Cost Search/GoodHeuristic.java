//
// GoodHeuristic
//
// This class extends the Heuristic class, providing a reasonable
// implementation of the heuristic function method. The provided "good"
// heuristic function is admissible.
//
// Tommy Lee Truong -- October 11, 2019
//


// IMPORT ANY PACKAGES THAT YOU NEED.
// import java.util.*;


public class GoodHeuristic extends Heuristic {
	Node x = new Node();
	double sum[];
	Location destination;
        // YOU CAN ADD ANYTHING YOU LIKE TO THIS CLASS ... WHATEVER WOULD
        // ASSIST IN THE CALCULATION OF YOUR GOOD HEURISTIC VALUE.

	// heuristicValue -- Return the appropriate heuristic values for the
	// given search tree node. Note that the given Node should not be
	// modified within the body of this function.
}
	public double heuristicValue(Node thisNode) {
		double hVal = 0.0;
		sum = new double[thisNode->children.size];
		for(int i; i<thisNode->children.size; i++) {
		while (destination != thisNode->loc) {
		sum[i]= sum[i] + thisNode->partialPathCost;
		thisNode = thisNode->children[i];
		}
		}
		for(int i; i<thisNode->children.size; i++) {
		hval=hval+sum[i];
		}
		hval=hval/sum.length;
		// COMPUTE A REASONABLE HEURISTIC VALUE HERE

		return (hVal);
	}

}
