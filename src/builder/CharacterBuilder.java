package builder;

import model.Character;
import model.Job;
import model.Skill;

import java.util.List;

public abstract class CharacterBuilder {

    protected Character character;

    public abstract Character build();

    public abstract CharacterBuilder setName(String name);

    public abstract CharacterBuilder setJob(Job job);

    public abstract CharacterBuilder setSkills(Skill skill) throws Exception;
}








