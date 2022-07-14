package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("which of the following numbers is the largest:")) {
            String substring = query.substring(48);
            String[] stringNumbers = substring.split(" ");
            int[] numbers = new int[stringNumbers.length];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.getInteger(String.valueOf(numbers[i]));
            }
            int largestNumber = numbers[0];
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > largestNumber) {
                    largestNumber = numbers[i];
                }
            }
            return "" + largestNumber;
        } else { // TODO extend the programm here
            return "";
        }
    }
}
