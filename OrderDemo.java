package com.ithm.demo4;

import java.util.Scanner;

public class OrderDemo {
    public static void main(String[] args) {
        //顺序结构,是Java的默认结构,代码从上向下按步骤执行

        //分支结构
        //  if
        /*
        格式: if(关系表达式1){
                语句体;
                 }else if(关系表达式2){
                 语句体;
                 }
                 .....
                 else{
                 语句体;
                 }
         */
        //键盘录入实现一个if循环
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        int num = sc.nextInt();
        if (num > 20) {        //程序会根据你输入的数字与20比较 如果结果为ture,程序会运行if语句里的代码
            System.out.println("您输入的比20大");
        } else {         //if判断时结果是false 那就会执行else里的语句
            System.out.println("您输入的比20小");
        }


        //if语句注意事项:在语句体中如果只有一句代码 "{}" 可以省略不写, 个人建议不要省略.
        //如果对一个布尔类型的变量进行判断, 建议不要用"=="号,直接把变量写在小括号中


        //分支结构
        /*swich(表达式){  //
            case 值1:     // 值不能是变量
                语句体;
                break;
            case 值2:
                语句体;
                break;
            case 值3:
                语句体;
                break;
            default:
                 语句体;
                 break;
        }

        swich的其他知识点:
                default的位置和省略情况:
                    default可以省略:省略时swich语句中没有匹配时,不会执行swich中的任何语句.
                    default可以写在swich中的任意位置,一般都写在最下面.
                case穿透:
                    语句体中没有写break导致的,程序没有找到break时会继续向下执行直到找到break或大括号为止
                    使用场景:如果多个case对应的语句体一样使用case穿透
                swich新特性:
                    JDk12以后:简化swich书写
                    int num =1
                    swich(num){  //如果有多条语句需要用"{}"括起来,使用case穿透时 case的值可以是多个用","分开
                    case 1->System.out.println("一");
                    case 2->System.out.println("二");
                    case 3->System.out.println("三");
                    default ->System.out.println("没有这种选项");
                    }

      swich和if--else if---else的使用场景:
          swich 把有限个数据一一列举出来,让我们选择
          if--else if---else  一般用于范围的判断
         */

        //循环结构

        /*
          在实际开发中需要重复执行某段业务逻辑可以使用循环
          在实际开发中如果要获取某个范围的数据可以用到循环
            for 循环
            格式: for(初始化语句;条件判断语句;条件控制语句){
                    循环体;
                  }
            正序输出:
                for(int i=1;i<=length;i++)  {
                    System.out.println(i);
                }

            倒序输出:
                 for(int i=length;i>=1;i--)  {
                    System.out.println(i);
                }
            for 循环
            格式:
                初始化语句;
                while(条件判断语句){  //判断的结果为假才会结束循环
                循环体语句;
                条件控制语句;
                }

             for循环与while循环对比:
                运行规则都一样;
                区别就是 :while循环的初始化语句可以作用于全局,(不知道循环次数和范围,只知道循环条件用while)
                          for循环的初始化语句是作用于for循环里(知道循环次数或者循环范围用for)

            do-while循环(一定执行一次,在进行while判断)
            格式:
            初始化语句;
                do{
                循环体语句;
                条件控制语句;
                }while(条件判断语句)//判断的结果为假才会结束循环

         */

    }
}
