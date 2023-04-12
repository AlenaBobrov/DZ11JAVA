package ru.netology;
public class ManagerPosters {
    private Posters[] names = new Posters[0];
    public void addPoster(Posters name) {
        Posters[] tmp = new Posters[names.length + 1];
        for (int i = 0; i < names.length; i++) {
            tmp[i] = names[i];
        }
        tmp[tmp.length - 1] = name;
        names = tmp;
    }
    public String getPosterName() {
        return posterName;
    }
    public Posters[] getPosterName() {
        Posters[] all = getPosterName();
        Posters[] reversed = new Posters[all.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }
}
