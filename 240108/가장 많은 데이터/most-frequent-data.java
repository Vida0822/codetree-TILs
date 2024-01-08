import java.util.* ; 

public class Main {
    public static int n ; 
    public static String[] words ; 

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ; 
        n = sc.nextInt() ; 

        HashMap<String, Integer> hm = new HashMap<>() ; 

        int max = 0 ; 
        for(int i = 0 ; i < n ; i++){
            String key = sc.next() ; 

            int count = 1 ; 
            if(hm.containsKey(key)){
                count = hm.get(key) + 1 ;
                hm.put(key, count); 
            }else{
                hm.put(key, count) ;  
            }

            if(count > max){
                max = count  ; 
            }
        }
        System.out.println(max) ; 
    }
}