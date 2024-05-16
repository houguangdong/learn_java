import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @ClassName U1106p1
 * @Description TODO
 * @Author liyc5
 * @Date 2019/10/27 15:02
 * @Version 1.0
 **/
public class fibo {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String trim = br.readLine().trim();
            Long test = test(Integer.valueOf(trim));
            System.out.println(test);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static Map<Integer, Long> cache = new HashMap<>();
    public static Long test(int n){

        if (n < 3) {
            cache.put(n, 1l);
            return 1l;
        } else {
            Long i;
            if (cache.containsKey(n)) {
                i = cache.get(n);
            } else {
                i = test(n - 1) + test(n - 2);
                if (i > 1000000) {
                    i = i - 1000000l;
                }
                cache.put(n, i);
            }
            return i;
        }
    }

}
