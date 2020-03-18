[TOC]

# 참고

[인프런 자바 스프링 프레임워크]([https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-%ED%94%84%EB%A0%88%EC%9E%84%EC%9B%8C%ED%81%AC_renew](https://www.inflearn.com/course/스프링-프레임워크_renew))





# 스프링



DI: dependency injection

AOP: 관점 지향 프로그래밍, 공통된 부분을 뽑아서 따로 관리, 주요부분만 코딩

MVC: model view control

JDBC: java database connector



spring-core

spring-aop

spring-jdbc

spring-tx

spring-webmvc



스프링컨테이너 ioc : 스프링에서 객체를 생성하고 조립하는 컨테이너로, 컨테이너를 통해 생성된 객체를 **빈(Bean)**이라고 부른다.



#### 환경설정

1. **스프링 프로젝트 생성**

eclipse에서 

Maven project 생성

group id - 전체 프로젝트를 감싸는 이름

Artifact id

![image-20200318171253936](README.assets/image-20200318171253936.png)





2. **pom.xml** 작성

버전 맞추기

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.example</groupId>
    <artifactId>testPjt</artifactId>
    <version>1.0-SNAPSHOT</version>

    <dependencies>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>5.2.2.RELEASE</version>
        </dependency>

    </dependencies>


    <build>
        <plugins>
            <plugin>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.1</version>
                <configuration>
                    <source>1.8</source>
                    <target>1.8</target>
                    <encoding>utf-8</encoding>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>
```





#### 프로젝트 구조 Install

**Back spring**

**src/**

​	**main/**

​			**java/** 자바파일 관리

​			**resources/** 자원을 관리, 스프링 설정 파일



pom.xml 파일이란 메이븐 설정파일로, 메이븐은 라이브러리를 연결해주고, 빌드를 위한 플랫폼이다.

---

**Front vue**

```cmd
npm install -g vue-cli
vue init webpack my-project // CLI 2 버전
```

** 항상 node 10이상버전 유지로 에러해결

```
nvm install v10.15.1
// 터미널을 새로 열때마다 버전 6으로 다시 되돌아가는데,
// 이 부분 수정해야한다. Mac이란..
```

```cmd
vue create 프로젝트명 // CLI 3 버전
npm run serve // 서버 열기
```



