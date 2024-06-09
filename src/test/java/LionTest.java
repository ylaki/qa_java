import com.example.Cat;
import com.example.Felidae;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.runners.Parameterized;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    private Felidae felidae;

    @Parameterized.Parameter
    public int power;
    @Parameterized.Parameter(1)
    public int expectedResult;

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {
                { 4, 16 },
                { 2, 8 }
        };
    }



    @Test
    public void getCheckSexTest() {



    }


}
