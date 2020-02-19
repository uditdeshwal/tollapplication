import com.example.testrest.MathUtils;

public class MathService {

    public MathService(MathUtils mathUtils) {
        this.mathUtils = mathUtils;
    }

    private MathUtils mathUtils;

     public int  add(int x, int y){
     
         return mathUtils.add(x,y);
     }


}
