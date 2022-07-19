import java.util.Scanner;

public class N14889 {
    static int N;
    static int map[][];
    static boolean visited[];
    static int min=Integer.MAX_VALUE;
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        N=scanner.nextInt();
        map=new int[N][N];
        visited=new boolean[N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                map[i][j]= scanner.nextInt();
            }
        }
        dfs(0,0);
        System.out.println(min);

    }

    public static void dfs(int n,int count){
        if(count == (N/2)){
            searchMin();
            return;
        }
        for(int i=n;i<N;i++){
            if (!visited[i]){
                visited[i]=true;
                dfs(i,count+1);
                visited[i]=false;
            }
        }
    }
    public static void searchMin(){
        int start[]=new int[N/2];
        int link[]=new int[N/2];

        int startIndex=0;
        int linkIndex=0;

        int startValue=0;
        int linkValue=0;

        for(int i=0;i<N;i++){
            if(visited[i]){
                start[startIndex]=i;
                startIndex++;
            }else{
                link[linkIndex]=i;
                linkIndex++;
            }
        }

        for(int i=0;i<(N/2);i++){
            for(int j=i+1;j<(N/2);j++){
                startValue+=map[start[i]][start[j]]+map[start[j]][start[i]];
            }
        }
        for(int i=0;i<(N/2);i++){
            for(int j=i+1;j<(N/2);j++){
                linkValue+=map[link[i]][link[j]]+map[link[j]][link[i]];
            }
        }
        min=Math.min(min,Math.abs(startValue-linkValue));
    }
}
