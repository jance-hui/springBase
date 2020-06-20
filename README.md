# spring boot 基础框架

本项目集合`spring`、`mybatis-plus`、`mysql`、`lombok`、`fastjson`、`slf4j`

### 项目层级结构
>`main`
>>`java`
>>>`advide`                响应报文response定义 <br>
>>>`config`                  一些spring配置文件 <br>
>>>`controller`              控制层 <br>
>>>`entity`                  实体类层 <br>
>>>`mapper`                  mapper（Dao）层 <br>
>>>`service`                 service及其impl层 <br>
>>>`utils`                   常用工具类 <br>
>>>`SpringbaseApplication`   启动类 <br>
>>
>>`resource`
>>>`mapper.springbase`       mapper文件存放位置 <br>
>>>`static`                 一些静态文件 <br>
>>>`templates`               一些模板/html文件 <br>
>>>`application.yml`         项目配置文件 <br>
>>>`log4j.properties`        日志打印配置 <br>
>>>`test.sql`                数据库sql <br>
>
>`test`
>>`java`
>>>`CodeGenerator`            mybatis-plus生成文件


### mybatis-plus
指定表名生成相关entity、mapper、service、serviceImpl、controller文件。

详细参考<a href="https://mp.baomidou.com/guide/generator.html">mybatis-plus官方文档</a>

