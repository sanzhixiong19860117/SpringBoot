# SpringBoot入门

## 创建项目

1.使用maven创建（暂时没用）

2.使用官方的文档进行创建项目

地址：https://start.spring.io/

如图所示

![](https://github.com/sanzhixiong19860117/SpringBoot/blob/master/day01/img/springboot1.jpg)

3.使用ide打开

4.点击SpringbootStarApplication这类进行运行

如果出来下面的结果

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3.0.RELEASE)

这就证明你的springboot已经启动成功，当然没有什么报错的情况下。

## 进行网页的测试

1.首先创建一个conterllor的文件夹，里面创建一个hello的类

如下：

```java
package com.joy.springboot_star.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContrellor {
    //路径操作
    @RequestMapping("/hello")
    public String hello(){
        return "helloworld";
    }
}
```

重新运行springboot的操作，启动以后在使用localhots:8080/hello打开就可以看到现在的helloworld打印出来，就证明你的环境完全搭建成功。