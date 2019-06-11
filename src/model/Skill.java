package model;

public class Skill {
    private int level;
    private String name;
    private int power;
    private boolean isHealing;

    public Skill(String name, int power, boolean isHealing) {
        this.level = 1;
        this.name = name;
        this.power = power;
        this.isHealing = isHealing;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public void levelUp(){
        level++;
        power += power * 0.10;
    }
}
