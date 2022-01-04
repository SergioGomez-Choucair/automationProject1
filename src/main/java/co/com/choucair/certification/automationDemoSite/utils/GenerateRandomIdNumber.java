package co.com.choucair.certification.automationDemoSite.utils;

import java.util.Random;

public class GenerateRandomIdNumber {
    Random r = new Random();
    Integer idNumber;

    public Integer getRandomId(){
        idNumber = r.nextInt(1000000000)+10000000;
        return idNumber;
    }

}
