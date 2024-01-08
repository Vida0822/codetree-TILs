import java.util.* ; 

public class Main {
    public static int n , m; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        n = sc.nextInt() ; 
        m = sc.nextInt() ; 

        TreeSet<Pair> s = new TreeSet<>() ; 

        while(n-- > 0){
            int x = sc.nextInt() ; 
            int y = sc.nextInt() ; 
            s.add(new Pair(x,y)) ; 
        }

        while(m-- > 0){
            int x = sc.nextInt() ; 
            int y = sc.nextInt() ; 

            Pair p = s.ceiling(new Pair(x, y)) ; 
            System.out.println(p == null?"-1 -1":p.x+" "+p.y) ;  
        }       
    }
}

class Pair implements Comparable<Pair>{
   
    int x ; 
    int y ; 

    Pair(int x, int y){
        this.x = x ; 
        this.y = y ; 
    }

    @Override
    public int compareTo(Pair p){
      if(this.x != p.x) 
        return this.x - p.x ; 
        // 내 x값이 더 작으면 음수 --> 앞에옴 (우선순위 선 !)
      else
        return this.y - p.y ;   
        // ※ 여기서 주어진 점보다 작은 경우를 고려할 필요 x 
        // 여기선 그냥 정말 점의 우선순위 기준만 설정해주는거고, 
        // 그 우선순위를 바탕으로 범위검색 하는건 객체를 사용하는쪽의 몫 
    }
}