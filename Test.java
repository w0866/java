package com.ithm.demo4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //回文数
        //需求:给一个整数X,判断X是不是回文数 ,是 返回 true ,否则 返回 false
        //解析:回文数是从左到右和从右到左读都是一样的 例如:12321

        //思路:把数字倒过来跟原来的数字比较

        //键盘录入数据
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个整数:");
        //1.键盘输入数字
        int x = sc.nextInt();
        //定义一个临时变量temp存储x原来的值,用于比较
        int temp = x;
        //定义num存储倒过来之后的结果
        int num =0;
        //判断条件 :因为循环时x的值被改变了.假如x是123 当循环第三次时 x被第二次循环修改成1 了 第四次进循环时因为x被第三次循环修改成了0不满足退出循环
        while (x !=0){
            //从右往左获取每一位数()
            int ge = x%10;  //对10取余得到3
            //修改x的值
            x = x/10; // x/10是因为整数相除只能得到整数  123/10 =12....3,因为是得到整数所以修改为12
            //把当前获取的数字拼接到最右边
            num =num *10 +ge; //  第一次循环时num=0*10+3 =3  ,也可以看作是新数据的最前边那位
        }
        //打印num
        System.out.println(num);
        //比较
        System.out.println(num == temp);

    }
}
