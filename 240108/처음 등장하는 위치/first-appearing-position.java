import java.util.* ; 
import java.util.Map.Entry ; 

public class Main {

    public static int n ; 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        n = sc.nextInt() ; 

        TreeMap<Integer, Integer> m = new TreeMap<>() ; 

        for(int i = 1 ; i <= n ; i ++){
            int k = sc.nextInt() ; 
            if(!m.containsKey(k)){
                m.put(k, i) ; 
            }         
        }

        Iterator<Entry<Integer, Integer>> it =  m.entrySet().iterator() ; 
        while(it.hasNext()){
            Entry<Integer, Integer> en = it.next() ; 
            System.out.println(en.getKey()+ " "+ en.getValue()) ; 
        }



    }
}