package builder;

import model.Character;
import model.Job;
import model.Skill;

public class WarriorCharacterBuilder extends CharacterBuilder {

    public WarriorCharacterBuilder(){
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
        this.character.setJob(Job.WARRIOR);
    }

    @Override
    public void setSkills() throws Exception {
        character.addSkill(new Skill("Falcon Punch", 55, false));
    }
}
