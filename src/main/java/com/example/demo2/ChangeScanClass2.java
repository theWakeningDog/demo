package com.example.demo2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

/**
 * 与demo中的ChangeScanClass1对应
 * Created by ZhangWei on 2018/4/21 0021 20:56.
 */
@Configuration
public class ChangeScanClass2 implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>demo2下的类ChangeScanClass2扫描到了<<<<<<<<<<<<<<<<");
    }
}
