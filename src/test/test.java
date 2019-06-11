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

        Character priest = new PriestCharacterBuilder().setName("Priest").build();
        Character warrior = new WarriorCharacterBuilder().setName("Warrior").setJob(job).build();
        Character wizard = new WizardCharacterBuilder().setName("Wizard").setJob(job).setSkills(skill).build();
        
    }
  }

  