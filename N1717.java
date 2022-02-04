import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1717 {
    public static int parent[];

    public static int find_parent(int parent[],int x){
        if(parent[x] != x){
            parent[x]=find_parent(parent,parent[x]);
        }
        return parent[x];
    }
    public static void union_parent(int parent[],int a,int b){
        a=find_parent(parent,a);
        b=find_parent(parent,b);

        if(a>b){
            parent[a]=b;
        }else{
            parent[b]=a;
        }
    }
    public static void main(String[]args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        parent=new int[n+1];
        for(int i=1;i<=n;i++){
            parent[i]=i;
        }
        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine());
            int type=Integer.parseInt(st.nextToken());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());

            if(type==0){
                union_parent(parent,a,b);
            }else{
                int aParent=find_parent(parent,a);
                int bParent=find_parent(parent,b);
                if(aParent==bParent){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
}
