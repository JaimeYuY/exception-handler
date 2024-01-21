# springboot项目异常捕捉
## 实现思路
1. 使用@RestControllerAdvice注解，定义系统全局异常捕捉类，捕捉系统全局异常
2. 继承RuntimeException类，定义业务异常类，用于业务打断

## 异常捕捉演示
1. 下载源代码
2. 启动项目，调用/test/exception接口

## 关键业务代码
