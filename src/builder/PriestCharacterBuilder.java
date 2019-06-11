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
    public void setName(String name) {
        this.character.setName(name);
    }

    @Override
    public void setJob() {
        this.character.setJob(Job.PRIEST);
    }

    @Override
    public void setSkills() throws Exception {
        character.addSkill(new Skill("Healing", 10, true));
        character.addSkill(new Skill("Holy light", 20, false));
    }
}
