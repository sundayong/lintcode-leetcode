# lintcode
动态规划理解及关键点总结：
    1.理清逻辑，在理论上划分多种情况，此时可以不用想具体编码实现
    2.当n=0，算出f(x)，当n=1，算出f（x）,进而列出动态方程
    3.编码实现，用循环或者递归，可以用数组存储每个f(x)的值，以便获取f(x-n)的值 