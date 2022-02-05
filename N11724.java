import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N11724 {
    public static int parent[];
    public static int findParent(int parent[],int x){
        if(parent[x] != x){
            parent[x]=findParent(parent,parent[x]);
        }
        return parent[x];
    }
    public static void unionParent(int x,int y){
        int a=findParent(parent,x);
        int b=findParent(parent,y);

        if(a>b)
            parent[a]=b;
        else
            parent[b]=a;
    }
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());

        parent=new int[n+1];
        for(int i=1;i<=n;i++){
            parent[i]=i;
        }
        for(int i=1;i<=m;i++){
            st=new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            unionParent(x,y);
        }
        boolean isParent[]=new boolean[n+1];
        int count=0;
        for(int i=1;i<=n;i++){
            int x=findParent(parent,i);
            if(!isParent[x]){
                isParent[x]=true;
                count++;
            }
        }
        System.out.println(count);
    }
}
