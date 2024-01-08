import java.util.* ; 

public class Main {

    public static int n , m ; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        n = sc.nextInt() ; 
        m = sc.nextInt() ; 

        HashMap<String , Integer> strToInt = new HashMap<>() ; 
        // 관련성 있는 어떤 값의 대응을 사전 형태로 저장할 때 사용하는 MAP + 해싱기법 --> HashMap
        HashMap<Integer , String> intToStr = new HashMap<>() ; 

        for(int i = 1 ; i <= n ; i++){
            String str = sc.next() ; 
            strToInt.put(str, i) ; 
            intToStr.put(i, str) ; 
        }

        for(int i = 0 ; i < m ; i++){
            String key = sc.next().trim() ; 
            try{
                System.out.println(intToStr.get( Integer.parseInt(key))) ; 
            }catch(Exception e){
                System.out.println(strToInt.get(key)) ; 
            }

        }
    }
}