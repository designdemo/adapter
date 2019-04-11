package com.adapter.simple;

/**
 * author:曲终、人散
 * Date:2019/4/11 22:56
 */
public class AdapterTest {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter(new AC220());
        dc5.outputDC5V();
    }
}
