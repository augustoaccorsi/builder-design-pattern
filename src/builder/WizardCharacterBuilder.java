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
    public void setName(String name) {
        this.character.setName(name);
    }

    @Override
    public void setJob() {
        this.character.setJob(Job.WIZARD);
    }

    @Override
    public void setAge(int age) {
        this.character.setAge(age);
    }

    @Override
    public void setSkills() throws Exception {
        character.addSkill(new Skill("Fire ball", 30, false));
        character.addSkill(new Skill("Ice spike", 30, false));
    }
}
