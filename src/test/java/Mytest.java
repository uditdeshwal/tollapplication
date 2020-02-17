import org.junit.Test;
import com.example.testrest.MathUtils;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.mockito.Mockito.*;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Mytest {

    @Test
   public void test() throws  Exception {
        MathUtils mockMathUtils = Mockito.mock(MathUtils.class);
        Mockito.when(mockMathUtils.add(1, 1)).thenReturn(2);


       ArgumentCaptor<Integer> acInteger = ArgumentCaptor.forClass(Integer.class);

       // mockMathUtils.add(1, 1);


        MathService mathService = new MathService(mockMathUtils);
        mathService.add(1,1);

        Mockito.verify(mockMathUtils).add(acInteger.capture(), acInteger.capture());
        List allValues = acInteger.getAllValues();
        System.out.println();

    }
}
