package sam1370.projecteuler;

import java.util.HashSet;
import java.util.Set;

class Problem1 {
    Set<Integer> numbers = new HashSet<>();
    void main() {
	createMultiples(3);
	createMultiples(5);
	
	int answer = 0;
	for (int num : numbers) {
	    answer = answer + num;
	}
	// The answer!
	System.out.println(answer);
    }
    
    private void createMultiples(int number) {
	for (int i = 0; i < 1000; i = i + number) {
	    numbers.add(i);
	}
    }
}
