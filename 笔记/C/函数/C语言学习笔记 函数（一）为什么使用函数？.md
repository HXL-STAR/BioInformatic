> 模块化程序设计
> 
> 随着程序的开发，所需要的功能越来越多，其中有些功能是需要重复使用
> 
> 如果将代码只放在一个函数，会变得越来越复杂，不方便维护进一步开发
> 
> 所以将不同的功能分为各个函数，即降低复杂度又可以将单一功能重复调用不需要重复编写，在主函数调用

函数可以分为两类：

- 库函数

C语言编译系统不同，可能包含的函数种类不同

- 自定义函数

## 函数的定义

**C程序用到的函数必须先定义后使用**

### 库函数

库函数是由编译系统事先定义好的，不同的编译系统可能提供的库函数不同。

如果调用库函数需要在文件头部使用#include<>指令将库函数包含进来

### 自定义函数

函数主要包括：

- 函数名称
- 返回值类型
- 函数参数
- 函数体（功能实现）

## 调用函数

在函数调用前都需要对函数进行声明，将函数有关的信息通知编译系统。

定义函数就是为了对其调用

函数调用的一般形式为：

A（）;

如果有一个或多个参数：

B（a,b,c）;

### 参数传递

> 形参 实参
> 
> 程序是一架机器，参数就是原材料
> 
> 形参只有在函数调用时才有数据，是从外接收传递而来
> 
> 实参就是在函数调用时给出的数据
> 
> 数据传递过程是单向的只能有实参到形参

### 函数调用过程

C程序有一个或多个源程序文件，而源程序包含一个或多个函数，编译是以源程序为基本单位编译的。多个函数是平行的，互相独立的，不可以嵌套定义，并且C程序是从main函数开始的，其他函数不能调用main函数。

### 返回值

有时候函数执行完功能会需要返回一个值，也就是返回值。

在函数定义时，就定义了返回值的类型，在函数中通过return关键字将值返回调用函数。

如果不需要返回值，可以在定义时将其定义为void类型。
