package com.guru.javapractice;

import java.util.HashMap;

import org.json.JSONObject;

import com.baidu.aip.ocr.AipOcr;

public class Demo {
	//����APPID/AK/SK
    public static final String APP_ID = "14219223";
    public static final String API_KEY = "CR0GaPBftBW1kPGdUHh6HmGS";
    public static final String SECRET_KEY = "aPtIM5ThoSEmdNcBLshHOSwzUabm7t5L";

    public static void main(String[] args) {
        // ��ʼ��һ��AipOcr
        AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);

        // ��ѡ�������������Ӳ���
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // ��ѡ�����ô����������ַ, http��socket��ѡһ�����߾�������
        //client.setHttpProxy("proxy_host", proxy_port);  // ����http����
        //client.setSocketProxy("proxy_host", proxy_port);  // ����socket����

        // ��ѡ������log4j��־�����ʽ���������ã���ʹ��Ĭ������
        // Ҳ����ֱ��ͨ��jvm�����������ô˻�������
        System.setProperty("aip.log4j.conf", "config/log4j.properties");

        // ���ýӿ�
        String path = "C:/abc.jpg";
        JSONObject res = client.basicGeneral(path, new HashMap<String, String>());
        System.out.println(res.toString(2));

    }
}
