package sam1370.projecteuler;

import java.util.HashSet;
import java.util.Set;

class Problem1 implements Problem {
    Set<Integer> numbers = new HashSet<>();
    @Override
    public void main() {
	createMultiples(3);
	createMultiples(5);
	
	int answer = 0;
	for (int num : numbers) {
	    answer = answer + num;
	}
	// The answer!
	System.out.println("Problem 1 answer: " + answer);
    }
    
    private void createMultiples(int number) {
	for (int i = 0; i < 1000; i = i + number) {
	    numbers.add(i);
	}
    }
}
