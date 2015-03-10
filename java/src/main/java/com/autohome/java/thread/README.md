Java线程的创建和启动
一. java 线程的线程创建有三种方法
	1. 继承Thread类创建线程
	2. 实现Runnable接口创建线程
	3. 使用 Callable和Future创建线程
	从Java5开始提供Callable接口, 该接口怎么看都像是Runnable接口的增强版, callable接口提供了一个call方法可以作为线程的执行体, 但call()方法比run()方法功能更强大.
	call()方法可以有返回值
	call()方法可以声明抛出异常
	Java5提供了Future接口来代表Callable接口里call()方法的返回值, 并为Future接口提供一个FutureTask实现类, 该实现类实现了Future接口, 可以作为Thread类的target.
	Future接口提供了如下几个方法控制它关联的Callable任务:
		A)  V get(): 返回call()方法的返回值, 该方法将导致程序阻塞, 必须等到子线程结束后才会得到返回值.
		B)  V get(long timeout, TimeUnit unit): 回call()方法的返回值，最多等待指定时间，如果在指定时间Callable仍然没有返回值，将会抛出TimeoutException。
		C)  boolean isCancelled():如果在Callable任务正常完成前被取消，则返回true。
		D)  boolean isDone():如果Callable任务已完成，则返回true。