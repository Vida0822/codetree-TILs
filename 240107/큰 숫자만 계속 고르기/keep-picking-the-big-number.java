import java.util.* ;

public class Main {
    public static int n , m ; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        n = sc.nextInt() ; 
        m = sc.nextInt() ;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()) ; 


        for(int i = 0 ; i < n ; i++){
            pq.add(sc.nextInt()) ; 
        }
        for(int i = 0 ; i < m ; i++){
            
            pq.add(pq.poll()-1 );
        }
        System.out.println(pq.peek()) ; 

    }
}