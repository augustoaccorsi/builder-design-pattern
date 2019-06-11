package model;

import java.util.ArrayList;
import java.util.List;

public class Character {
    private String name;
    private Job job;
    private int level;
    private List<Skill> skills;
    private int age;

    public Character(){ }

    public Character(String name, Job job, List<Skill> skills) {
        this.name = name;
        this.job = job;
        this.skills = new ArrayList<Skill>();
        if(skills !=  null){
            this.skills.addAll(skills);
        }
    }

    public String getName() {
        return name;
    }

    public Job getJob() {
        return job;
    }

    public int getLevel() {
        return level;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public void addSkill(Skill skill) throws Exception {
        if(skill == null)
            throw new Exception("Skill is null");
        this.skills.add(skill);
    }
}
