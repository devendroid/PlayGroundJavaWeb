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


### How to run this demo?
Just clone and import the project in eclipse, and you will need below things:

- IDE (eclipse) : [Link](https://www.youtube.com/watch?v=yB2LHVok7_c&list=PL0zysOflRCemekjlbHbpTw-XGWufHEzcf&index=2)
- Web Server (Apache tomcat) : [Link](https://www.youtube.com/watch?v=aNFpjKGKb64&list=PL0zysOflRCemekjlbHbpTw-XGWufHEzcf&index=3)
- DB Server (Mysql) : [Link](https://www.youtube.com/watch?v=sm7Fe609ilE&list=PL0zysOflRCemekjlbHbpTw-XGWufHEzcf)
- Download connector jar file same version as mysql : [Link](https://downloads.mysql.com/archives/c-j/)
- JDBC Driver (Mysql connector jar) : Just place the connector jar under "WEB-INF/lib"

#### Troubleshooting
https://stackoverflow.com/questions/50093144/mysql-8-0-client-does-not-support-authentication-protocol-requested-by-server
