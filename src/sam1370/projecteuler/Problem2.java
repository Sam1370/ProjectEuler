package sam1370.projecteuler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Problem2 implements Problem {
    
    List<Integer> numbers = new ArrayList<Integer>();
    
    @Override
    public void main() {
	numbers.add(1);
	numbers.add(2);
	
	int iteration = numbers.size();
	int num = 0;
	int max = 4000000;
	
	while (num < max) {
	    int behind1 = 0;
	    int behind2 = 0;
	    behind1 = numbers.get(iteration - 1);
	    behind2 = numbers.get(iteration - 2);
	    
	    num = behind1 + behind2;
	    iteration++;
	    
	    if (num < max) numbers.add(num);
	}
	
	// iteration
	Iterator<Integer> iter = numbers.iterator();
	while (iter.hasNext()) {
	    Integer number = iter.next();
	    if (!isEven(number)) iter.remove();
	}
	
	Integer answer = 0;
	for (Integer numb : numbers) {
	    answer = answer + numb;
	}
	System.out.println("Problem 2 answer: " + answer);
    }
    
    private boolean isEven(Integer num) {
	if (num % 2 == 0) {
	    return true;
	}
	return false;
    }
}
