# Contributing to Sdk All

非常感谢您对本项目的关注与支持！我们热烈欢迎各位贡献源代码，期待收到您的`Pull Requests`。

## 编码约定

为了使您的代码更容易被接受，请遵循以下原则和规范提交代码：

> - 代码提交需遵守[Git提交规范](https://github.com/EalenXie/sdk-all/blob/main/GIT_PR.md)。
> - 安装`SonarLint`插件并对代码进行扫描分析，在提交代码前确保无`issue`。
> - 使用`spring-web`框架中的`RestOperations`作为基本调用组件。
> - 使用`com.fasterxml.jackson`框架作为主要的序列化/反序列化依赖。
> - 引入`lombok`以简化值对象类代码（为了减小体积，建议仅使用`@Getter`和`@Setter`注解，禁止使用`@Builder`和`@Accessors`）。
> - 使用编译器全局格式化代码，尽量做好本地单元测试(请保护好相关的密钥授权信息,不要将其提交上来)，并完善注释内容。
> - 为了提供更好的开发者体验，请认真思考每个类、字段的命名，以及每个函数的定义。

我们期待您的贡献能为广大开发者带来更好的使用体验！如果您有任何问题或需要进一步的指导，请随时与我([ealenxie@outlook.com](mailto:ealenxie@outlook.com))
联系。谢谢您的支持！🚀
