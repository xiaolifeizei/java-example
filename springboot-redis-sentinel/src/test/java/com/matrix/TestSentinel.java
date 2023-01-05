package com.matrix;

import com.matrix.utils.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @author : cui_feng
 * @since : 2023-01-05 09:54
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootRedisSentinel.class)
public class TestSentinel {

    @Autowired
    RedisUtil redisUtil;

    @Test
    public void job() throws InterruptedException {
        while (true) {
            redisUtil.set("job", new Date());
            Thread.sleep(500);
        }
    }
}
