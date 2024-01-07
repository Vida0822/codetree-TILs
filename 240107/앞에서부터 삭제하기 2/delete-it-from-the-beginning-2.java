import java.util.* ; 
public class Main {
    public static final int MAX_N = 100000 ; 
    public static int n ; 
    public static int[] arr = new int[MAX_N] ; 
    public static int sumVal ; 
    public static double maxAvg ; 
    public static PriorityQueue<Integer> pq = new PriorityQueue<>() ; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        n = sc.nextInt() ;
        
        /*
        마인드 : 
        (k개 제거 후 남는 숫자 그룹을 뒤에서부터 하나씩 추가해가면서, 
        그 추가한 값을 pq에 담고 (자동 정렬되어 최솟값 도출)
        그 최솟값을 도출해 제거한후 계산한 평균값이 
        현재까지 중 최대 평균값이면 갱신 
        ) x 숫자를 1개 제거하는 경우까지 반복 
        */
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt(); 
        }
        pq.add(arr[n-1]);
        sumVal += arr[n-1] ; // 남는 숫자가 마지막 하나일때 

        for(int i = n-2 ; i >= 1 ; i-- ){
            // 뒤에서부터 남는 숫자 그룹에 하나씩 추가 --> 최솟값 갱신 
            sumVal += arr[i] ; 
            pq.add(arr[i]) ; 

            // 그 추가한 값 반영해서 최솟값 평균 도출 후 갱신 
            double avg = (double)(sumVal - pq.peek()) /(n-i-1) ; 

            if(maxAvg < avg){
                maxAvg = avg ; 
            }
        }
        System.out.printf("%.2f", maxAvg) ; 
    }
}