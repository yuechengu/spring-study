## 常用依赖
```xml
<!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-webmvc</artifactId>
    <version>5.3.15</version>
</dependency>
```
## 注解说明
- @Autowired: 自动装配通过类型，名字
    如果Autowired不能唯一自动装配上属性，则需要通过@Qualifier(value="xxx")
- @Resource: 自动装配通过名字，类型
- @Nullable: 字段标记了这个注解，说明该字段可以为null
- @Component: 组件，放在类上，说明这个类被Spring管理了，就是bean