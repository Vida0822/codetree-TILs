import java.util.* ;
public class Main {

    public static int n ; 

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ; 
        n = sc.nextInt() ; 


        PriorityQueue<Integer> pq = new PriorityQueue<>() ; 

        for(int i = 0 ; i<n ; i++){
            int x = sc.nextInt(); 

            if(x>0){
                pq.add(x) ; 
            }else if(x==0){              
                System.out.println(pq.isEmpty()? 0 : pq.poll()) ; 
            }

        }
        
    }
}