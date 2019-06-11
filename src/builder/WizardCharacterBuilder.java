package builder;

import model.Character;
import model.Job;
import model.Skill;

public class WizardCharacterBuilder extends CharacterBuilder {
    public WizardCharacterBuilder(){
        this.character = new Character();
    }

    @Override
    public Character build() {
        return this.character;
    }

    @Override
    public CharacterBuilder setName(String name) {
        this.character.setName(name);
        return this;
    }

    @Override
    public  CharacterBuilder setJob(Job job) {
        this.character.setJob(job);
        return this;
    }

    @Override
    public CharacterBuilder setSkills(Skill skill) throws Exception {
        character.addSkill(skill);
        return this;
    }
}
