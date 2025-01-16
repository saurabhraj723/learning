package com.transaction.flightbookingapp.utils;

import com.transaction.flightbookingapp.exceptions.InsufficientAmountException;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {
    private static Map<String,Double>paymentMap=new HashMap<>();
   static  {
        paymentMap.put("acc1",120000.0);
        paymentMap.put("acc2",5000.0);
        paymentMap.put("acc3",1000.0);
        paymentMap.put("acc4",8000.0);

    }
    public static boolean validCredentials(String accNo,double paidAmount){
        if(paidAmount>paymentMap.get(accNo)){
            throw new InsufficientAmountException("Insufficient amount. Paise daal");
        }
        else{
            return true;
        }
    }
}
