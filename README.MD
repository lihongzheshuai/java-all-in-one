# Java-All-In-One项目

## 目录
- [项目简介](#项目简介)
- [协作说明](#协作说明)
- [其他说明](#其他说明)
- [联系方式](#联系方式)

## 项目简介

这是一个突发奇想的项目。初衷和想法就是为了自己的兴趣研究和跟大家分享同步进展。在文章[*《一起学Java(1)-新建一个Gradle管理的Java项目》*](https://www.coderli.com/java-go-1-new-gradle-project/)中有详细的介绍。

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