import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class ValidationNameTest {

    private final String NAME;
    private final boolean EXPECTED;

    public ValidationNameTest(String name, boolean EXPECTED) {
        this.NAME = name;
        this.EXPECTED = EXPECTED;
    }

    @Parameterized.Parameters
    public static Object[][] getName() {
        return new Object[][]{
                {"Mike Smith", true},
                {"Mik", false},
                {"Mi", false},
                {" Mike Smith", false},
                {"Mike Smith ", false},
                {"MikeSmith ", false},
                {"Mike SmithMike Smith", false},
                {"Mike SmithMike Smi", false},
        };
    }

    @Test
    public void validationNameTest(){
        Account account = new Account(NAME);
        boolean result = account.checkNameToEmboss(NAME);
        assertEquals(EXPECTED, result);
    }

}
