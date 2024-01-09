import java.util.* ; 
public class Main {
    public static int n , m  ; 

    public static void main(String[] args) {
        // 최댓값을 계속 구해주는 동시에 원하는 숫자도 같이 빠르게 제거 지원
        // 우선순위 큐 : 가장 높은 우선순위 값만 삭제, 변경, 조회할 수 있기 때문에 ... 정렬되어있지만 데이터 접근은 어디서나 가능한 TreeSet 이용하는게 유리 
        Scanner sc = new Scanner(System.in) ; 
        n = sc.nextInt() ; 
        m = sc.nextInt() ; 

        TreeSet<Integer> s = new TreeSet<>() ; 

        for(int i = 1 ; i <= m ; i++){
            s.add(i) ; 
        }
        while(n--> 0){
            int x = sc.nextInt() ; 

            if(s.contains(x)){ // TreeSet에는 get이 없음 (존재 유무만 반환) --> 범위 검색에선 요소 반환
                s.remove(x) ; 
            }
            System.out.println(s.last()) ; 
        }
    }
}