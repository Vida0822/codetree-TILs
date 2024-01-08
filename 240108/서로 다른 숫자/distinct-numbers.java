import java.util.* ; 

public class Main {

    public static int n ; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        n = sc.nextInt() ; 
        HashSet<Integer> s = new HashSet<>() ; 

        for(int i = 0 ; i < n ; i++){
            int k = sc.nextInt() ; 
            s.add(k) ; 
        }
        System.out.println(s.size()) ; 
    }
}