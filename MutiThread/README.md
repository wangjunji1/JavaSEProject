### 现在的百分之百的操作系统都支持多任务的执行
### 对于计算来说，每一个任务就是一个进程（Process）,每个进程内部到少有一个线程
### 有进候也称为轻量级的时程
### 线程是程序执行的一个路径，每个线程都有自已的局部变量表，程序计数器（指向正在执行的）
### 指令指针以及各自的生命周期
### 操作系统中一般不止一个线程在运行，当启动了一个java虚拟机，从操作系统开始就会创建一个
### 新的进程（JVM进程）

### Jconsole 或者jstack命令来看

#####创建一个thread并且启动，
线程的生命周期
每个线程都有自已的局部变量表，程序计数器，以及生命周期，本节就来分析一下线程的生命周期

线程的生命周期详解：
    前面提过，每一个线程都有自已
    
线程的New状态
    当我们用关键字，new 创建

