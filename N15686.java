import java.util.ArrayList;
import java.util.Scanner;

public class N15686 {
    static class Node{
        int r,c;
        public Node(int r,int c){
            this.r=r;
            this.c=c;
        }

        public int getR() {
            return r;
        }

        public int getC() {
            return c;
        }
    }
    static int N,M;
    static int map[][];
    static ArrayList<Node> houses=new ArrayList<>();
    static ArrayList<Node> chickens=new ArrayList<>();
    static boolean visited[];
    static int result=Integer.MAX_VALUE;
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        N= scanner.nextInt();
        M= scanner.nextInt();
        map=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                int v=scanner.nextInt();
                map[i][j]= v;
                if(v==1){
                    houses.add(new Node(i,j));
                }else if(v==2){
                    chickens.add(new Node(i,j));
                }
            }
        }
        visited=new boolean[chickens.size()];
        dfs(0,0);
        System.out.println(result);
    }
    public static void dfs(int n,int count){
        if(count == M){
            searchMinDistance();
            return;
        }
        for(int i=n;i<chickens.size();i++){
            if (!visited[i]){
                visited[i]=true;
                dfs(i,count+1);
                visited[i]=false;
            }
        }
    }
    public static void searchMinDistance(){
        Node chArr[]=new Node[M];
        int chIndex=0;
        for(int i=0;i< visited.length;i++){
            if(visited[i]){
                chArr[chIndex]= chickens.get(i);
                chIndex++;
            }
        }
        int total=0;
        for(int i=0;i<houses.size();i++){
            int min=Integer.MAX_VALUE;
            Node house= houses.get(i);
            int hr=house.getR();
            int hc=house.getC();
            for(int j=0;j<chArr.length;j++){
                Node ch=chArr[j];
                int cr=ch.getR();
                int cc=ch.getC();
                min=Math.min(min,(Math.abs(hr-cr)+Math.abs(hc-cc)));
            }
            total+=min;
        }
        result=Math.min(result,total);
    }
}
