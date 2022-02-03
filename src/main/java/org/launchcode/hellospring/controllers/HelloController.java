package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")

public class HelloController {

    //Handles request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

    // lives /hello/goodbye
//    @GetMapping("goodbye")
//    public String goodbye() {
//        return "Goodbye, Spring!";
//    }
//
//    // lives /hello/hello
//    // Handles request of the form /hello?name=LaunchCode
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
//    public String helloWithQueryParam(@RequestParam String name) {
//        return "Hello, " + name + "!";
//    }

    @GetMapping("{name}", "{language")
    public String createMessage(@PathVariable String name, String language) {
        if (language.equals("Japanese")) {
            return "こんにちは, " + name + "!";
        } else if (language.equals("Spanish")) {
            return "Hola, " + name + "!";
        } else if (language.equals("Italian")) {
            return "Ciao, " + name + "!";
        } else {
            return "--Select language--";
        }
    }

//
//    // Handles request of the form /hello/LaunchCode
//    @GetMapping("{name}")
//    public String helloWithPathParam(@PathVariable String name) {
//        return "Hello, " + name + "!";
//    }

//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
//    public static void createMessage(@RequestParam String name, String language) {
//        if (language.equals("Japanese")) {
//            System.out.println("こんにちは, " + name + "!");
//        } else if (language.equals("Spanish")) {
//            System.out.println("Hola, " + name + "!");
//        } else if (language.equals("Italian")) {
//            System.out.println("Ciao, " + name + "!");
//        } else {
//            System.out.println("--Select language--");
//        }
//    }



    // /hello/form
    @GetMapping("form")
    public String helloForm() {
        return "<html>" +
                    "<body>" +
                    "<form action='hello' method='post'>" + //submit a request to /hello
                        "<input type='text' name='name'>" +
                            "<select name='language'>" +
                                "<option value='Language' selected>" +
                                "Language" +
                                "</option>" +
                                "<option value='Japanese'>" +
                                "Japanese" +
                                "</option>" +
                                "<option value='Spanish'>" +
                                "Spanish" +
                                "</option>" +
                                "<option value='Italian'>" +
                                "Italian" +
                                "</option>" +
                            "</select>" +
                        "<input type='submit' value='Greet me!'>" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }
}
