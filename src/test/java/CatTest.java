import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

public class CatTest {
    @Mock
    Feline feline;
    Cat cat;

    @Before
    public void setUp() {
        // Создаем мок обьект из класса Feline
        feline = mock(Feline.class);
        // Передаем созданный обьект в конструктор Cat
        cat = new Cat(feline);
    }

    @Test
    public void getSoundTest() {
        // Проверяем что getSound() возвращает "Мяу"
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodTest() throws Exception {
        // Проверряем моком что eatMeat() возвращает список еды
        List<String> food = Arrays.asList("Мясо", "Рыба");
        when(feline.eatMeat()).thenReturn(food);

        // Проверяем, что getFood() возвращает ожидаемый список
        Assert.assertEquals(food, cat.getFood());

        // Проверяем, что eatMeat() вызывается только 1 раз
        verify(feline, times(1)).eatMeat();
    }

    @Test
    public void getFoodTestThrowsException() throws Exception {
        // Проверяем моком, что eatMeat() выбрасывает Exception
        when(feline.eatMeat()).thenThrow(new Exception("Predator exception"));

        // Проверяем, что exception правильно отрабатывает
        try {
            cat.getFood();
        } catch (Exception e) {
            Assert.assertEquals("Predator exception", e.getMessage());
        }

        // Проверяем, что eatMeat() вызывается только 1 раз
        verify(feline, times(1)).eatMeat();
    }
}