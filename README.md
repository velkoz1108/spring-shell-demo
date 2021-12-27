## spring shell demo

### run application
```shell
$ mvn clean package
```
```shell
$ java -jar target/spring-shell-demo-0.0.1-SNAPSHOT.jar 
```

### get cmd help info
```shell
$ shell:>help
AVAILABLE COMMANDS

Built-In Commands
        clear: Clear the shell screen.
        exit, quit: Exit the shell.
        help: Display help about available commands.
        script: Read and execute commands from a file.
        stacktrace: Display the full stacktrace of the last error.

Shell Test
        testshell: Test Shell


```

```shell
$ shell:>help -C testshell


NAME
        testshell - Test Shell

SYNOPSYS
        testshell [--url] string  [--name] string  [--param-list] list list list  

OPTIONS
        --url  string
                server url is required, such as: https://xxx/yyy
                [Mandatory]

        --name  string
                name param is required.
                [Mandatory]

        --param-list  list list list
                list param.
                [Mandatory]

```

### run the shell cmd
```shell
$ shell:>testshell --url http://baidu.com --name eden --param-list aaa bbb ccc
url = http://baidu.com
name = eden
paramList = [aaa, bbb, ccc]
SUCCESS
```
### exit 
```shell
$ shell:>exit
2021-12-27 15:14:50.493  INFO 11113 --- [       Thread-2] s.c.a.AnnotationConfigApplicationContext : Closing org.springframework.context.annotation.AnnotationConfigApplicationContext@6a38e57f: startup date [Mon Dec 27 15:08:13 CST 2021]; root of context hierarchy
2021-12-27 15:14:50.496  INFO 11113 --- [       Thread-2] o.s.j.e.a.AnnotationMBeanExporter        : Unregistering JMX-exposed beans on shutdown
```