import java.util.* ; 
public class Main {

    public static int n , m ; 

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ;
        n = sc.nextInt() ; 
        m = sc.nextInt() ;
 
        PriorityQueue<Pair> pq = new PriorityQueue<>() ; 

        for(int i = 0 ; i < n ; i++){
            pq.add( new Pair(sc.nextInt() , sc.nextInt())) ; 
        }

        for(int i = 0 ; i < m ; i++){
            Pair p = pq.poll() ;
            pq.add(new Pair(p.x + 2 , p.y + 2)) ; 
        }
        System.out.println(pq.peek()) ;      
    }
}

class Pair implements Comparable<Pair>{
    int x ; 
    int y ; 

    public Pair(int x, int y){
        this.x = x ; 
        this.y = y ;
    }

    @Override
    public int compareTo(Pair p){
        if(this.x + this.y < p.x+p.y){
            // 이 객체의 거리가 더 작으면 
            return -1 ;
            // 우선순위상 앞에 와야함 <-> 음수 반환해야함 (암기 - '앞음' / '뒤양')
        }else if(this.x + this.y > p.x+p.y){
            return 1 ;
        }else{
            if(this.x < p.x){
                return -1 ; 
            }else if(this.x == p.x){
                return this.y - p.x ;
                // 내가 더 작으면 우선순위 상 앞에 와야함 <-> 음수 반환해야함 
            }else{
                return 1 ; 
            }
        }
    }
    public String toString(){
        return this.x + " " + this.y ; 
    }





}