import java.util.* ; 

public class Main {
    public static int n , m ; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        n = sc.nextInt() ;
        m = sc.nextInt() ;  

        TreeSet<Integer> s = new TreeSet<>() ; 
        for(int i = 0 ; i < n ; i++){
            s.add(sc.nextInt()) ; 
        }
        
        while(m -- > 0){
            int x = sc.nextInt() ; 
            if(s.ceiling(x) == null){
                System.out.println(-1) ; 
            }else{
                System.out.println(s.ceiling(x)) ; 
            }
        }
    }
}