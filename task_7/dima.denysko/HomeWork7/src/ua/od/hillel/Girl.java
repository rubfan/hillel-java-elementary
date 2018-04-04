package ua.od.hillel;

/**
 * Created by dmytro.denysko on 23.03.2018.
 */
public class Girl {
    private String name;
    private int levelOfAttention;

    public Girl(String name) {
        this.name = name;
        levelOfAttention = 30;
    }

    public String getName() {
        return name;
    }

    public int getLevelOfAttention() {
        return levelOfAttention;
    }

    public boolean chekAttantion() {
        if (levelOfAttention <= 0) return true;
        else return false;
    }

    public void addLevelOfAtanition(int levelOfAttention) {
        this.levelOfAttention += levelOfAttention;
    }

    public void removeLevelOfAttention(int levelOfAttention) {
        this.levelOfAttention -= levelOfAttention;
    }

}
