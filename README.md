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

# --- Before IoC Initialized ---

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.1.2)

2023-08-05T14:12:33.514-04:00  INFO 11996 --- [           main] in.firozit.Application                   : Starting Application using Java 17.0.8 with PID 11996 (D:\Learnings\SpringBoot_MicroServices\Ashok\workspace\spring-bean-lifecycle\target\classes started by shaik in D:\Learnings\SpringBoot_MicroServices\Ashok\workspace\spring-bean-lifecycle)
2023-08-05T14:12:33.519-04:00  INFO 11996 --- [           main] in.firozit.Application                   : No active profile set, falling back to 1 default profile: "default"
#  Motor :: Constructor Executed
#  afterPropertiesSet() method called from Motor Class
#  Vehicle :: Constructor Executed
#  afterPropertiesSet() method called from Vehicle Class
2023-08-05T14:12:34.402-04:00  INFO 11996 --- [           main] in.firozit.Application                   : Started Application in 1.467 seconds (process running for 2.026)
#  --- After IoC Initialized ---
#  destroy() method called from Vehicle Class
#  destroy() method called from Motor Class

Process finished with exit code 0
