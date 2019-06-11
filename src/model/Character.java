package model;

import java.util.ArrayList;
import java.util.List;

public class Character {
    private String name;
    private Job job;
    private int level;
    private List<Skill> skills;

    public Character(){ }

    public Character(String name, Job job, List<Skill> skills) {
        this.name = name;
        this.job = job;
        this.skills = new ArrayList<Skill>();
        if(skills !=  null){
            this.skills.addAll(skills);
        }
    }

    public String getName() { return name; }

    public Job getJob() { return job; }

    public int getLevel() { return level;
    }

    public List<Skill> getSkills() { return skills; }

    public Character setName(String name) { this.name = name; return this; }

    public Character setJob(Job job) { this.job = job; return this; }

    public Character addSkill(Skill skill) throws Exception { 
        if(skill == null)
            throw new Exception("Skill is null");
        this.skills.add(skill);
        return this;
    }
}
