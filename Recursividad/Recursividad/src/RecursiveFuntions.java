import java.util.ArrayList;

public class RecursiveFuntions {


    private ArrayList<Integer> dp;
    public RecursiveFuntions(){
        dp = new ArrayList<>();
        for(int i=0 ; i<100 ; i++){
            dp.add(null);
        }
    }

    public long factorial(long num){

        //Casos base
        if(num == 0){
            return 1;
        }
        //Funcion
        //Llamados recursivos
        long res = num * factorial(num-1);
        return res;
    }

    public int fibonacci(int num){
        if(dp.get(num) == null ){
            //Casos base
            if(num == 0){
                return 0;
            }
            if(num == 1){
                return 1;
            }
            //Funcion y llamado recursivo
            int res = fibonacci(num-1) + fibonacci(num-2);
            //Guardar en DP
            dp.set(num, res);
            return res;
        }else{
            return dp.get(num);
        }

    }












}
