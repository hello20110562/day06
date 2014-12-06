public class LeiTest{   //abstract class 时可以采用非静态??
	public static void main(String []args){
/*abstract class LeiTest{   
	public void main(String []args){*/
		ShiliTest al =new ShiliTest();
		ShiliTest.f(2);//f 类方法
		al.f(4);
		al.g(2,5);//实例方法
		al.info(); 
/* 类方法在类的字节码加载到内存时就分配了入口地址，因此，Java语言允许
类方法通过类名【直接】调用类方法，而实例方法【不能】通过类名调用。*/
		/*ShiliTest.g（1,2）;无法从静态上下文中引用非静态变量 
		g（int ,int）为实例方法;
		*/
	}
}