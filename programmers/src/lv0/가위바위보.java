package lv0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 가위바위보 {
    public String solution(String rsp) {
        String[] rspAr = rsp.split("");

        for (int i= 0; i < rspAr.length; i++) {
            if (rspAr[i].equals("0")) rspAr[i] = "5";
            else if (rspAr[i].equals("2")) rspAr[i] = "0";
            else rspAr[i] = "2";
        }

        return Arrays.stream(rspAr).collect(Collectors.joining());
    }
}
