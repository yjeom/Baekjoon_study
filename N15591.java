import java.util.*;

public class N15591 {

    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int N= scanner.nextInt();
        int Q= scanner.nextInt();
        ArrayList<int[]>[] usado=new ArrayList[N+1];
        for(int i=1;i<=N;i++){
            usado[i]=new ArrayList<>();
        }
        for(int i=1;i<=(N-1);i++){
            int p= scanner.nextInt();
            int q= scanner.nextInt();
            int r= scanner.nextInt();
           usado[p].add(new int []{q,r});
           usado[q].add(new int []{p,r});
        }
        for(int i=1;i<=Q;i++){
            int count=0;
            boolean visited[]=new boolean[N+1];

            int K=scanner.nextInt();
            int V=scanner.nextInt();

            Queue<Integer> queue=new LinkedList<>();
            visited[V]=true;
            queue.add(V);

            while (!queue.isEmpty()){
                int n= queue.poll();
                for(int[]arr: usado[n]){
                    int to=arr[0];
                    int usa=arr[1];
                    if(!visited[to] && usa>=K){
                        count++;
                        visited[to]=true;
                        queue.add(to);
                    }
                }
            }
            System.out.println(count);
        }

    }

}
