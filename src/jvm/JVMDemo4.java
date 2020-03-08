package jvm;

public class JVMDemo4 {
	// -Xms20m -Xmx20m -XX:SurvivorRatio=2 -XX:+PrintGCDetails -XX:+UseSerialGC -XX:NewRatio=2
	//堆内存初始化值20m,堆内存最大值20m，新生代最大值可用1m，eden空间和from/to空间的比例为2/1,新生代和老年代的占比为1/2
	public static void main(String[] args){ // eden : s0 : s1= 4:1:1  young: 6 eden 4m
		// 虚拟机空闲内存
	    System.out.println(Runtime.getRuntime().freeMemory()/1024/1024+"M");
	    // 虚拟机最大可申请的内存
	    System.out.println(Runtime.getRuntime().maxMemory()/1024/1024+"M");
	    // 虚拟机当前最大内存，初始化内存
	    System.out.println(Runtime.getRuntime().totalMemory()/1024/1024+"M");
	    
	    System.out.println();
	}
	
}
