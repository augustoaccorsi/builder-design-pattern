package builder;

import model.Character;
import model.Job;
import model.Skill;

public class PriestCharacterBuilder extends CharacterBuilder {

    public PriestCharacterBuilder(){
        this.character = new Character();
    }

    @Override
    public Character build() {
        return this.character;
    }

    @Override
    public Character setName(String name) {
        this.character.setName(name);
        return this.character;
    }

    @Override
    public Character setJob() {
        this.character.setJob(Job.PRIEST);
        return this.character;
    }

    @Override
    public Character setSkills() throws Exception {
        character.addSkill(new Skill("Healing", 10, true));
        character.addSkill(new Skill("Holy light", 20, false));
        return this.character;
    }
}
