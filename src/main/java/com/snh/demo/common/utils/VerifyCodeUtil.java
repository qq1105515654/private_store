package com.snh.demo.common.utils;

import java.util.Random;

public class VerifyCodeUtil {

    private static final String VERIFY_CODE="19qz28ws3ax4edc56vfr7tgbyhnujmikolp";

    private static Random random=new Random();

    /**
     *  使用系统默认字符源生成验证码
     *
     * @param verifySize 生成的验证码长度
     * @return
     */
    public static String generateVerifyCode(int verifySize){

        return generateVerifyCode(verifySize,VERIFY_CODE);
    }

    /**
     *  使用指定源生成验证码
     * @param verifySize  验证码长度
     * @param source    字符源
     * @return
     */
    public static String generateVerifyCode(int verifySize,String source){

        if(source==null || source.length()==0){
            source=VERIFY_CODE;
        }

        int codeLength=source.length();

        Random rand=new Random(System.currentTimeMillis());

        StringBuffer sb=new StringBuffer(verifySize);

        for(int i=0; i<verifySize; i++){
            sb.append(source.charAt(rand.nextInt(codeLength-1)));
        }
        return sb.toString();
    }



}
