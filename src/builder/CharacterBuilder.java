package builder;

import model.Character;
import model.Job;
import model.Skill;

import java.util.List;

public abstract class CharacterBuilder {

    protected Character character;

    public abstract Character build();

    public abstract Character setName(String name);

    public abstract Character setJob();

    public abstract Character setSkills() throws Exception;
}
