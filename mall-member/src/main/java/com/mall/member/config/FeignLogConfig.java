package com.mall.member.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author zjt
 * @date 2021-05-11
 */
@Configuration
public class FeignLogConfig {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    private static class CardInfo {
        private static ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(50, new ThreadPoolExecutor.DiscardOldestPolicy());
        BigDecimal price = BigDecimal.valueOf(0.0);
        String name = "张三";
        int age = 5;
        LocalDate birthDay = LocalDate.now();

        public static void main(String[] args) throws Exception {
            executor.setMaximumPoolSize(50);
            while (true) {
                modelFit();
                TimeUnit.MILLISECONDS.sleep(100);
            }
        }

        private static void modelFit() {
            List<CardInfo> taskList = getALLCardInfo();
            taskList.forEach(info -> {
                // do something
                // do sth with info
                executor.scheduleWithFixedDelay(info::method, 2, 3, TimeUnit.SECONDS);
            });
        }

        private static List<CardInfo> getALLCardInfo() {
            List<CardInfo> cardInfoList = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                cardInfoList.add(new CardInfo());
            }
            return cardInfoList;
        }

        public void method() {
        }

    }


}
