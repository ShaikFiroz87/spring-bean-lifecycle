# spring-bean-lifecycle

========================
Spring Bean Life Cycle 
=======================

=> Java Class which is managing by IOC is called as Spring Bean

=> Spring Bean Life Cycle will be taken care by IOC container

=> If we want to perform some init and destroy operations on the bean then we can use Life Cycle methods


	init ( ) - > after initializing bean execute some logic

	destroy ( ) -> before destroying the bean execute some logic


=> To implement bean life cycle methods we have to implement below 2 interfaces

		1) InitializingBean(I) -> afterPropertiesSet ( )
        Note: This method is called right After Object has been created.
	
		2) DisposbaleBean (I) -> destroy ( )
        Note: This method is called before Object has been distracted.

# Execution Results:

"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.1\lib\idea_rt.jar=61831:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.1\bin" -Dfile.encoding=UTF-8 -classpath D:\Learnings\SpringBoot_MicroServices\Ashok\workspace\spring-bean-lifecycle\target\classes;C:\Users\shaik\.m2\repository\org\springframework\boot\spring-boot-starter\3.1.2\spring-boot-starter-3.1.2.jar;C:\Users\shaik\.m2\repository\org\springframework\boot\spring-boot\3.1.2\spring-boot-3.1.2.jar;C:\Users\shaik\.m2\repository\org\springframework\spring-context\6.0.11\spring-context-6.0.11.jar;C:\Users\shaik\.m2\repository\org\springframework\spring-aop\6.0.11\spring-aop-6.0.11.jar;C:\Users\shaik\.m2\repository\org\springframework\spring-beans\6.0.11\spring-beans-6.0.11.jar;C:\Users\shaik\.m2\repository\org\springframework\spring-expression\6.0.11\spring-expression-6.0.11.jar;C:\Users\shaik\.m2\repository\org\springframework\boot\spring-boot-autoconfigure\3.1.2\spring-boot-autoconfigure-3.1.2.jar;C:\Users\shaik\.m2\repository\org\springframework\boot\spring-boot-starter-logging\3.1.2\spring-boot-starter-logging-3.1.2.jar;C:\Users\shaik\.m2\repository\ch\qos\logback\logback-classic\1.4.8\logback-classic-1.4.8.jar;C:\Users\shaik\.m2\repository\ch\qos\logback\logback-core\1.4.8\logback-core-1.4.8.jar;C:\Users\shaik\.m2\repository\org\apache\logging\log4j\log4j-to-slf4j\2.20.0\log4j-to-slf4j-2.20.0.jar;C:\Users\shaik\.m2\repository\org\apache\logging\log4j\log4j-api\2.20.0\log4j-api-2.20.0.jar;C:\Users\shaik\.m2\repository\org\slf4j\jul-to-slf4j\2.0.7\jul-to-slf4j-2.0.7.jar;C:\Users\shaik\.m2\repository\jakarta\annotation\jakarta.annotation-api\2.1.1\jakarta.annotation-api-2.1.1.jar;C:\Users\shaik\.m2\repository\org\springframework\spring-core\6.0.11\spring-core-6.0.11.jar;C:\Users\shaik\.m2\repository\org\springframework\spring-jcl\6.0.11\spring-jcl-6.0.11.jar;C:\Users\shaik\.m2\repository\org\yaml\snakeyaml\1.33\snakeyaml-1.33.jar;C:\Users\shaik\.m2\repository\org\slf4j\slf4j-api\2.0.7\slf4j-api-2.0.7.jar in.firozit.Application
----------------------------- (( Before IoC Initialized ))--------------------------------

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.1.2)

2023-08-05T14:12:33.514-04:00  INFO 11996 --- [           main] in.firozit.Application                   : Starting Application using Java 17.0.8 with PID 11996 (D:\Learnings\SpringBoot_MicroServices\Ashok\workspace\spring-bean-lifecycle\target\classes started by shaik in D:\Learnings\SpringBoot_MicroServices\Ashok\workspace\spring-bean-lifecycle)
2023-08-05T14:12:33.519-04:00  INFO 11996 --- [           main] in.firozit.Application                   : No active profile set, falling back to 1 default profile: "default"
# ----------------------- Motor :: Constructor Executed  -----------------------
# <<<<<<<<<<<<<<<< afterPropertiesSet() method called from Motor Class >>>>>>>>>>>>>>>>>
# ----------------------- Vehicle :: Constructor Executed  -----------------------
# <<<<<<<<<<<<<<<< afterPropertiesSet() method called from Vehicle Class >>>>>>>>>>>>>>>>>
2023-08-05T14:12:34.402-04:00  INFO 11996 --- [           main] in.firozit.Application                   : Started Application in 1.467 seconds (process running for 2.026)
# ----------------------------- (( After IoC Initialized ))--------------------------------
# <<<<<<<<<<<<<<<< destroy() method called from Vehicle Class >>>>>>>>>>>>>>>>>
# <<<<<<<<<<<<<<<< destroy() method called from Motor Class >>>>>>>>>>>>>>>>>

Process finished with exit code 0
