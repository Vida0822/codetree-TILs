import java.util.*  ; 

public class Main {

    public static int n ; 
    
    public static void main(String[] args) {

         
        // add , size , isEmpty, peek , poll 

        Scanner sc = new Scanner(System.in) ;
        n = sc.nextInt() ;
        // String[] operations = new String[n] ; 
        /*
        for(int i = 0 ; i < n ; i++){
            operations[i] = sc.next() ; 
        }
        */
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.naturalOrder());

        for(int i = 0 ; i < n ; i++){
         
            String operation = sc.next() ;  
            if(operation.startsWith("push")){
                pq.add(sc.nextInt()) ;  
                // 정수 입력이 명령어 받은 직후에 일어나기 때문에 위에서 "push 3"을 하나의 문자열로 취급하는 코드 사용하면 안됨  

            }else if(operation.startsWith("pop")){
                System.out.println(pq.poll()) ; 
            }else if(operation.startsWith("size")){
                System.out.println(pq.size());  
            }else if(operation.startsWith("empty")){
                System.out.println(pq.isEmpty()? 1:0);  
            }else {
                System.out.println(pq.peek()) ; 
            }
        
            
        }


        


    }
}