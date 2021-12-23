import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class N2668 {
    public static int arr[];
    public static boolean visited[];
    public static ArrayList<Integer> results;
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        arr=new int[N+1];
        visited=new boolean[N+1];
        results=new ArrayList<>();
        for(int i=1;i<=N;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        for(int i=1;i<=N;i++){
            visited[i]=true;
            dfs(i,i);
            visited[i]=false;
        }
        Collections.sort(results);
        System.out.println(results.size());
        for(int i:results){
            System.out.println(i);
        }
    }
    public static void dfs(int index,int end){
        if(arr[index]==end)
            results.add(index);
        if(!visited[arr[index]]){
            visited[arr[index]]=true;
            dfs(arr[index],end);
            visited[arr[index]]=false;

        }
    }
}
