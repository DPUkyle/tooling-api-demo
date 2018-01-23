To reproduce [issue 2483](https://github.com/gradle/gradle/issues/2483) as originally reported by [coney](https://github.com/coney).

```bash
gradle build
java -jar build/libs/tooling-api-demo-0.0.1-SNAPSHOT.jar
```

The following console output was observed :-

```bash
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v1.5.9.RELEASE)

2018-01-23 21:47:35.585  INFO 24765 --- [           main] c.e.t.ToolingApiDemoApplication          : Starting ToolingApiDemoApplication on larry with PID 24765 (/home/adrian/workspace/tooling-api-demo/build/libs/tooling-api-demo-0.0.1-SNAPSHOT.jar started by adrian in /home/adrian/workspace/tooling-api-demo)
2018-01-23 21:47:35.594  INFO 24765 --- [           main] c.e.t.ToolingApiDemoApplication          : No active profile set, falling back to default profiles: default
2018-01-23 21:47:35.681  INFO 24765 --- [           main] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@41906a77: startup date [Tue Jan 23 21:47:35 GMT 2018]; root of context hierarchy
2018-01-23 21:47:36.437  INFO 24765 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2018-01-23 21:47:36.839  INFO 24765 --- [           main] utoConfigurationReportLoggingInitializer : 

Error starting ApplicationContext. To display the auto-configuration report re-run your application with 'debug' enabled.
2018-01-23 21:47:36.854 ERROR 24765 --- [           main] o.s.boot.SpringApplication               : Application startup failed

java.lang.IllegalStateException: Failed to execute CommandLineRunner
	at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:735) [spring-boot-1.5.9.RELEASE.jar!/:1.5.9.RELEASE]
	at org.springframework.boot.SpringApplication.callRunners(SpringApplication.java:716) [spring-boot-1.5.9.RELEASE.jar!/:1.5.9.RELEASE]
	at org.springframework.boot.SpringApplication.afterRefresh(SpringApplication.java:703) [spring-boot-1.5.9.RELEASE.jar!/:1.5.9.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:304) [spring-boot-1.5.9.RELEASE.jar!/:1.5.9.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1118) [spring-boot-1.5.9.RELEASE.jar!/:1.5.9.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1107) [spring-boot-1.5.9.RELEASE.jar!/:1.5.9.RELEASE]
	at com.example.toolingapidemo.ToolingApiDemoApplication.main(ToolingApiDemoApplication.java:10) [classes!/:na]
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_31]
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_31]
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_31]
	at java.lang.reflect.Method.invoke(Method.java:483) ~[na:1.8.0_31]
	at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:48) [tooling-api-demo-0.0.1-SNAPSHOT.jar:na]
	at org.springframework.boot.loader.Launcher.launch(Launcher.java:87) [tooling-api-demo-0.0.1-SNAPSHOT.jar:na]
	at org.springframework.boot.loader.Launcher.launch(Launcher.java:50) [tooling-api-demo-0.0.1-SNAPSHOT.jar:na]
	at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:51) [tooling-api-demo-0.0.1-SNAPSHOT.jar:na]
Caused by: org.gradle.tooling.GradleConnectionException: Could not create an instance of Tooling API implementation using the specified Gradle distribution 'https://services.gradle.org/distributions/gradle-4.0.1-bin.zip'.
	at org.gradle.tooling.internal.consumer.loader.DefaultToolingImplementationLoader.create(DefaultToolingImplementationLoader.java:110) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.tooling.internal.consumer.loader.CachingToolingImplementationLoader.create(CachingToolingImplementationLoader.java:44) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.tooling.internal.consumer.loader.SynchronizedToolingImplementationLoader.create(SynchronizedToolingImplementationLoader.java:43) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.tooling.internal.consumer.connection.LazyConsumerActionExecutor.onStartAction(LazyConsumerActionExecutor.java:101) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.tooling.internal.consumer.connection.LazyConsumerActionExecutor.run(LazyConsumerActionExecutor.java:83) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.tooling.internal.consumer.connection.CancellableConsumerActionExecutor.run(CancellableConsumerActionExecutor.java:45) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.tooling.internal.consumer.connection.ProgressLoggingConsumerActionExecutor.run(ProgressLoggingConsumerActionExecutor.java:58) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.tooling.internal.consumer.connection.RethrowingErrorsConsumerActionExecutor.run(RethrowingErrorsConsumerActionExecutor.java:38) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.tooling.internal.consumer.async.DefaultAsyncConsumerActionExecutor$1$1.run(DefaultAsyncConsumerActionExecutor.java:55) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:63) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:46) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) ~[na:1.8.0_31]
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) ~[na:1.8.0_31]
	at org.gradle.internal.concurrent.ThreadFactoryImpl$ManagedThreadRunnable.run(ThreadFactoryImpl.java:55) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at java.lang.Thread.run(Thread.java:745) ~[na:1.8.0_31]
	at org.gradle.tooling.internal.consumer.BlockingResultHandler.getResult(BlockingResultHandler.java:46) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.tooling.internal.consumer.DefaultBuildLauncher.run(DefaultBuildLauncher.java:77) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at com.example.toolingapidemo.GradleRunner.run(GradleRunner.java:24) ~[classes!/:na]
	at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:732) [spring-boot-1.5.9.RELEASE.jar!/:1.5.9.RELEASE]
	... 14 common frames omitted
Caused by: org.gradle.internal.service.ServiceLookupException: Could not configure services using ConnectionScopeServices.configure().
	at org.gradle.internal.service.DefaultServiceRegistry.applyConfigureMethod(DefaultServiceRegistry.java:205) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.internal.service.DefaultServiceRegistry.findProviderMethods(DefaultServiceRegistry.java:180) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.internal.service.DefaultServiceRegistry.addProvider(DefaultServiceRegistry.java:255) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.internal.service.ServiceRegistryBuilder.build(ServiceRegistryBuilder.java:52) ~[na:na]
	at org.gradle.tooling.internal.provider.DefaultConnection.initializeServices(DefaultConnection.java:103) ~[na:na]
	at org.gradle.tooling.internal.provider.DefaultConnection.configure(DefaultConnection.java:94) ~[na:na]
	at org.gradle.tooling.internal.consumer.connection.AbstractPost12ConsumerConnection.configure(AbstractPost12ConsumerConnection.java:37) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.tooling.internal.consumer.loader.DefaultToolingImplementationLoader.createConnection(DefaultToolingImplementationLoader.java:115) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.tooling.internal.consumer.loader.DefaultToolingImplementationLoader.create(DefaultToolingImplementationLoader.java:93) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.tooling.internal.consumer.loader.CachingToolingImplementationLoader.create(CachingToolingImplementationLoader.java:44) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.tooling.internal.consumer.loader.SynchronizedToolingImplementationLoader.create(SynchronizedToolingImplementationLoader.java:43) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.tooling.internal.consumer.connection.LazyConsumerActionExecutor.onStartAction(LazyConsumerActionExecutor.java:101) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.tooling.internal.consumer.connection.LazyConsumerActionExecutor.run(LazyConsumerActionExecutor.java:83) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.tooling.internal.consumer.connection.CancellableConsumerActionExecutor.run(CancellableConsumerActionExecutor.java:45) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.tooling.internal.consumer.connection.ProgressLoggingConsumerActionExecutor.run(ProgressLoggingConsumerActionExecutor.java:58) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.tooling.internal.consumer.connection.RethrowingErrorsConsumerActionExecutor.run(RethrowingErrorsConsumerActionExecutor.java:38) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.tooling.internal.consumer.async.DefaultAsyncConsumerActionExecutor$1$1.run(DefaultAsyncConsumerActionExecutor.java:55) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:63) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:46) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142) ~[na:1.8.0_31]
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617) ~[na:1.8.0_31]
	at org.gradle.internal.concurrent.ThreadFactoryImpl$ManagedThreadRunnable.run(ThreadFactoryImpl.java:55) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at java.lang.Thread.run(Thread.java:745) ~[na:1.8.0_31]
Caused by: org.gradle.internal.service.ServiceCreationException: Could not create service of type ModuleRegistry using GlobalScopeServices.createModuleRegistry().
	at org.gradle.internal.service.DefaultServiceRegistry$FactoryMethodService.invokeMethod(DefaultServiceRegistry.java:797) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.internal.service.DefaultServiceRegistry$FactoryService.create(DefaultServiceRegistry.java:748) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.internal.service.DefaultServiceRegistry$ManagedObjectProvider.getInstance(DefaultServiceRegistry.java:574) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.internal.service.DefaultServiceRegistry$SingletonService.get(DefaultServiceRegistry.java:623) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.internal.service.DefaultServiceRegistry$FactoryService.assembleParameters(DefaultServiceRegistry.java:761) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.internal.service.DefaultServiceRegistry$FactoryService.create(DefaultServiceRegistry.java:747) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.internal.service.DefaultServiceRegistry$ManagedObjectProvider.getInstance(DefaultServiceRegistry.java:574) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.internal.service.DefaultServiceRegistry$SingletonService.get(DefaultServiceRegistry.java:623) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.internal.service.DefaultServiceRegistry$FactoryService.assembleParameters(DefaultServiceRegistry.java:761) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.internal.service.DefaultServiceRegistry$FactoryService.create(DefaultServiceRegistry.java:747) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.internal.service.DefaultServiceRegistry$ManagedObjectProvider.getInstance(DefaultServiceRegistry.java:574) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.internal.service.DefaultServiceRegistry$SingletonService.get(DefaultServiceRegistry.java:623) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.internal.service.DefaultServiceRegistry.applyConfigureMethod(DefaultServiceRegistry.java:199) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.internal.service.DefaultServiceRegistry.findProviderMethods(DefaultServiceRegistry.java:180) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.internal.service.DefaultServiceRegistry.addProvider(DefaultServiceRegistry.java:255) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.internal.service.DefaultServiceRegistry$1.addProvider(DefaultServiceRegistry.java:236) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.tooling.internal.provider.ConnectionScopeServices.configure(ConnectionScopeServices.java:51) ~[na:na]
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_31]
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_31]
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_31]
	at java.lang.reflect.Method.invoke(Method.java:483) ~[na:1.8.0_31]
	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:73) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.internal.service.ReflectionBasedServiceMethod.invoke(ReflectionBasedServiceMethod.java:35) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.internal.service.DefaultServiceRegistry.applyConfigureMethod(DefaultServiceRegistry.java:203) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	... 22 common frames omitted
Caused by: java.lang.IllegalArgumentException: URI is not hierarchical
	at java.io.File.<init>(File.java:418) ~[na:1.8.0_31]
	at org.gradle.internal.classloader.ClasspathUtil$1.visitClassPath(ClasspathUtil.java:63) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.internal.classloader.ClassLoaderVisitor.visit(ClassLoaderVisitor.java:41) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.internal.classloader.ClassLoaderVisitor.visitParent(ClassLoaderVisitor.java:82) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.internal.classloader.ClassLoaderVisitor.visit(ClassLoaderVisitor.java:46) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.internal.classloader.ClassLoaderVisitor.visitParent(ClassLoaderVisitor.java:82) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.internal.classloader.ClassLoaderVisitor.visit(ClassLoaderVisitor.java:46) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.internal.classloader.ClasspathUtil.getClasspath(ClasspathUtil.java:58) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.api.internal.classpath.EffectiveClassPath.findAvailableClasspathFiles(EffectiveClassPath.java:36) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.api.internal.classpath.EffectiveClassPath.<init>(EffectiveClassPath.java:32) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.api.internal.classpath.DefaultModuleRegistry.<init>(DefaultModuleRegistry.java:53) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.api.internal.classpath.DefaultModuleRegistry.<init>(DefaultModuleRegistry.java:47) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.internal.service.scopes.GlobalScopeServices.createModuleRegistry(GlobalScopeServices.java:194) ~[na:na]
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_31]
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_31]
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_31]
	at java.lang.reflect.Method.invoke(Method.java:483) ~[na:1.8.0_31]
	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:73) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.internal.service.ReflectionBasedServiceMethod.invoke(ReflectionBasedServiceMethod.java:35) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	at org.gradle.internal.service.DefaultServiceRegistry$FactoryMethodService.invokeMethod(DefaultServiceRegistry.java:795) ~[gradle-tooling-api-4.4-20171112235945+0000.jar!/:4.4]
	... 45 common frames omitted

2018-01-23 21:47:36.856  INFO 24765 --- [           main] s.c.a.AnnotationConfigApplicationContext : Closing org.springframework.context.annotation.AnnotationConfigApplicationContext@41906a77: startup date [Tue Jan 23 21:47:35 GMT 2018]; root of context hierarchy
2018-01-23 21:47:36.857  INFO 24765 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Unregistering JMX-exposed beans on shutdown
```
