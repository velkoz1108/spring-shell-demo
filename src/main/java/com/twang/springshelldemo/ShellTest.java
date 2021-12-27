package com.twang.springshelldemo;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.List;


@ShellComponent
public class ShellTest {
    @ShellMethod("Test Shell")
    public String testshell(@ShellOption(help = "server url is required, such as: https://xxx/yyy", arity = 1) String url,
                            @ShellOption(help = "name param is required.", arity = 1) String name,
                            @ShellOption(help = "list param.", arity = 3) List<String> paramList) {
        System.out.println("url = " + url);
        System.out.println("name = " + name);
        System.out.println("paramList = " + paramList);

        return "SUCCESS";
    }
}
