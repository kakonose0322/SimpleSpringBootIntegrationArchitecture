# 无聊时写的集成架构

## 简介

由于开发时，重复选择架构什么的，于是有了这个基本后端架构，它集成基本较为完善的功能，剩下的新增也是对pom和模块的追加，但主体大部分CRUD都已经完善。

## 项目架构

列些需要单独注意的：

ElasticSearch

Jasypt

Swagger2

Velocity

Mybatis

Druid

Redis

Mail

Thymeleaf

Httpclient

Jsoup

简单注解：

ES帮助你拓展内容检索功能；Redis可以配合ES等，做缓存处理，毕竟总不能使用一次获得一次，然后静态常量在单例模式下回收是个问题，这里还是强烈建议如果遇到大量缓存引入Redis；Velocity和Thymeleaf这两个是在做模板的时候用到的；Mail，配合Velocity之类的模板引擎，快速生成验证码邮件，验证邮箱登陆等功能；Mybatis，其实MP和MyBatis功能都差不多，其本身的自动生成策略也很棒了；Druid方便监控数据信息，不过不太推荐使用；HttpClient和Jsoup，可以做接口调用功能，也可以做数据爬取，形成自己数据库的功能；Jasypt：用于配置文件加密，可以打成启动服务，在启动时输入配置参数，或者设定固定配置文件位置，启动调用配置文件。

## 使用注意

主要为ES和Redis，这两者同时用了Netty进行通讯，会起冲突，在使用时，推荐使用ES 6.4.3版本，这是根据Spring boot和RabbitMQ决定的，而且6.x还是Java8，如果7.x使用的Java11，能启动，不够优雅，一堆警告；

最好Jasypt加密不要写在代码里，或者直接放在根目录配置，多此一举了就；

然后就是mail的配置不要乱动，因为我是@value获取的数据。

```yaml
mail:
    host: smtp.qq.com # 这里看你选择的邮箱类型
    username: # 邮箱账户
    password: # 授权码，不是密码啊！
    default-encoding: UTF-8
    port: 465
    properties:
      mail:
        smtp:
          socketFactory:
            class: javax.net.ssl.SSLSocketFactory
```

