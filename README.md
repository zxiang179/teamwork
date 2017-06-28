# 分布式系统小组项目
基于Spring Cloud的云分布式后台管理系统架构，核心技术采用Eureka(服务注册和服务发现)、Fegin、Ribbon、Zuul、Hystrix、Security、OAth、Mybatis、Ace-cache等主要框架和中间件，UI采用Bootstrap、jquery等前端组件。

### teamwork-center 服务注册中心
http://localhost:8761

### teamwork-monitor 监控中心
http://localhost:8764

### teamwork-admin 服务层
http://localhost:8763

### teamwork-agent 客户端代理调用

### teamwork-gate 网关负载中心，统一请求入口
http://localhost:8765

### teamwork-ui 前端UI
http://localhost:8766

### teamwork-api 公共服务接口包

------------
# 启动

- 创建mysql数据库ag_admin 脚本init.sql
- 依次运行main类：CenterBootstrap（teamwork-center）、GateBootstrap（teamwork-gate）、AdminBootstrap（teamwork-admin）、UIBootstrap（teamwork-ui）、MonitorBootstrap（teamwork-monitor）
- 访问地址: http://localhost:8765/admin/index  账号/密码：teamwork/123456（该项目中所有账户密码均为teamwork/123456）


- 如启动不出来需要刷新，基础配置管理有点问题还有待改进，系统监控可以正常运行！


小组成员：祝翔、郁可人、金丽娇、孙晨
---------
