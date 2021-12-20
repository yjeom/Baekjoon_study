import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node implements Comparable<Node>{
    private int w;
    private int index;

    public  Node(int w, int index){
        this.w=w;
        this.index=index;
    }

    public int getIndex() {
        return index;
    }

    public int getW() {
        return w;
    }

    @Override
    public int compareTo(Node o) {
        return Integer.compare(this.w,o.w);
    }
}
public class N1753 {
    private static List<Node>[]list;
    private static int V;
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        V=Integer.parseInt(st.nextToken());
        int E=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(br.readLine());
        list=new List[V+1];

        for(int i=1;i<=V;i++){
            list[i]=new ArrayList<>();
        }
        for(int i=0;i<E;i++){
            st=new StringTokenizer(br.readLine());
            int start=Integer.parseInt(st.nextToken());
            int end=Integer.parseInt(st.nextToken());
            int w=Integer.parseInt(st.nextToken());
            list[start].add(new Node(w,end));

        }
        dijkstra(K);
    }
    public static void dijkstra(int k){
        PriorityQueue<Node> que=new PriorityQueue<>();
        int dis[]=new int[V+1];

        for(int i=0;i<=V;i++){
            dis[i]=Integer.MAX_VALUE;
        }
        que.add(new Node(0,k));
        dis[k]=0;

        while(!que.isEmpty()){
            Node curNode=que.poll();
            int curNode_index=curNode.getIndex();
            for(Node node:list[curNode_index]){
               if(dis[curNode_index]+node.getW()<dis[node.getIndex()]){
                   dis[node.getIndex()]=dis[curNode_index]+node.getW();
                   que.add(new Node(dis[node.getIndex()],node.getIndex()));
               }
            }
        }
        for(int i=1;i<=V;i++){
            if(dis[i]==Integer.MAX_VALUE){
                System.out.println("INF");
            }else{
                System.out.println(dis[i]);
            }
        }
    }
}

