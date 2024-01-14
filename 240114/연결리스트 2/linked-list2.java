import java.util.* ; 

public class Main {
static class Node{
    int id ; 
    Node prev, next ; 

    public Node(int id) {
        this.id = id ; 
        this.prev= null ;
        this.next = null ;  
    }
}


// u 앞에 singleton을 삽입 
public static void insertPrev(Node u, Node singleton ){
    singleton.prev = u.prev ; 
    singleton.next = u ; 

    if(null != singleton.prev)
        singleton.prev.next = singleton ; 
    if(null != singleton.next)
        singleton.next.prev = singleton ; 
}

public static void insertNext(Node u , Node singleton){
    singleton.prev = u ; 
    singleton.next = u.next ; 

    if(null != singleton.prev)
        singleton.prev.next = singleton ; 
    if(null != singleton.next)
        singleton.next.prev = singleton ; 
}

public static void pop(Node u){
    if(u.prev != null)
        u.prev.next = u.next ; 
    if(u.next != null)
        u.next.prev = u.prev ; 
}


    public static final int MAX_N = 100005 ; 
    public static Node[] nodes = new Node[MAX_N] ; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; 
        int q = sc.nextInt() ; 

        for(int i = 1 ; i<= n ; i++){
            nodes[i] = new Node(i) ; 
        }

        for(int t = 0 ; t < q ; t++){
            int type = sc.nextInt() ; 
            int i = sc.nextInt() ;

            if( 1 == type){
                pop(nodes[i]) ; 
                // 원래같으면 그냥 찾으려면 prev, next 타고가면서 하나씩 맞는지 찾는 선형탐색 해야하는데, 
                // 배열 인덱스에 맞춰 저장해놓으면 어떤 노드인지 바로 임의접근 가능  
            }else if( 2 == type){
                int j = sc.nextInt() ; 
                insertPrev(nodes[i], nodes[j]) ; 
            }else if(3 == type){
                int j = sc.nextInt() ; 
                insertNext(nodes[i] , nodes[j])  ; 
            }else if(4==type){
                System.out.print((nodes[i].prev == null ? 0: nodes[i].prev.id) +" ") ;
                System.out.println(nodes[i].next == null ? 0: nodes[i].next.id)  ;   
            }
        }

        for(int i = 1 ; i<= n ; i++)
            System.out.print((nodes[i].next == null? 0:nodes[i].next.id) +" "); 
    }
}