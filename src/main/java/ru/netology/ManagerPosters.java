package ru.netology;

public class ManagerPosters {
    private Posters[] names = new Posters[0];
    private int limit = 5;

    public ManagerPosters() {

    }

    public ManagerPosters(int limit) {
        this.limit = limit;
    }

    public void addPoster(Posters name) {
        Posters[] tmp = new Posters[names.length + 1];
        for (int i = 0; i < names.length; i++) {
            tmp[i] = names[i];
        }
        tmp[tmp.length - 1] = name;
        names = tmp;
    }

    public Posters[] findAll() {
        return names;
    }

    public Posters[] findLast() {
        int resultLength;
        if (names.length < limit) {
            resultLength = names.length;
        } else {
            resultLength = limit;
        }
        Posters[] reversed = new Posters[resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = names[names.length - 1 - i];
        }
        return reversed;
    }

}
