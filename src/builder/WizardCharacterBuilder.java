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
    public Character setName(String name) {
        this.character.setName(name);
        return this.character;
    }

    @Override
    public Character setJob() {
        this.character.setJob(Job.WIZARD);
        return this.character;
    }

    @Override
    public Character setSkills() throws Exception {
        character.addSkill(new Skill("Fire ball", 30, false));
        character.addSkill(new Skill("Ice spike", 30, false));
        return this.character;
    }
}
