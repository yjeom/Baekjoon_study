import java.util.Scanner;

public class N2596 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        String alphabetValue[]={"000000","001111","010011","011100"
        ,"100110","101001","110101","111010"};
        char alphabet[]={'A','B','C','D','E','F','G','H'
        };
        int n=Integer.parseInt(scanner.nextLine());
        String input=scanner.nextLine();
        String subInput[]=new String[n];
        int subInputIndex=0;
        for(int i=0;i<(n*6);i+=6){
            subInput[subInputIndex]=input.substring(i,i+6);
            subInputIndex++;
        }
        String result="";
        boolean flag=false;
        for(int i=0;i<n;i++){
            char inputToChar[]=subInput[i].toCharArray();
            for(int j=0;j<alphabetValue.length;j++){
                int count=0;
                char alphabetToChar[]=alphabetValue[j].toCharArray();
                for(int k=0;k<6;k++){
                    if(inputToChar[k]!=alphabetToChar[k])count++;
                }
                if(count<=1) {
                    result += alphabet[j];
                    break;
                }
                else{
                    if(j==alphabetValue.length-1) flag=true;
                }
            }
            if(flag){
                result=(i+1)+"";
                break;
            }
        }
        System.out.println(result);
    }
}
