import builder.PriestCharacterBuilder;
import builder.WarriorCharacterBuilder;
import builder.WizardCharacterBuilder;
import model.Character;

public class Test {
    /**
     *
     */

    @Test
    public void testBuilder() {

        Character priest = new PriestCharacterBuilder().build().setName("Priest");
        Character warrior = new WarriorCharacterBuilder().build().setName("Warrior");
        Character wizard = new WizardCharacterBuilder().build().setAge(12);
        
    }
  }