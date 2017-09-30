package sam1370.projecteuler;

import java.util.ArrayList;
import java.util.List;

class Main {
    static List<Problem> problems = new ArrayList<Problem>();
    
    public static void main(String[] args) {
	addProblem(new Problem1());
	addProblem(new Problem2());
	
	for (Problem p : problems) {
	    p.main();
	}
    }
    
    private static void addProblem(Problem p) {
	problems.add(p);
    }
}
