package com.friend.py.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Service
public class test {
//    public static void main(String[] args) {
//        Byte a = 0;
//        System.out.println(a);
//    }
    @RequestMapping("/testbutton")
    private String a(){
        System.out.println("a");
        b();
        return "test";
    }

    private void b(){
        System.out.println("b");
    }
    @RequestMapping("/test")
    public String ttest() {
        return "test";
    }

//    public static void main(String[] args){
//        new test().a();
//    }
}
