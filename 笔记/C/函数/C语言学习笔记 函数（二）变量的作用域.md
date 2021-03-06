- **一个包括多个函数的程序，变量在什么时间那些地方可以用？**

## 什么地方？

源程序是编译的基本单位，而一个源程序可能有多个函数。而在不同位置定义的变量，使用范围又有不同。

定义变量可能有三种情况：

1. 在函数的开头定义
2. 在函数的内部定义
3. 在函数内部复合体内定义

### 局部变量

2和3是局部变量

2在定义的该函数内有效

3在定义的复合体内有效

### 全局变量

1是全局变量

可以为程序中的所有函数所共用

> 不建议使用全局变量
> 
> - 全局变量占用内存单元时间过长，不是需要时才开辟
> - 降低了函数的通用性，函数中引用的全局变量受到函数的影响
> - 全局变量难以判断具体值是多少

## 什么时间?

程序包括：

- 源代码
- 数据

不同的数据可能存在的时间不同

### 动态

- 函数形式参数
- 局部变量（没有static修饰）
- 函数调用的现场保护和返回地址

以上数据随函数调用动态分配内存空间也就是动态存储变量。

### 静态

全局变量是程序运行开始到程序结束由系统分配的固定的内存空间。

## 变量存储类别

数据是存储在内存当中，在内存中又划分为不同的类别。

1. 自动的（auto）
2. 静态的（static）
3. 寄存器（register）
4. 外部的（extern）

前三种都是针对局部变量，第四种是针对全局变量

1当不声明存储类别，局部变量默认为此，随函数变化

2局部变量被存储在静态变量区，在编译时变量已赋值，直到程序结束释放

3数据一般存储在内存中然后在CPU中处理，而一些极其常用的数据可以存储在CPU的寄存器中

4一个程序可以有多个源程序，而想要全局变量被其他源程序调用可以使用extern修饰
