public class Main {
    public static void main(String[] args) {

        System.out.println("Hello Teranet-TRV!"); //First Line of our Program
        //Single-Line Comment
        /*
        This is block
        comment
         */
        int val1=12;
        int val2=10;
        int val3=30;
        int result1=val2+val3/val1;//Division occurs first
        int result2 = (val2+val3)/val1;//Bracket operation occurs first
        System.out.println("Result-1:"+result1+"\n Result-2:"+result2);
        long byteVal=9;
        short result = (short)byteVal;
        System.out.println(result);
        var myLatestValue = 122.00;
        if(val1>val2 && val1>val3){
            System.out.println("Value 1 is greatest");
        } else if (val2>val3 && val2>val1) {
            System.out.println("Value 2 is greatest");

        } else  {
            System.out.println("Value 3 is greatest");
        }
    }
}