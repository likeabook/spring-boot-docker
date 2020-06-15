package demo;

import com.github.yt.web.EnableYtWeb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.management.ManagementFactory;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
@EnableYtWeb
public class MainApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

    }


    // 发送消息
    @GetMapping("test")
    public Map test() throws InterruptedException {
        StopWatch stopWatch = new StopWatch("时间点记录");
        stopWatch.start("task1");
//        stringArrayBlockingQueue.put("22");
        Map map = new HashMap();
        map.put("aaa", "222");
        stopWatch.stop();
        stopWatch.start("task1");
        map.put("bbb", "222");
        Thread.sleep(10);

        stopWatch.stop();

        System.out.println(stopWatch.prettyPrint());
        System.out.println(ManagementFactory.getRuntimeMXBean().getUptime());
        return map;
    }


}
