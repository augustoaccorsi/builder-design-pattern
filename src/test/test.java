import builder.PriestCharacterBuilder;
import builder.WarriorCharacterBuilder;
import builder.WizardCharacterBuilder;
import model.Character;
import model.Skill;

public class Test {
    /**
     *
     */

    @Test
    public void testBuilder() {

        Job job = new Job();
        Skill skill = new Skill();

        Character priest = new PriestCharacterBuilder().build().setName("Priest");
        Character warrior = new WarriorCharacterBuilder().build().setName("Warrior").setJob(job);
        Character wizard = new WizardCharacterBuilder().build().setName("Wizard").setJob(job).addSkill(skill);
        
    }
  }