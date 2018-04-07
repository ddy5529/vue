package com.ddy.data.vue.Thread;

import com.ddy.data.vue.Model.message.AccessToken;
import com.ddy.data.vue.Utils.fastwebutils.WeixinUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时获取微信access_token的线程
 *在WechatMpDemoApplication中注解@EnableScheduling，在程序启动时就开启定时任务。
 * 每7200秒执行一次
 */
@Component
public class AccessTokenThread {
    private static Logger log = LoggerFactory.getLogger(AccessTokenThread.class);

    @Scheduled(fixedDelay = 2*3600*1000)
    //7200秒执行一次
    public void gettoken(){
        log.info("此处为2小时的定时任务");
    }
}