class Main{
    public static void main(String[] args){
        int[] numbers = {2,-9,0,5,12,-25,22,9,8,12};
        int sum = 0;
        Double average;
        for(int i=0;i<numbers.length;i++){
            sum=sum+numbers[i];
        }
        int arrayLength = numbers.length;
        average = ((double)sum/(double)arrayLength);
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+average);
    }
}