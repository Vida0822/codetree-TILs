import java.util.* ; 
public class Main {
    public static int n ; 

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in) ;
       n = sc.nextInt() ;

       // point : 정렬한 뒤엔 숫자 1개밖에 삭제 못한다
       // 정렬하기 전 k개 삭제할 때 작은 숫자를 최대한 많이 삭제하면 good ! 
       // part 1. 전체 평균을 구한다 
       // part 2. 평균보다 큰 값이 나올때까지 queue에서 삭제한다 --> 이게 맞는지 모르겠음 
       // part 3. 정렬 후 가장 작은 값을 삭제한 후 평균을 구한다   

       Queue<Integer> q = new LinkedList<>() ; 
       double sum = 0 ;
       for(int i = 0 ; i < n ; i++){
            int x = sc.nextInt() ;
            q.add(x) ; 
            sum += x ; 
       }
       double avg = sum / n ; 
       
       int k = 0 ;
       while(true){
            int x = q.peek() ; 
            if(x >= avg){
                break ; 
            }else{
                q.poll() ;
            }
            k++ ; 
       }
     //  System.out.println(k) ;

       PriorityQueue<Integer> pq = new PriorityQueue<>() ; 
       double sum2 = 0 ;
       for(int x : q){
            pq.add(x) ;
            sum2 += x ;  
        //    System.out.println(sum2); 
       }
        
       sum2 -= pq.poll() ; 
      // System.out.println(sum2) ; // 16.0
      // System.out.println(n-k-1) ;  // 2 
      // System.out.println(sum2/n-k-1) ; // 0.20000000
     //  System.out.printf("%.2f" , sum2/n-k-1) ;
       System.out.printf("%.2f" , sum2/(n-k-1)) ; 


    }
}