package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("Elias")) {
            return "Hi Elias!";
        } else if (query.contains("name")) {
           return "MyTeam";
        } else { // TODO extend the programm here
            return "";
        }
    }
}
