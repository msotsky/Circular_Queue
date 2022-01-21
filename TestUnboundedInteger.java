import java.util.*;
public class TestUnboundedInteger {
	
	public static void main(String[] args) {
        System.out.println("999 + 1 = 1000");
        String num1 = "999";
        UnboundedInteger caQueue1 = new UnboundedInteger(num1.length()+1);
        caQueue1.assignValue(num1);

        String num2 = "1";
        UnboundedInteger caQueue2 = new UnboundedInteger(num2.length()+1); 
        caQueue2.assignValue(num2);

        UnboundedInteger product = new UnboundedInteger(0);
        try{
            product = UnboundedIntegerOperations.add(caQueue1,caQueue2);
            System.out.println(product);
        }catch(EmptyCollectionException e){
            e.printStackTrace();
        }
//-----------------------------------------------------------------------------------------
        System.out.println("1000 + 2000 = 3000");
        String num3 = "1000";
        UnboundedInteger caQueue3 = new UnboundedInteger(num3.length()+1);
        caQueue3.assignValue(num3);

        String num4 = "2000";
        UnboundedInteger caQueue4 = new UnboundedInteger(num4.length()+1); 
        caQueue4.assignValue(num4);

        UnboundedInteger product2 = new UnboundedInteger(0);
        try{
            product2 = UnboundedIntegerOperations.add(caQueue3,caQueue4);
            System.out.println(product2);
        }catch(EmptyCollectionException e){
            e.printStackTrace();
        }
//-----------------------------------------------------------------------------------
        System.out.println("1 + 1 = 2");
        String num5 = "1";
        UnboundedInteger caQueue5 = new UnboundedInteger(num5.length()+1);
        caQueue5.assignValue(num5);

        String num6 = "1";
        UnboundedInteger caQueue6 = new UnboundedInteger(num6.length()+1); 
        caQueue6.assignValue(num6);

        UnboundedInteger product3 = new UnboundedInteger(0);
        try{
            product3 = UnboundedIntegerOperations.add(caQueue5,caQueue6);
            System.out.println(product3);
        }catch(EmptyCollectionException e){
            e.printStackTrace();
        }

//----------------------------------------------------------------------------------
        System.out.println("50 + -25 = 25");
        String num7 = "50";
        UnboundedInteger caQueue7 = new UnboundedInteger(num7.length()+1);
        caQueue7.assignValue(num7);

        String num8 = "-25";
        UnboundedInteger caQueue8 = new UnboundedInteger(num8.length()); 
        caQueue8.assignValue(num8);

        UnboundedInteger product4 = new UnboundedInteger(0);
        try{
            product4 = UnboundedIntegerOperations.add(caQueue7,caQueue8);
            System.out.println(product4);
        }catch(EmptyCollectionException e){
            e.printStackTrace();
        }
    //----------------------------------------------------------------------------------
        System.out.println("-50 + 25 = -25");
        String num9 = "-50";
        UnboundedInteger caQueue9 = new UnboundedInteger(num9.length());
        caQueue9.assignValue(num9);

        String num10 = "25";
        UnboundedInteger caQueue10 = new UnboundedInteger(num10.length()+1); 
        caQueue10.assignValue(num10);

        UnboundedInteger product5 = new UnboundedInteger(0);
        try{
            product5 = UnboundedIntegerOperations.add(caQueue9,caQueue10);
            System.out.println(product5);
        }catch(EmptyCollectionException e){
            e.printStackTrace();
        }
        //----------------------------------------------------------------------------------
        System.out.println("-12 + 3 = -9");
        String num11 = "-12";
        UnboundedInteger caQueue11 = new UnboundedInteger(num11.length());
        caQueue11.assignValue(num11);

        String num12 = "3";
        UnboundedInteger caQueue12 = new UnboundedInteger(num12.length()+1); 
        caQueue12.assignValue(num12);

        UnboundedInteger product6 = new UnboundedInteger(0);
        try{
            product6 = UnboundedIntegerOperations.add(caQueue11,caQueue12);
            System.out.println(product6);
        }catch(EmptyCollectionException e){
            e.printStackTrace();
        }
                
        //----------------------------------------------------------------------------------
        System.out.println("-800 + -700 = -1500");
        String num13 = "-800";
        UnboundedInteger caQueue13 = new UnboundedInteger(num13.length()+1);
        caQueue13.assignValue(num13);

        String num14 = "-700";
        UnboundedInteger caQueue14 = new UnboundedInteger(num14.length()+1); 
        caQueue14.assignValue(num14);

        UnboundedInteger product7 = new UnboundedInteger(0);
        try{
            product7 = UnboundedIntegerOperations.add(caQueue13,caQueue14);
            System.out.println(product7);
        }catch(EmptyCollectionException e){
            e.printStackTrace();
        }
        //----------------------------------------------------------------------------------
        System.out.println("-1 + 1 = 0");
        String num15 = "1";
        UnboundedInteger caQueue15 = new UnboundedInteger(num15.length()+1);
        caQueue15.assignValue(num15);

        String num16 = "-1";
        UnboundedInteger caQueue16 = new UnboundedInteger(num16.length()+1); 
        caQueue16.assignValue(num16);

        UnboundedInteger product8 = new UnboundedInteger(0);
        try{
            product8 = UnboundedIntegerOperations.add(caQueue15,caQueue16);
            System.out.println(product8);
        }catch(EmptyCollectionException e){
            e.printStackTrace();
        }
        //----------------------------------------------------------------------------------
        System.out.println("534752 + -488 = 534264");
        String num17 = "534752";
        UnboundedInteger caQueue17 = new UnboundedInteger(num17.length()+1);
        caQueue17.assignValue(num17);

        String num18 = "-488";
        UnboundedInteger caQueue18 = new UnboundedInteger(num18.length()+1); 
        caQueue18.assignValue(num18);

        UnboundedInteger product9 = new UnboundedInteger(0);
        try{
            product9 = UnboundedIntegerOperations.add(caQueue17,caQueue18);
            System.out.println(product9);
        }catch(EmptyCollectionException e){
            e.printStackTrace();
        }
    }
}
