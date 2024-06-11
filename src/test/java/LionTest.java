import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class LionTest {
    // Объявляем переменную
    @Mock
    Feline feline;

    // Создаем мок объект
    @Before
    public void setUp (){
        feline = Mockito.mock(Feline.class);
    }

    // Проверяем есть ли у самца грива
    @Test
    public void lionHasManeTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
    }

    // Проверяем есть ли у самки грива
    @Test
    public void lionDoesNotHaveManeTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        assertFalse(lion.doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void lionInvalidSexTest() throws Exception {
        // Создаем обьект lion с неправильным полом
        Lion lion = new Lion("Небинарный", feline); // Ожидаем Exception
    }

    @Test
    public void lionGetKittensTest() throws Exception {
        // Когда вызываем метод getKittens, возвращается значение 1
        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion("Самка", feline);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void lionGetFoodTest() throws Exception {
        List<String> mockFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(mockFood);
        Lion lion = new Lion("Самец", feline);
        List<String> food = lion.getFood();
        assertEquals(mockFood, food);
    }
}