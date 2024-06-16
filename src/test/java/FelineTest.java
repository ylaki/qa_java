import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

//Используем Enclosed.class чтобы запускать по отдельности параметризованные и обычные тесты
@RunWith(Enclosed.class)
public class FelineTest {

    //Параметризированные тесты
    @RunWith(Parameterized.class)
    public static class FelineTestParametrized {

        private Feline feline;

        @Before
        public void setUp() {
            feline = new Feline();
        }

        //Обьявляем массив для параметризации
        @Parameterized.Parameters(name = "Animal kind: {0}")
        public static Collection<Object[]> dataForFood() {
            return Arrays.asList(new Object[][]{
                    {"Травоядное", Arrays.asList("Трава", "Различные растения")},
                    {"Хищник", Arrays.asList("Животные", "Птицы", "Рыба")}
            });
        }

        @Parameterized.Parameter(0)
        public String animalKind;

        @Parameterized.Parameter(1)
        public List<String> expectedFood;

        @Test
        public void getFoodTest() throws Exception {
            List<String> result = feline.getFood(animalKind);
            assertEquals(expectedFood, result);
        }
    }

    //Независимые от параметризации тесты
    public static class FelineTestDefault {

        private Feline feline;

        @Before
        public void setUp() {
            feline = new Feline();
        }

        @Test
        public void getKittensDefaultTest() {
            int result = feline.getKittens();
            assertEquals(1, result);
        }

        @Test
        public void getKittensWithParameterTest() {
            int result = feline.getKittens(3);
            assertEquals(3, result);
        }

        @Test
        public void getFamilyTest() {
            Assert.assertEquals("Кошачьи", feline.getFamily());
        }

        @Test
        public void eatMeatTest() throws Exception {
            // Вызываем eatMeat method
            List<String> result = feline.eatMeat();

            // Проверяем результат
            List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
            assertEquals(expectedFood, result);
        }
    }
}
