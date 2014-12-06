//static修饰的是类方法

/* 实例方法当类的字节码文件被加载到内存时，类的实例方法不会被分配入
口地址，当该类创建对象后，类中的实例方法才分配入口地址，从而实例
方法可以被类创建的任何对象调用执行。 */

/* 类中的类方法，在该类被加载到内存时，就分配了相应的入口地址。从而类
方法不仅可以被类创建的任何对象调用执行，也可以直接通过类名调用。类
方法的入口地址直到程序退出才被取消。 */

/* 类中的类方法不可以操作实例变量，也不可以调用实例方法，这是因为在类创
建对象之前，实例成员变量还没有分配内存，而且实例方法也没有入口地址
 */
public class ShiliTest{
	int x,y;
	static float a=f();
	
	static float f(){//类方法
		System.out.println("输ru");
		return 1;//两者顺序不能变
	}
	static float f(int a){//类方法
		System.out.println("输ru");
		return 1;//两者顺序不能变
	}
	float g(int x1,int x2){// 实例方法
	return 2;
	
	}
	void info(){
		System.out.println("输出");
	}
}