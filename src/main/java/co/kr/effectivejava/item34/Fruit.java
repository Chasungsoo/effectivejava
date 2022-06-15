package co.kr.effectivejava.item34;

import static co.kr.effectivejava.item34.AppleEnum.FUJI;

public class Fruit {
    
    public static final int APPLE_FUJI = 0;
    public static final int APPLE_PIPPIN = 0;
    public static final int APPLE_SMITH = 0;
    
    public static final int ORANGE_NAVEL = 0;
    public static final int ORANGE_TEMPLE = 1;
    public static final int ORANGE_BLOOD = 2;
    
    public void useIntger() {
        callAppleInfo(APPLE_FUJI);
        callAppleInfo(ORANGE_BLOOD);
    }

    public void useEnum() {
        callAppleEnumInfo(FUJI);
//        callAppleEnumInfo(ORANGE_BLOOD);
    }

    private int callAppleInfo(int appleValue) {
        return appleValue;
    }



    private int callAppleEnumInfo(AppleEnum appleEnum) {
        return appleEnum.getNumber();

    }

}
