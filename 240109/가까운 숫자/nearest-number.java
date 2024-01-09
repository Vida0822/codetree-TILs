import java.util.* ; 

public class Main {
    public static int n ; 
    public static final int MAX_VALUE = Integer.MAX_VALUE ; 
    public static final int MIN_VALUE = Integer.MIN_VALUE ; 

    public static void main(String[] args) {
        // 범위 검색에 가장 유리한 자료구조 : TreeSet --> TreeMap 보다 편리한 메서드들을 많이 제공한다
        // Entry 형태로 값을 저장해야할 경우가 아니라면 TreeSet을 활용하자 

        /* 
        higher, lower --> 큰 값/ 작은 값 
        ceiling , floor --> 크거나 같은값/ 작거나 같은 값
        */
        Scanner sc = new Scanner(System.in) ; 
        n = sc.nextInt() ; 

        TreeSet<Integer> s = new TreeSet<>() ; 
        s.add(0) ;

        int min = 0; 
        while(n-- >0){
            int x =  sc.nextInt() ; 
            s.add(x) ; 

            if(s.size() <= 2){
                min = x ; 
            }else{
                int h = (s.higher(x) == null)? MAX_VALUE :s.higher(x)  ; 
                int l = (s.lower(x) == null)? MIN_VALUE : s.lower(x) ; 
                min = Math.min( min, Math.min(h - x , x - l) ) ; 
            }
            System.out.println(min) ; 
        }
    }
}