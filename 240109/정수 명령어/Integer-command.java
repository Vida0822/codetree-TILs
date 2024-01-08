import java.util.* ; 

public class Main {
    
    public static int t, n ; 

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ; 
        t = sc.nextInt(); 

        

        while(t-- > 0){
            n = sc.nextInt() ; 
            TreeSet<Integer> s = new TreeSet<>() ; 

            while(n-- > 0){
                String command = sc.next() ; 
                int operand = sc.nextInt() ; 

                if(command.equals("I")){
                    s.add(operand) ; 
                }else{
                    if(s.isEmpty()) continue ; 

                    if(operand == 1){
                        s.remove(s.last()) ; 
                    }else{
                        s.remove(s.first()) ; 
                    }
                }
            }    
            if(s.size()==0)
                System.out.println("EMPTY") ; 
            else 
                System.out.println(s.last() + " " + s.first() ) ;         
        }
        
        
    }
}