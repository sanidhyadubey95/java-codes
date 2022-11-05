package MyCodes;

// You have even lenght array, swap first half array with second half array and print result.
import java.util.*;

class myarray {
    double result[]=new double[8];
    void hii(double newarr[]){
        double temp[]=Arrays.copyOf(newarr,4);

        for(int i=4;i<8;i++){
        result[i-4]=newarr[i];
        result[i]=temp[i-4];
        }

        for(double e:result){
        System.out.println(e);
    }
        System.out.println("thank you");
}
}


public class arr {

    public static void main(String[] args) {
        double[] arr=new double[8];
        Scanner sc=new Scanner(System.in);
        myarray r=new myarray();
        System.out.println("start");
        for(int i=0;i<8;i++){
        arr[i]=sc.nextDouble();
    }
        r.hii(arr);
        
    }
}