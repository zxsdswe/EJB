package com.byxx.gtz.test;

import com.byxx.gtz.DTO.CrhJxTest1DTO;
import com.byxx.gtz.KdTestDelegate;

import java.util.UUID;

public class Test {
    public static void main(String[] agrs){
        KdTestDelegate.url="t3://10.166.81.154:9001";
        CrhJxTest1DTO dto = new CrhJxTest1DTO();
        dto.setId(UUID.randomUUID().toString());
        dto.setUserName("≤‚ ‘");
        try {
            KdTestDelegate.getInstance().getTextRemote().insertCrhJxTest(dto);
            System.out.println("≥…π¶");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(" ß∞‹");

        }
    }
}
