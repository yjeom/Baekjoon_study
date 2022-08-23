import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class N1620 {
    public static void main(String[]args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        HashMap<Integer,String> number=new HashMap<>();
        HashMap<String, Integer> name=new HashMap<>();
        for(int i=0;i<N;i++){
            String input= br.readLine();
            number.put(i+1,input);
            name.put(input,i+1);
        }
        for(int i=0;i<M;i++){
            String quiz= br.readLine();
            if(quiz.chars().allMatch(Character::isDigit)){
                bw.write(number.get(Integer.parseInt(quiz))+"\n");
            }else{
                bw.write(name.get(quiz)+"\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
