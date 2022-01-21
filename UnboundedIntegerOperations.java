import java.util.*;
public class UnboundedIntegerOperations{

    public static UnboundedInteger add(UnboundedInteger num1, UnboundedInteger num2)throws EmptyCollectionException
    { 
        int sign1 = num1.dequeue();
        int sign2 = num2.dequeue();

        if (greaterValue(num1,num2) == false){
            UnboundedInteger temp = new UnboundedInteger(num1.getSize());
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        UnboundedInteger product = new UnboundedInteger(num1.getSize()+2); //2 for inc, -1 for dec, 1 unit & sign
        if(sign1 == 1 && sign2 == 1){
            product.enqueue(1);
            product = add(num1,num2,num1.getSize(),product);
            return product;
        }
        else if(sign1 == 1 && sign2 == -1){
            product.enqueue(1);
            product = subtract(num1,num2,num1.getSize(),product);
            return product;
        }
        else if(sign1 == -1 && sign2 == 1){
            product.enqueue(-1);
            product = subtract(num1,num2,num1.getSize(),product);
            return product;
        }
        else{
            product.enqueue(-1);
            product = add(num1,num2,num1.getSize(),product);
            return product;
        }
    }
    private static int data1 = 0;
    private static int data2 = 0;

    private static boolean greaterValue(UnboundedInteger num1, UnboundedInteger num2) throws EmptyCollectionException{
        
        if(num1.getSize() > num2.getSize())
            return true;
        if(num1.getSize() < num2.getSize())
            return false;

        String x = "";
        String y = "";
        String res = "";
            
        while (num1.isEmpty() == false){
            x = String.valueOf(num1.dequeue()) + x;
            y = String.valueOf(num2.dequeue()) + y;
        }

        num1.assignValue(x);
        num2.assignValue(y);
        num1.dequeue();
        num2.dequeue();

        for(int i = 0; i < num1.getSize(); i++){
            data1 = x.charAt(i);
            data2 = y.charAt(i);
            if(data1 < data2)
                return false;
            else if(data1 > data2)
                return true;
        }
        return true;   
    }

    private static int carry = 0;
    private static UnboundedInteger add(UnboundedInteger num1, UnboundedInteger num2, int count, UnboundedInteger product) throws EmptyCollectionException{

        if(count == 0){
            if(carry == 1){
                product.enqueue(carry);
                carry = 0;
            }
            return product;
        }

        if(num2.isEmpty() == true && num1.getSize() > num2.getSize()){
            data2 = 0;
            data1 = num1.dequeue();
        }
        else{
            data1 = num1.dequeue();
            data2 = num2.dequeue();
        }

        if((data1 + data2 + carry) >= 10){
            product.enqueue((data1 + data2 + carry) - 10);
            carry = 1;
            add(num1, num2, count-1,product);
        }
        else{
            product.enqueue(data1 + data2 + carry);
            carry = 0;
            add(num1,num2,count-1,product);
        }
        return product;
        
    }

    private static UnboundedInteger subtract(UnboundedInteger num1, UnboundedInteger num2, int count, UnboundedInteger product) throws EmptyCollectionException{

        if(count == 0){
            return product;
        }

        if(num2.isEmpty() == true && num1.getSize() > num2.getSize()){
            data2 = 0;
            data1 = num1.dequeue();
        }
        else{
            data1 = num1.dequeue();
            data2 = num2.dequeue();
        }

        if(((data1 - data2) - carry) < 0){
            product.enqueue((data1 + 10 -  data2 - carry));
            carry = 1;
            subtract(num1, num2, count-1,product);
        }
        else if(  (((data1 - data2) - carry) == 0) && (num2.getSize() == 0) ){
            carry = 0;
            subtract(num1,num2,count-1,product);
        }
        else{
            product.enqueue((data1 -data2) - carry);
            carry = 0;
            subtract(num1,num2,count-1,product);
        }
        return product;
    }

}