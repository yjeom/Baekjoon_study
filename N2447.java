import java.io.*;

public class N2447 {
    static char arr[][];
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());
        arr=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=' ';
            }
        }
        star(0,0,n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                    bw.write(arr[i][j]);
            }
           bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
    public static void star(int x,int y,int num){
      if(num==1){
          arr[x][y]='*';
          return;
      }
      int div=num/3;
      for(int i=0;i<3;i++){
          for(int j=0;j<3;j++){
              if(!(i==1&&j==1)) star((i*div)+x,(j*div)+y,div);
          }
      }
    }
}
