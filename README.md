# Tom（医疗版）

## 项目简介

Tom（医疗版）是一个基于 LangChain4j 和 SpringBoot 开发的医疗领域智能助手，能够实现医疗咨询、挂号预约等功能，并集成了多种大模型和检索增强生成（RAG）技术。

本项目旨在构建一个医疗领域的智能助手，具备以下核心功能：

- **医疗咨询**

提供专业的医疗建议和健康指导

- **就医指引**

解答就医流程相关问题

- **AI分导诊**

根据病情推荐合适科室

- **挂号服务**

实现智能查询、预约和取消挂号

技术上，项目基于 LangChain4j 框架整合了多种大模型，实现了聊天记忆、函数调用、检索增强生成等高级功能。

## 环境准备
- JDK 17+
- Maven 3.6+
- MySQL 8.0+
- MongoDB（用于聊天记忆持久化）
- Node.js（用于前端运行）

## 项目构建

### 1.克隆仓库

git clone https://github.com/yourusername/guiguxiaozhi-medical.git
cd guiguxiaozhi-medical

### 2.配置依赖
修改pom.xml文件，确保所有依赖版本正确
### 3.配置数据库
修改application.properties中的 MySQL 和 MongoDB 连接信息
执行sql/guiguxiaozhi.sql初始化数据库表结构

### 4.配置大模型 API
在环境变量中配置各模型的 API 密钥
DeepSeek: DEEP_SEEK_API_KEY
阿里百炼: DASH_SCOPE_API_KEY
Pinecone: PINECONE_API_KEY

### 5.启动应用
mvn spring-boot:run

### 6.运行前端
cd xiaozhi-ui
npm install
npm run dev

### 7.访问应用
后端接口文档：http://localhost:8080/doc.html
前端页面：http://localhost:3000（默认端口，具体以实际输出为准）


## 核心功能
### 1. 大模型集成
OpenAI 系列模型
DeepSeek
阿里通义千问 / 万象
Ollama 本地部署模型
具体配置方法参见src/main/resources/application.properties中的注释说明。
### 2. 聊天记忆
实现了基于 MongoDB 的聊天记忆持久化，支持多用户会话隔离，确保对话上下文的连贯性。
### 3. 函数调用
通过工具类实现了挂号、取消挂号、查询号源等业务功能，大模型可根据用户请求自动调用相应工具。
### 4. 检索增强生成（RAG）
集成了 Pinecone 向量数据库，实现医疗知识库的高效检索，使模型能够基于专业医疗知识给出更准确的回答。



## 许可证
本项目采用 Apache License 2.0 许可证，详情参见 LICENSE 文件。
