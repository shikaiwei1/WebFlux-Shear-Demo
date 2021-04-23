# What`s this
这是一个在WebFlux框架下搭建的分享项目，平时一些基于Reactor（反应式框架）的工具类和Demo分享与此

# Basic run environment
- JAVA 11
- SpringBoot 2.4.4
- Spring Cloud 2020.0.2
- Spring Cloud Alibaba 2021.1
- Log4j2（替换了SpringBoot自带的Logback）

# Modules description
## Model
这里存放了最基础的数据实体（PO DO VO等等）
## Common
- Entity
- Utils
- Manager
## Service
- 各类服务及公共逻辑
## Repositories
- 反应式数据库交互的相关逻辑
