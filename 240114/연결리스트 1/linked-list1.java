import java.util.* ; 

class Node{
    String data ; 
    Node prev, next ; 

    Node(String data){
        this.data = data ; 
        this.prev = this.next = null ; 
    }
}

public class Main {
    public static int n ; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        String S_init = sc.next() ; 
        Node cur = new Node(S_init) ; 

        n = sc.nextInt() ; 
        for(int i = 0 ; i < n ; i++){
            String command = sc.next() ; 

            if(command.contains("1")){
                String S_value = sc.next() ; 
                Node singleTon = new Node(S_value) ; 
                
                singleTon.next = cur ; 
                singleTon.prev = cur.prev ; 
                cur.prev = singleTon ; 


            }else if(command.contains("2")){
                String S_value = sc.next() ; 
                Node singleTon = new Node(S_value) ; 

                singleTon.prev = cur ; 
                singleTon.next = cur.next ; 
                cur.next = singleTon ; 

            }else if(command.contains("3")){ // 앞 노드랑 바꾸기
                if(!(cur.prev == null)){
                    cur.next = cur.prev ; 
                    cur.prev = cur.prev.prev ; 
                    cur.next.prev = cur ; 
                    cur.next.next = cur.next ;     
                }
            }else if(command.contains("4")){ // 뒤 노드랑 바꾸기 
                if(!(cur.next == null)){
                    cur.prev = cur.next ;  // B : cur.next  --> cur.prev 
                    cur.next = cur.next.next; // A ' next = 기존 B'next 
                    cur.prev.next = cur ;  // B' next = A 
                    cur.prev.prev = cur.prev ;  // B'pre = A'prev 
                }
            }
            String prev_data = (cur.prev == null)? "(Null)" : cur.prev.data ; 
            String next_data = (cur.next == null)? "(Null)" : cur.next.data ; 
            System.out.println(prev_data +" "+  cur.data + " "+ next_data) ;   
        } 
    }
}