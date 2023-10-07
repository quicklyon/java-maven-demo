# java-maven-demo for zentao devops platform

禅道DevOps平台 java项目演示代码，通过流水线引擎，借助maven命令构建并打包为jar包

## 本地运行

确保本地环境安装了Java和Maven 

```bash
$ git clone https://github.com/quicklyon/java-maven-demo.git
$ cd java-maven-demo
$ mvn install
$ java $JAVA_OPTS -jar target/dependency/webapp-runner.jar --port $PORT target/*.jar
```
