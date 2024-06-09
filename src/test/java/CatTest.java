import com.example.Cat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    private Cat cat;

    @Test
    public void getSoundTest() {
        Cat feline = new Cat(cat);
        Mockito.when(cat.getSound()).thenReturn("Мяу");
    }
}
