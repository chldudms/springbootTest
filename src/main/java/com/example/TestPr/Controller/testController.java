package com.example.TestPr.Controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.Math.*;

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

    @PostMapping("/input5_result")
    public String result5(@RequestParam("nums") int[] nums){
            int odd=0;
            int even=0;
        System.out.println(nums[0]);

            for(int i=0;i<nums.length;i++){
                if(nums[i]%2==0) even++;
                else odd++;
            }

        System.out.println("evenCnt "+even);
        System.out.println("oddCnt "+odd);

        return "result";
    }

    @GetMapping("6")
    public String test6(){ return "test6"; }

    @PostMapping("/input6_result")
    public String result6(@RequestParam("num") int[] num){
            int sum =0;
            int avg = 0;

        int max= Math.max(num[0], num[1]);
        int min = Math.min(num[0],num[1]);

        for(int i=min;i<=max;i++){
            if(i%3==0||i%5==0){
                sum+=i;
                avg++;
            }
        }
        avg = sum/avg;

        System.out.println("sum:"+sum);
        System.out.println("avg:"+avg);

        return "result";
    }

    @GetMapping("7")
    public String test7(){

            return "test7";
    }

    @PostMapping("/input7_result")
    public String result7(@RequestParam("num") int num){

            for(int i=num;i <10; i++){
                System.out.println(num*i);
            }

            return "result";
    }

}
