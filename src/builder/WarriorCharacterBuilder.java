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
    public  setName(String name) {
        this.character.setName(name);
        return this.character;
    }

    @Override
    public  setJob() {
        this.character.setJob(Job.WARRIOR);
        return this.character;
    }

    @Override
    public  setSkills() throws Exception {
        character.addSkill(new Skill("Falcon Punch", 55, false));
        return this.character;
    }
}
