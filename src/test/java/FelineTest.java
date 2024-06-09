import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class) // запустили этот класс с Mockito
public class FelineTest {

    @Mock // создали мок
            Feline feline;

    @Test
    public void felineGetKittensTest()} {
        OrderManagementService orderManagementService = new OrderManagementService(courierManagementService);
        orderManagementService.assignToCourier();
        Mockito.verify(courierManagementService, Mockito.times(1)).getFreeCourier();

        public int getKittens() {
            return getKittens(1);
    }
}

}