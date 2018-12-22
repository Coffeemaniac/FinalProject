package club.battlestar.vachan.jokes;

import java.util.ArrayList;
import java.util.Random;

public class JokesProvider {

    private ArrayList<String> jokesDB;

    public JokesProvider(){
        jokesDB = new ArrayList<>();
        jokesDB.add("Using Gradle is a pleasant experience");
        jokesDB.add("Why did the programmer leave his job? \n" +
                "He didn't get arrays (a raise)");
        jokesDB.add("0 is false and 1 is true, Right?\n" +
                "1");
        jokesDB.add("what do computers and AC have in common\n" +
                "They both become useless when you open Windows");

    }

    public String getJokes(){

        Random random = new Random();
        return jokesDB.get(random.nextInt(jokesDB.size()));
    }

}
