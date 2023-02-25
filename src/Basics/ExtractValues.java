package Basics;
import java.util.*;
public class ExtractValues {
    public static void main(String[] args) {

        String message = "Digital Purchases: Trasf Rs 5,145.00 0 (Pre:5,145.00, Post:0.00) to 09950902326 on 17-12-2022 at 09:54AM. Trans ID 152582849. Retailer has paid Rs:5,000.00 Bal:235,680.16 (Pre Rs:235,680.16,Post Rs:0.00):Ret/Fos Balance is 6,624.36";
        String purchaseType = message.split(":")[0];
        System.out.print(purchaseType);
        Double TransRs = PickNextValue("Trasf Rs", String.valueOf(message.split("Trasf Rs")[1]));
        System.out.print(TransRs);
    }

    static Double PickNextValue(String type, String msg){
        String value = "0";
        int i=1;
        while(msg.charAt(i) != ' ') {
            if(msg.charAt(i) != ','){
                value = value + msg.charAt(i);
            }
            i++;
        }

        return Double.valueOf(value);
    }
}