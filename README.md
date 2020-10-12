# logback-springboot

logback usage demo in springboot.

```bash
🕙[2020-10-12 19:08:00.130] ❯ mvn clean package
🕙[2020-10-12 19:08:03.279] ❯ rm -fr logs
🕙[2020-10-12 19:08:06.794] ❯ java -Dspring.profiles.active=dev -jar target/logback-springboot-1.0.0.jar
Application Name: logback-springboot Application Version: 1.0.0  :: Spring Boot (v2.3.4.RELEASE) ::
12-10-2020 19:08:12.001 [main] INFO  com.github.bingoohuang.logbackspringboot.Application.logStarting - Starting Application v1.0.0 on bingoobjcadeMacBook-Pro.local with PID 82579 (/Users/bingoobjca/github/logback-springboot/target/logback-springboot-1.0.0.jar started by bingoobjca in /Users/bingoobjca/github/logback-springboot)
12-10-2020 19:08:12.004 [main] DEBUG com.github.bingoohuang.logbackspringboot.Application.logStarting - Running with Spring Boot v2.3.4.RELEASE, Spring v5.2.9.RELEASE
12-10-2020 19:08:12.004 [main] INFO  com.github.bingoohuang.logbackspringboot.Application.logStartupProfileInfo - The following profiles are active: dev
12-10-2020 19:08:12.458 [main] INFO  com.github.bingoohuang.logbackspringboot.Application.logStarted - Started Application in 0.935 seconds (JVM running for 1.356)
12-10-2020 19:08:12.460 [main] DEBUG com.github.bingoohuang.logbackspringboot.MyService.doStuff - doStuff needed to debug - value
12-10-2020 19:08:12.462 [main] INFO  com.github.bingoohuang.logbackspringboot.MyService.doStuff - doStuff took input - value
12-10-2020 19:08:12.462 [main] WARN  com.github.bingoohuang.logbackspringboot.MyService.doStuff - doStuff needed to warn - value
12-10-2020 19:08:12.462 [main] ERROR com.github.bingoohuang.logbackspringboot.MyService.doStuff - doStuff encountered an error with value - value

🕙[2020-10-12 19:08:12.502] ❯ cat logs/log.log

12-10-2020 19:08:12.001 [main] INFO  c.g.b.logbackspringboot.Application.logStarting - Starting Application v1.0.0 on bingoobjcadeMacBook-Pro.local with PID 82579 (/Users/bingoobjca/github/logback-springboot/target/logback-springboot-1.0.0.jar started by bingoobjca in /Users/bingoobjca/github/logback-springboot)
12-10-2020 19:08:12.004 [main] DEBUG c.g.b.logbackspringboot.Application.logStarting - Running with Spring Boot v2.3.4.RELEASE, Spring v5.2.9.RELEASE
12-10-2020 19:08:12.004 [main] INFO  c.g.b.logbackspringboot.Application.logStartupProfileInfo - The following profiles are active: dev
12-10-2020 19:08:12.458 [main] INFO  c.g.b.logbackspringboot.Application.logStarted - Started Application in 0.935 seconds (JVM running for 1.356)
12-10-2020 19:08:12.460 [main] DEBUG c.g.b.logbackspringboot.MyService.doStuff - doStuff needed to debug - value
12-10-2020 19:08:12.462 [main] INFO  c.g.b.logbackspringboot.MyService.doStuff - doStuff took input - value
12-10-2020 19:08:12.462 [main] WARN  c.g.b.logbackspringboot.MyService.doStuff - doStuff needed to warn - value
12-10-2020 19:08:12.462 [main] ERROR c.g.b.logbackspringboot.MyService.doStuff - doStuff encountered an error with value - value

🕙[2020-10-12 19:08:16.081] ❯ rm -fr logs
🕙[2020-10-12 19:08:19.707] ❯ java -Dspring.profiles.active=prod -jar target/logback-springboot-1.0.0.jar
Application Name: logback-springboot Application Version: 1.0.0  :: Spring Boot (v2.3.4.RELEASE) ::

12-10-2020 19:08:28.779 [main] INFO  com.github.bingoohuang.logbackspringboot.Application.logStarting - Starting Application v1.0.0 on bingoobjcadeMacBook-Pro.local with PID 82717 (/Users/bingoobjca/github/logback-springboot/target/logback-springboot-1.0.0.jar started by bingoobjca in /Users/bingoobjca/github/logback-springboot)
12-10-2020 19:08:28.782 [main] INFO  com.github.bingoohuang.logbackspringboot.Application.logStartupProfileInfo - The following profiles are active: prod
12-10-2020 19:08:29.228 [main] INFO  com.github.bingoohuang.logbackspringboot.Application.logStarted - Started Application in 0.898 seconds (JVM running for 1.249)

🕙[2020-10-12 19:08:29.272] ❯ cat logs/log.log
12-10-2020 19:08:28.779 [main] INFO  c.g.b.logbackspringboot.Application.logStarting - Starting Application v1.0.0 on bingoobjcadeMacBook-Pro.local with PID 82717 (/Users/bingoobjca/github/logback-springboot/target/logback-springboot-1.0.0.jar started by bingoobjca in /Users/bingoobjca/github/logback-springboot)
12-10-2020 19:08:28.782 [main] INFO  c.g.b.logbackspringboot.Application.logStartupProfileInfo - The following profiles are active: prod
12-10-2020 19:08:29.228 [main] INFO  c.g.b.logbackspringboot.Application.logStarted - Started Application in 0.898 seconds (JVM running for 1.249)
12-10-2020 19:08:29.230 [main] INFO  c.g.b.logbackspringboot.MyService.doStuff - doStuff took input - value
12-10-2020 19:08:29.232 [main] WARN  c.g.b.logbackspringboot.MyService.doStuff - doStuff needed to warn - value
12-10-2020 19:08:29.232 [main] ERROR c.g.b.logbackspringboot.MyService.doStuff - doStuff encountered an error with value - value
```

## 指定profile

将logback.xml文件拆分为logback-prod.xml，logback-dev.xml两个文件（logback-{profile}.xml），
而不是定义在同一个文件中。然后应用会根据profile确定使用哪个配置文件在application.properties里面配置：

`logging.config: classpath:logback-${spring.profiles.active}.xml`

启动时指定profile：

`java -Dspring.profiles.active=dev -jar xxx.jar`

也可以在application.properties指定：

`spring.profiles.active=dev`

## 指定日志配置文件

`java -Dlogging.config=file:/home/dev-01/Documents/logback.xml -jar xxx.jar`

## thanks

1. [Configuring Logback with Spring Boot](https://lankydan.dev/2019/01/09/configuring-logback-with-spring-boot), [code](https://github.com/lankydan/logback-with-springboot-config)
1. [spring-boot logging reference](https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#boot-features-logging)
1. [Spring boot profile specific logging example](https://howtodoinjava.com/spring-boot2/logging/profile-specific-logging/)

## problems fix

1. fix `InetAddress.getLocalHost().getHostName() took ...milliseconds`

    ```log
    12-10-2020 17:36:02.280 [main] WARN  org.springframework.boot.StartupInfoLogger.appendOn - InetAddress.getLocalHost().getHostName() took 5007 milliseconds to respond. Please verify your network configuration (macOS machines may need to add entries to /etc/hosts).
    ```

    ```bash
    $ hostname
    bingoobjcadeMacBook-Pro.local
    $ sudo vi /etc/hosts
    127.0.0.1               bingoobjcadeMacBook-Pro.local
    ::1                     bingoobjcadeMacBook-Pro.local
    255.255.255.255         broadcasthost
    ```

1. different between `--server.port=12000` and `-Dserver.port=12000`

    * command line argument: `java -jar myapp.jar --server.port=12000`
    * System property: `java -Dserver.port=12000 -jar myapp.jar` **remember to put it before the main class or jar archive**
    * [howto-properties-and-configuration](https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#boot-features-external-config-command-line-args)
