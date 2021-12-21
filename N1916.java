import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Bus implements Comparable<Bus>{
    int cityB, cost;
    public Bus(int cityB,int cost){
        this.cityB=cityB;
        this.cost=cost;
    }

    @Override
    public int compareTo(Bus o) {
        return cost-o.cost;
    }
}
public class N1916 {
    public static int N;
    public static ArrayList<Bus>[] list;
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N=Integer.parseInt(br.readLine());
        int M=Integer.parseInt(br.readLine());
        list=new ArrayList[N+1];
        for(int i=1;i<=N;i++){
            list[i]=new ArrayList<>();
        }
        for(int i=0;i<M;i++){
            st=new StringTokenizer(br.readLine());
            int cityA=Integer.parseInt(st.nextToken());
            int cityB=Integer.parseInt(st.nextToken());
            int cost=Integer.parseInt(st.nextToken());
            list[cityA].add(new Bus(cityB,cost));
        }
        st=new StringTokenizer(br.readLine());
        int startCity=Integer.parseInt(st.nextToken());
        int endCity=Integer.parseInt(st.nextToken());
        dijkstra(startCity,endCity);

        br.close();
    }
    public static void dijkstra(int startCity,int endCity){
        PriorityQueue<Bus> que=new PriorityQueue<>();
        boolean visited[]=new boolean[N+1];
        int costs[]=new int[N+1];

        for(int i=1;i<=N;i++){
            costs[i]=Integer.MAX_VALUE;
        }

        que.add(new Bus(startCity,0));
        costs[startCity]=0;

        while(!que.isEmpty()){
            Bus cur=que.poll();
            if(!visited[cur.cityB]){
                visited[cur.cityB]=true;
                for(Bus bus:list[cur.cityB]){
                    if(!visited[bus.cityB]&&costs[cur.cityB]+ bus.cost<costs[bus.cityB]){
                        costs[bus.cityB]=costs[cur.cityB]+ bus.cost;
                        que.add(new Bus(bus.cityB, costs[bus.cityB]));
                    }
                }
            }
        }
        System.out.println(costs[endCity]);

    }
}
