# Java-All-In-One项目

## 目录
- [项目简介](#项目简介)
- [系列文章](#系列文章)
- [协作说明](#协作说明)
- [其他说明](#其他说明)
- [联系方式](#联系方式)

## 项目简介

这是一个突发奇想的项目。初衷和想法就是为了自己的兴趣研究和跟大家分享同步进展。在文章[*《一起学Java(1)-新建一个Gradle管理的Java项目》*](https://www.coderli.com/java-go-1-new-gradle-project/)中有详细的介绍。

## 系列文章

|    | 文章                                                                                                                                | 知识分类                                                                                 | 
|----|-----------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------|
| 1  | [*《一起学Java(1)-新建一个Gradle管理的Java项目》*](https://www.coderli.com/java-go-1-new-gradle-project/)                                       | 项目框架|
| 2  | [*《一起学Java(2)-如何利用Github进行项目代码fork和协作同步》*](https://www.coderli.com/java-go-2-how-to-work-on-github/)                              | [**版本控制**](https://www.coderli.com/tags/git/) |
| 3  | [*《一起学Java(3)-[起步篇]教你详细掌握Java构建工具Gradle和Maven定位和优缺点对比》*](https://www.coderli.com/java-go-3-gradle-vs-maven/)                      | [**构建工具**](https://www.coderli.com/tags/gradle/)                                     |
| 4  | [*《一起学Java(4)-[起步篇]教你掌握本协作项目中的Gralde相关配置文件（上）》*](https://www.coderli.com/java-go-4-project-config-files-intro-gradle-one/)        | [**构建工具**](https://www.coderli.com/tags/gradle/)                                     |
| 5  | [*《一起学Java(5)-[起步篇]教你掌握本协作项目中的Gralde相关配置文件（下）》*](https://www.coderli.com/java-go-5-project-config-files-intro-gradle-two/)        | [**构建工具**](https://www.coderli.com/tags/gradle/)                                     |
| 6  | [*《一起学Java(6)-[起步篇]教你掌握本协作项目中Git和IDEA相关配置文件*](https://www.coderli.com/java-go-6-project-config-files-intro-git-idea/)             | [**版本控制**](https://www.coderli.com/tags/git/)                                        |
| 7  | [*《一起学Java(7)-[起步篇]教你为本开源项目编写README文件*](https://www.coderli.com/java-go-7-write-readme-for-the-project/)                          | [**知识扩展**](https://www.coderli.com/categories/%E7%9F%A5%E8%AF%86%E6%89%A9%E5%B1%95/) |
| 8  | [*《一起学Java(8)-[起步篇]教你如何进行本项目的PR和将IDE相关文件移除版本控制》*](https://www.coderli.com/java-go-8-first-pr-and-remove-all-ide-files/)           | [**版本控制**](https://www.coderli.com/tags/git/)  |
| 9  | [*《一起学Java(9)-[日志篇]教你掌握Java日志框架的演进和设计逻辑》*](https://www.coderli.com/java-go-9-import-log-one/)                                     | [**日志框架**](https://www.coderli.com/tags/log/)  |
| 10 | [*《一起学Java(10)-[日志篇]教你为本项目引入SLF4J接口层框架》*](https://www.coderli.com/java-go-10-import-log-two/)                                     | [**日志框架**](https://www.coderli.com/tags/log/) |
| 11 | [*《一起学Java(11)-[日志篇]教你分析SLF4J源码，掌握Logger接口实现类加载原理》*](https://www.coderli.com/java-go-11-import-log-three/)                        | [**日志框架**](https://www.coderli.com/tags/log/)   |
| 12 | [*《一起学Java(12)-[日志篇]教你分析SLF4J源码，掌握SLF4J如何与Logback无缝集成的原理》*](https://www.coderli.com/java-go-12-import-log-four-logback/)          |  [**日志框架**](https://www.coderli.com/tags/log/)  |
| 13 | [*《一起学Java(13)-[日志篇]教你分析SLF4J和Log4j2源码，掌握SLF4J与Log4j2桥接集成原理》*](https://www.coderli.com/java-go-13-import-log-five-log4j2-slf4j2/) |  [**日志框架**](https://www.coderli.com/tags/log/)  |
| 13 | [*《一起学Java(14)-[日志篇]教你用透Log4j2，掌握Log4j2配置原理和实际应用》*](https://www.coderli.com/java-go-14-log-six-log4j2-config/) |  [**日志框架**](https://www.coderli.com/tags/log/)  |

## 协作说明

在文章[*《一起学Java(2)-如何利用Github进行项目代码fork和协作同步》*](https://www.coderli.com/java-go-2-how-to-work-on-github/)中，已对如何协作使用该项目进行了较为详细的介绍。

### 对于不同的ide开发者
在进行开发时，不能保证所有开发者使用的都是同一个ide, 所以在开发时，根据不同的情况，我们需要对各个ide的文件夹内容进行处理  
- `.vscode`: `.vscode`文件夹是vscode中使用的ide专有的文件夹，严格意义上，vscode并不能算作ide,他只是一个拥有大量插件的文本编辑器。  
`.vscode`文件夹中，和协同相关的最主要的是三个文件：`extentions.json`，`launch.json`，`tasks.json`。  
其中，`extentions.json`是为其他开发者的ide提供插件提示，即提示该项目所需要的核心插件是哪些。  
`launch.json`，此文件是vscode环境中的运行/调试脚本，vscode中的代码调试主要是依赖于这个文件。  
`tasks.json`，此文件是针对`launch.json`所用的补充，对于某些需要前置条件的运行项，可以使用这个给`launch.json`提供运行前的执行项。  
- `.idea`  

## 其他说明

在我写这个说明的时候，项目还处于初始状态。后续会随着项目的进展，逐步补充完善本文件的内容。

## 联系方式

对项目有任何疑问和建议，随时欢迎交流探讨。方式如下：

- QQ群(982860385)：[点击直接加群](https://qm.qq.com/q/qwy4BSW9La)
- QQ频道(Java开发者乐园): [点击链接加入腾讯频道【Java开发者乐园】](https://pd.qq.com/s/dzb1xn6cd)
- Discord开发者联盟：[点击加入](https://discord.gg/x7fKGkE3zB)