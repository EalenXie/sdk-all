# Contributing to Sdk All

十分感谢支持本项目,热烈欢迎各位贡献你们的源代码,敬请提交你们的`Pull Requests`

## 编码约定

为了使各位的代码更容易被接受,请各位提交代码遵循以下的原则和规范

> - 提交`PR`按照[Git提交规范](https://github.com/EalenXie/sdk-all//blob/main/GIT_PR.md)
> - 安装`SonarLint`插件并对代码进行扫描分析,无`issue`时提交代码
> - 使用`spring-web`框架中的`RestOperations`作为基本调用组件
> - 以`com.fasterxml.jackson`框架作为主要的序列化/反序列化依赖
> - 引入`lombok`简化实体代码(为了体积最小化,建议仅使用`@Getter`和`@Setter`)
> - 使用编译器全局格式化代码,代码做好单元测试,完善注释内容
