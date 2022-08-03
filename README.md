# PlayGroundJavaWeb


### Servlet (Interface)
`Servlet` is a interface that have 3 lifecycle methods and 2 other methods. 
```java
// Lifecycle methods
1. init(ServletConfig conf)
2. service(ServletRequest req, ServletResponse resp)
3. destroy()

// Other methods
5. ServletConfig getServletConfig()
6. String getServletInfo()
```

### GenericServelet (Abstract class) 
`GenericServelet` is a abstract class that implements `Servlet` interface and provide the body for all 4 methods excepts 1 `service(-,-)` method

### HttpServelet (Class)
`HttpServlet` is a class that extends `GenericServlet` class and provide the body for remaining 1 method `service(-,-)` and provide methods like `doGet(-,-), doPost(-,-), doPut(-,-), doDelete(-,-)` etc to be override by its child class. 
