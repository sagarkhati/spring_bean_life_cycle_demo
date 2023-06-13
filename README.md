# spring_bean_life_cycle_demo

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
