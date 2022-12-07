public class Sumoffirstten{
    public static void main(String[] args){
        int n,i=1,sum=0;
        Scanner input=new scanner(System.in);
        System.out.print("Enter number: ");
        n=input.nextint();
        do{
            sum=sum+i;
            i+=1;
            while(i<=n);
            System.out.print("Sum of First"+n+"numbers="+sum);
        }
    }
}