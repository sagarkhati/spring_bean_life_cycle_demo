# spring_bean_life_cycle_demo

**Spring Bean Life Cycle**
- Application is started.
- Spring container is created.
- Container reads configuration.
- Beans definitions are loaded/created from configuration.
- BeanFactoryPostProcessors::postProcessBeanFactory gets called.
- Instances of Spring Beans are created.
- Properties and Dependencies are set for bean.
- BeanPostProcessor::postProcessBeforeInitialization gets called.
- @PostConstruct method gets called.
- InitializingBean::afterPropertiesSet method gets called.
- @Bean(initMethod) method gets called
- BeanPostProcessor::postProcessAfterInitialization gets called.
- Bean is Ready to use.
- Application is closed.
- @PreDestroy method gets called.
- DisposableBean::destroy method gets called.
- @Bean(destroyMethod) method gets called.

--- 

**Notes:**

As of Spring 2.5, you have three options for controlling bean life cycle behavior:
  - The InitializingBean and DisposableBean callback interfaces
  - Custom init() and destroy() methods
  - The @PostConstruct and @PreDestroy annotations<br />
  You can combine these mechanisms to control a given bean.<br />
  
Multiple life cycle mechanisms configured for the same bean, with different initialization methods, are called as follows:
  - Methods annotated with @PostConstruct
  - afterPropertiesSet() as defined by the InitializingBean callback interface
  - A custom configured init() method<br />

Destroy methods are called in the same order:
  - Methods annotated with @PreDestroy
  - destroy() as defined by the DisposableBean callback interface
  - A custom configured destroy() method

---

**Step1:** Go to [Spring Initializr](https://start.spring.io/) and create and download the project without adding any dependencies: 


**Step2:** Extract the downloaded code and import it into IDE (Eclipse).


**Step3:** Now launch the application as Java Application, It should successfully started.


**Step4:** Go to [Spring Initializr](https://start.spring.io/) and create and download the project without adding any dependencies: 


**Step5:** Extract the downloaded code and put it into root directory of above project. Step1 project will be parent and step4 project will be child.


**Step6:** import the child project into eclipse from inside the parent project.


**Step7:** Now launch the child application as Java Application, It should successfully started.


**Step8:** Open the pom.xml of child app and add the following by replacing existing:

```
<parent>
	<groupId>com.ssk.parent</groupId>
	<artifactId>spring_bean_life_cycle_demo</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</parent>
```

**Step9:** In the pom.xml of child app and remove the version of child app as it is duplicate to parent:

```
<version>0.0.1-SNAPSHOT</version>
```


**Step10:** Open the pom.xml of parent app and add the following:

```
<packaging>pom</packaging>

<modules>
	<module>sblc_with_xml_config_demo</module>
</modules>
```


**Step11:** Two beans Employee and Address having HAS-A relationship added


**Step12:** Configured both the beans in beans.xml file

**Step13:** BeanFactoryPostProcessor implemented. Runs once per container.

**Step14:** BeanPostProcessor implemented. Runs for all beans.

**Step15:** InitializingBean and DisposableBean implemented individually for each bean.

**Step16:** Custom init and destroy method written individually for each bean.




































