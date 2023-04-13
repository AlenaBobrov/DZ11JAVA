package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerPostersTest {
    Posters name1 = new Posters("Фильм1");
    Posters name2 = new Posters("Фильм2");
    Posters name3 = new Posters("Фильм3");
    Posters name4 = new Posters("Фильм4");
    Posters name5 = new Posters("Фильм5");
    Posters name6 = new Posters("Фильм6");
    Posters name7 = new Posters("Фильм7");

    @Test
    public void ShouldAddNew() {
        ManagerPosters post = new ManagerPosters();
        post.addPoster(name1);
        post.addPoster(name2);
        post.addPoster(name3);
        post.addPoster(name4);
        post.addPoster(name5);
        post.addPoster(name6);
        post.addPoster(name7);

        Posters[] expected = {name1, name2, name3, name4, name5, name6, name7};
        Posters[] actual = post.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldAddLimit() {
        ManagerPosters post2 = new ManagerPosters(5);
        post2.addPoster(name1);
        post2.addPoster(name2);
        post2.addPoster(name3);
        post2.addPoster(name4);
        post2.addPoster(name5);
        post2.addPoster(name6);
        post2.addPoster(name7);

        Posters[] expected = {name7, name6, name5, name4, name3};
        Posters[] actual = post2.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldAddLimit3() {
        ManagerPosters post3 = new ManagerPosters(3);
        post3.addPoster(name1);
        post3.addPoster(name2);
        post3.addPoster(name3);
        post3.addPoster(name4);
        post3.addPoster(name5);
        post3.addPoster(name6);
        post3.addPoster(name7);

        Posters[] expected = {name7, name6, name5};
        Posters[] actual = post3.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldAddLimit1() {
        ManagerPosters post4 = new ManagerPosters(1);
        post4.addPoster(name1);
        post4.addPoster(name2);
        post4.addPoster(name3);
        post4.addPoster(name4);
        post4.addPoster(name5);
        post4.addPoster(name6);
        post4.addPoster(name7);

        Posters[] expected = {name7};
        Posters[] actual = post4.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldAddNoLimit() {
        ManagerPosters post5 = new ManagerPosters();
        post5.addPoster(name1);
        post5.addPoster(name2);
        post5.addPoster(name3);
        post5.addPoster(name4);
        post5.addPoster(name5);
        post5.addPoster(name6);
        post5.addPoster(name7);

        Posters[] expected = {name7, name6, name5, name4, name3};
        Posters[] actual = post5.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldAddOverLimit() {
        ManagerPosters post6 = new ManagerPosters(8);
        post6.addPoster(name1);
        post6.addPoster(name2);
        post6.addPoster(name3);
        post6.addPoster(name4);
        post6.addPoster(name5);
        post6.addPoster(name6);
        post6.addPoster(name7);

        Posters[] expected = {name7, name6, name5, name4, name3, name2, name1};
        Posters[] actual = post6.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
