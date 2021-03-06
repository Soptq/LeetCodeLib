/*
https://leetcode-cn.com/problems/roman-to-integer/description/

罗马数字包含以下七种字符：I， V， X， L，C，D 和 M。

字符          数值
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。

通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：

I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。

示例 1:

输入: "III"
输出: 3
示例 2:

输入: "IV"
输出: 4
示例 3:

输入: "IX"
输出: 9
示例 4:

输入: "LVIII"
输出: 58
解释: C = 100, L = 50, XXX = 30, III = 3.
示例 5:

输入: "MCMXCIV"
输出: 1994
解释: M = 1000, CM = 900, XC = 90, IV = 4.
*/

class Solution {
    public int romanToInt(String s) {
        int length = s.length();
        int output = 0;
        //当只有一个字符的时候直接输出
        if (length == 1){
            switch (s){
                case "I":
                    output += 1;
                    break;
                case "V":
                    output += 5;
                    break;
                case "X":
                    output += 10;
                    break;
                case "L":
                    output += 50;
                    break;
                case "C":
                    output += 100;
                    break;
                case "D":
                    output += 500;
                    break;
                case "M":
                    output += 1000;
                    break;
            }
            return output;
        }
        //下面考虑的情况是有多个字符的组合问题
        char here,there;
        for (int i = 0;i < length - 1;i++){
            here = s.charAt(i);
            there = s.charAt(i+1);
            if (here == 'I') {
                if (there == 'V'){
                    output += 4;
                    //如果匹配成功，指针直接跳过下一位
                    i++;
                } else if (there == 'X'){
                            output += 9;
                            i++;
                        } else output += 1;
            }
            if (here == 'V') output += 5;
            if (here == 'X') {
                if (there == 'L'){
                    output += 40;
                    i++;
                } else if (there == 'C'){
                            output += 90;
                            i++;
                        } else output += 10;
            }
            if (here == 'L') {
                output += 50;
            }
            if (here == 'C') {
                if (there == 'D'){
                    output += 400;
                    i++;
                } else  if (there == 'M'){
                            output += 900;
                            i++;
                        }else output += 100;
            }
            if (here == 'D') {
                output += 500;
            }
            if (here == 'M') {
                output += 1000;
            }
        }
        //单独考虑最后一个字符
        there = s.charAt(length - 2);
        here = s.charAt(length - 1);
        if (here == 'V' && there == 'I' || here == 'X' && there == 'I' ||
           here == 'L' && there == 'X' || here == 'C' && there == 'X' ||
           here == 'D' && there == 'C' || here == 'M' && there == 'C'){
            return output;
        }else {
            switch (here){
                case 'I':
                    output += 1;
                    break;
                case 'V':
                    output += 5;
                    break;
                case 'X':
                    output += 10;
                    break;
                case 'L':
                    output += 50;
                    break;
                case 'C':
                    output += 100;
                    break;
                case 'D':
                    output += 500;
                    break;
                case 'M':
                    output += 1000;
                    break;
            }
        }
            
        return output;
        
    }
}