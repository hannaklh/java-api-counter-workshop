package com.booleanuk.api;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CounterShopControllerTest {


    @Test
    public void shouldViewInitalPage() {
        CounterShopController jokes = new CounterShopController();
        assertEquals("Hello! To get a very funny joke, add / and a number to the url, and watch the magic happen...", jokes.getJoke());

    }
    @Test
    public void shouldViewFirstLine() {
        CounterShopController jokes = new CounterShopController();
        int index = 0;
        assertEquals(jokes.getJokes().get(index)[0], jokes.getFirstLine(index));

    }
    @Test
    public void shouldViewSecondLine() {
        CounterShopController jokes = new CounterShopController();
        int index = 0;
        assertEquals(jokes.getIndex(index)+jokes.getIndex(index), jokes.getSecondLine(index));
    }
    @Test
    public void shouldViewThirdLine() {
        CounterShopController jokes = new CounterShopController();
        int index = 0;
        assertEquals(jokes.getIndex(index)+jokes.getIndex(index)+jokes.getIndex(index), jokes.getSecondLine(1));

    }
    @Test
    public void shouldViewFourthLine() {
        CounterShopController jokes = new CounterShopController();
        int index = 0;
        assertEquals(jokes.getIndex(index)+jokes.getIndex(index)+jokes.getIndex(index)+jokes.getIndex(index), jokes.getSecondLine(1));

    }
    @Test
    public void shouldViewFifthLine() {
        CounterShopController jokes = new CounterShopController();
        int index = 0;
        assertEquals(jokes.getIndex(index)+jokes.getIndex(index)+jokes.getIndex(index)+jokes.getIndex(index)+jokes.getIndex(index), jokes.getFifthLine(1));

    }
    @Test
    public void shouldViewIndex() {
        CounterShopController jokes = new CounterShopController();
        int index = 0;
        assertEquals("Knock, knock", jokes.getIndex(index));

    }

}
