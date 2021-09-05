import java.util.*;

public class N1260 {
    public static void DFS(LinkedList<Integer>[] list,int index,boolean[]visited){
        visited[index]=true;
        System.out.print(index+" ");
        for(int i=0;i<list[index].size();i++){
            if(!visited[list[index].get(i)]){
                DFS(list,list[index].get(i),visited);
            }

        }
    }
    public static void BFS(LinkedList<Integer>[] list,int index,boolean[]visited){
        Queue<Integer> queue=new LinkedList<>();
        visited[index]=true;
        queue.add(index);

        while(queue.size() !=0){
            index= queue.poll();
            System.out.print(index+" ");
            Iterator<Integer> iter = list[index].listIterator();
            while(iter.hasNext()) {
                int i = iter.next();
                if(!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        StringTokenizer st=new StringTokenizer(scan.nextLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int V=Integer.parseInt(st.nextToken());
        LinkedList<Integer>[] list_DFS =new LinkedList[N+1];
        LinkedList<Integer>[] list_BFS =new LinkedList[N+1];
        boolean [] visited=new boolean[N+1];
        for (int i = 0; i <= N; i++) {
            list_DFS[i] = new LinkedList<Integer>();
        }
        for(int i=0;i<M;i++){
            st=new StringTokenizer(scan.nextLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            list_DFS[a].add(b);
            list_DFS[b].add(a);
        }
        for (int i = 0; i <= N; i++) {
            Collections.sort(list_DFS[i]);
        }
        list_BFS=list_DFS;
        DFS(list_DFS,V,visited);
        System.out.println();
        visited=new boolean[N+1];
        BFS(list_BFS,V,visited);
    }
}
