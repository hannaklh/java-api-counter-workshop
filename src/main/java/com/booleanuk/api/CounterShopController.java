package com.booleanuk.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.*;

@RestController
public class CounterShopController {
    private final List<String[]> jokes;


    public CounterShopController(){
       /* String[] joke1 = {"Knock, knock", "Who's there?", "Lettuce", "Lettuce Who?", "Lettuce in, it's cold out here!"};
        String[] joke2 = {"Knock, knock", "Who's there?", "Cow says.", "Cow says who?", "No silly, cow says moooo!"};
        String[] joke3 = {"Knock, knock", "Who's there?", "Boo.", "Boo who?", "Don’t cry, it’s just a joke!"};
        String[] joke4 = {"Knock, knock", "Who's there?", "Tank.", "Tank who?", "You’re welcome!"};
        String[] joke5 = {"Knock, knock", "Who's there?", "Atch.", "Atch who?", "Bless you!"};
        this.jokes = new ArrayList<>(Arrays.asList(joke1, joke2, joke3, joke4, joke5));
    */ this.jokes = new ArrayList<>();
    }

    @GetMapping
    public String getJoke (){
        return "Hello! To get a very funny joke, add / and a number to the url, and watch the magic happen...";
    }
    @GetMapping("/{index}")
    public String getFirstLine(@PathVariable int index) {
        return "";
    }
    @GetMapping("/{index}/line2")
    public String getSecondLine(@PathVariable int index) {
        return "";
    }
    @GetMapping("/{index}/line3")
    public String getThirdLine(@PathVariable int index) {
        return "";
    }
    @GetMapping("/{index}/line4")
    public String getFourthLine(@PathVariable int index) {
        return "";
    }
    @GetMapping("/{index}/line5")
    public String getFifthLine(@PathVariable int index) {
        return "";
    }

    public List<String[]> getJokes() {
        return jokes;
    }
    public String getIndex(int index){
        return "";
        //jokes.getJokes().get(index)[0]
    }
}
