package com.cheer.demo;

import org.junit.Assert;
import org.junit.Test;

public class JunitDemo {

        // 独立运行，不再需要main函数
        @Test
        public void hello() {
            System.out.println("HelloWorld!");

            int s = 1 + 3;
            // 断言，将预期结果与实际运行结果进行对比
            Assert.assertEquals(4, s);
        }
}
