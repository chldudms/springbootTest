package com.example.TestPr.Controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class testController {
        @GetMapping("/")
        public String home(){
          return "index";
        }

    @GetMapping("1")
    public String test1(){
        return "test1";
    }


    @PostMapping("/sum1")
    public String sum1(@RequestParam("num") int[] numbers) {
        int evenSum = 0;
        int oddSum = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        System.out.println("evenSum: "+evenSum);
        System.out.println("oddSum: "+oddSum);

        return "result";
    }

    @GetMapping("2")
    public String test2(){
        return "test2";
    }

    @PostMapping("/input2_result")
    public String result(@RequestParam("num") int num){

      for(int i=1;i<=100;i++)      {
          if(i%num==0){
              System.out.println(i);
          }
      }

            return "result";
    }


    @GetMapping("3")
    public String test3(){
        return "test3";
    }

    @PostMapping("/input3_result")
    public String result3(@RequestParam("num") int[] num){
        int min = num[0];
        int max = num[1];

        for(int i=min;i<=max;i++){
            System.out.println(i);
        }

        return "result";
    }

    @GetMapping("4")
    public String test4(){
        return "test4";
    }

    @PostMapping("/input4_result")
    public String result4(@RequestParam("num") int num){
        int sum = 0;

        for(int i=1;i<=num;i++){
            System.out.println(i*5);
            sum+=i*5;
        }
        System.out.println(sum);

        return "result";
    }

    @GetMapping("5")
    public String test5(){
        return "test5";
    }
}
