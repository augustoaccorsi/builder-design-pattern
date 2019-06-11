package builder;

import model.Character;
import model.Job;
import model.Skill;

import java.util.List;

public abstract class CharacterBuilder {

    protected Character character;

    public abstract Character build();

    public abstract void setName(String name);

    public abstract void setJob();

    public abstract void setSkills() throws Exception;

    public abstract void setAge(int age);
}
