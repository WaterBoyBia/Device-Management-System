package 电子设备部管理;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    	 //分别创建电脑和手机的集合
    	ArrayList<Computer> PC = new ArrayList<Computer>();
        ArrayList<Phone> MP = new ArrayList<Phone>();
        Scanner sc = new Scanner(System.in);
        while (true) {
        	//开始界面
            System.out.println("欢迎来到《电子设备管理系统》");
            System.out.println("[1]添加电脑信息");
            System.out.println("[2]删除电脑信息");
            System.out.println("[3]修改电脑信息");
            System.out.println("[4]查看指定电脑信息");
            System.out.println("[5]查看所有电脑信息");
            System.out.println("[6]添加手机信息");
            System.out.println("[7]删除手机信息");
            System.out.println("[8]修改手机信息");
            System.out.println("[9]查看指定手机信息");
            System.out.println("[10]查看所有手机信息");
            System.out.println("[0]退出");
            System.out.println("请输入你的选择：");
            Scanner number = new Scanner(System.in);
            int num = number.nextInt();
          //输入数字来选择功能
            switch (num) {
                case 1:
                    addComputer(PC);
                    break;
                case 2:
                    deleteComputer(PC);
                    break;
                case 3:
                    updateComputer(PC);
                    break;
                case 4:
                    findComputer(PC);
                    break;    
                case 5:
                    findAllComputer(PC);
                    break;
                case 6:
                    addPhone(MP);
                    break;
                case 7:
                    deletePhone(MP);
                    break;
                case 8:
                    updatePhone(MP);
                    break;
                case 9:
                    findPhone(PC);
                    break;    
                case 10:
                    findAllPhone(MP);
                    break;
                case 0:
                    //break;
                    System.out.println("欢迎下次使用");
                    System.exit(0);
            }
        }
    }
    public static void addComputer(ArrayList<Computer> PC) {
    	 Scanner sc = new Scanner(System.in); 
    	//新建一个Computer对象Pc来装取输入的电脑信息
         Computer Pc = new Computer();
         System.out.println("请输入品名");
         Pc.setName(sc.next());
         System.out.println("请输入重量");
         Pc.setWeight(sc.nextInt());
         System.out.println("请输入价格");
         Pc.setPrice(sc.nextInt());
         System.out.println("请输入耗电量");
         Pc.setPowerConsumption(sc.nextInt());
         System.out.println("请输入制造商");
         Pc.setManufacturer(sc.next());
         System.out.println("请输入内存大小");
         Pc.setMemory(sc.nextInt());
         System.out.println("请输入CPU型号");
         Pc.setCPU(sc.next());
       //将新对象加入电脑集合
         PC.add(Pc);
        System.out.println("电脑信息添加成功！\n");
    }
	public static void deleteComputer(ArrayList<Computer> PC) {
        Scanner sc = new Scanner(System.in);
        int p=0;
        if(PC.size()==0) {//当集合中缺少对象
        	System.out.println("无信息，请添加！\n");
        }else {
	        System.out.println("请输入要删除的品名：");
	        String nameX = sc.next();
	        for (int i = 0; i < PC.size(); i++) {//遍历数组，找到指定的对象
	            if (nameX.equals(PC.get(i).GetName())) {
	            	p++;
	            	//在集合中删除指定的对象
	                PC.remove(i);
	            }
	        }
	        if(p==0) {//当集合中缺少指定的对象
	        	System.out.println("抱歉，未找到匹配信息\n");
	        }else {
		        System.out.println("删除电脑信息成功\n");
		    }
        }
	}
    public static void updateComputer(ArrayList<Computer> PC) {
        Scanner sc = new Scanner(System.in);
        int p=0;
        if(PC.size()==0) {//当集合中缺少对象
         	System.out.println("无信息，请添加！\n");
        }else {
        	System.out.println("请输入要修改的品名");
	        String NAme = sc.next();
	        for (int i = 0; i < PC.size(); i++) {//遍历数组，找到指定的对象
	            if (NAme.equals(PC.get(i).GetName())) 
	            {//更改指定的对象
	            	p++;
	                System.out.println("请输入修改后的品名");
	                PC.get(i).setName(sc.next());
			        System.out.println("请输入修改后的重量");
			        PC.get(i).setWeight(sc.nextInt());
			        System.out.println("请输入修改后的价格");
			        PC.get(i).setPrice(sc.nextInt());
			        System.out.println("请输入修改后的耗电量");
			        PC.get(i).setPowerConsumption(sc.nextInt());
			        System.out.println("请输入修改后的制造商");
			        PC.get(i).setManufacturer( sc.next());
			        System.out.println("请输入修改后的内存大小");
			        PC.get(i).setMemory(sc.nextInt());
			        System.out.println("请输入修改后的CPU型号");
			        PC.get(i).setCPU(sc.next());
			        System.out.println();
	            }
	        } 
	        if(p==0) {//当集合中缺少指定的对象
	        	System.out.println("抱歉，未找到匹配信息\n");
	        }else{
	        	System.out.println("修改电脑信息成功\n");
	        }
	    } 
    }
    public static void findComputer(ArrayList<Computer> PC) {
        //System.out.println("重量\t\t价格\t\t耗电量\t\t制造商\t\t\t内存大小\t\tCPU型号");
    	 Scanner sc = new Scanner(System.in);
    	 int p=0;
        if (PC.size() == 0) {//当集合中缺少对象
            System.out.println("无信息，请添加！\n");
        }else {
        	System.out.println("请输入要查找的品名");
	        String NAme = sc.next();
	        for (int i = 0; i < PC.size(); i++) {//遍历集合，输出指定的对象
		        if (NAme.equals(PC.get(i).GetName())) 
	            {
		        	p++;
		        	PC.get(i).getinformation();
		            System.out.println("\n");
	            }
	        }
	        if(p==0) {//当集合中缺少指定的对象
	        	System.out.println("抱歉，未找到匹配信息\n");
	        }
        }
    }
    public static void findAllComputer(ArrayList<Computer> PC) {
        //System.out.println("重量\t\t价格\t\t耗电量\t\t制造商\t\t\t内存大小\t\tCPU型号");
        if (PC.size() == 0) {//当集合中缺少对象
            System.out.println("无信息，请添加！\n");
        }else {
	        for (int i = 0; i < PC.size(); i++) {//遍历集合，输出所有的对象
	            System.out.println("第" + (i + 1) + "电脑的信息如下：");
	            PC.get(i).getinformation();
	            System.out.println("\n");
	        }
        }
    }
    public static void addPhone(ArrayList<Phone> MP) {
        Scanner sc = new Scanner(System.in); 
      //新建一个Phone对象Mp来装取输入的手机信息
        Phone Mp = new Phone();
        System.out.println("请输入品名");
        Mp.setName(sc.next());
        System.out.println("请输入重量");
        Mp.setWeight(sc.nextInt());
        System.out.println("请输入价格");
        Mp.setPrice(sc.nextInt());
        System.out.println("请输入耗电量");
        Mp.setPowerConsumption(sc.nextInt());
        System.out.println("请输入制造商");
        Mp.setManufacturer(sc.next());
        System.out.println("请输入储存大小");
        Mp.setDisk(sc.nextInt());
        System.out.println("请输入操作系统");
        Mp.setOS(sc.next());
      //将新对象加入手机集合
        MP.add(Mp);
        System.out.println("手机信息添加成功！\n");
    }
    public static void deletePhone(ArrayList<Phone> MP) {
        Scanner sc = new Scanner(System.in);
        int p=0;
        if(MP.size()==0) {//当集合中缺少对象
        	System.out.println("无信息，请添加！\n");
        }else {
	        System.out.println("请输入要删除的品名：");
	        String nameX = sc.next();
	        for (int i = 0; i < MP.size(); i++) {//遍历数组，找到指定的对象
	            if (nameX.equals(MP.get(i).GetName())) {
	            	p++;
	            	//在集合中删除指定的对象
	                MP.remove(i);
	            }
	        }
	        if(p==0) {//当集合中缺少指定的对象
	        	System.out.println("抱歉，未找到匹配信息\n");
	        }else {
		        System.out.println("删除手机信息成功\n");
		    }
	    }
	}
    public static void updatePhone(ArrayList<Phone> MP) {
   	 Scanner sc = new Scanner(System.in);
   	 int p=0;
   	 if(MP.size()==0) {//当集合中缺少对象
        	System.out.println("无信息，请添加！\n");
        }else {
	         System.out.println("请输入要修改的品名");
	         String NAme = sc.next();
	         for (int i = 0; i < MP.size(); i++) {//遍历数组，找到指定的对象
	             if (NAme.equals(MP.get(i).GetName())) 
	             {//更改指定的对象
	            	 p++;
	            	 System.out.println("请输入修改后的品名");
	                 MP.get(i).setName(sc.next());
	 		         System.out.println("请输入修改后的重量");
	 		         MP.get(i).setWeight(sc.nextInt());
	 		         System.out.println("请输入修改后的价格");
	 		         MP.get(i).setPrice(sc.nextInt());
	 		         System.out.println("请输入修改后的耗电量");
	 		         MP.get(i).setPowerConsumption(sc.nextInt());
	 		         System.out.println("请输入修改后的制造商");
	 		         MP.get(i).setManufacturer( sc.next());
	 		         System.out.println("请输入修改后的存储大小");
	 		         MP.get(i).setDisk(sc.nextInt());
	 		         System.out.println("请输入修改后的操作系统");
	 		         MP.get(i).setOS(sc.next());
	 		        System.out.println();
	             }
	         }
	         if(p==0) {//当集合中缺少指定的对象
		        	System.out.println("抱歉，未找到匹配信息\n");
		     }else{
		        System.out.println("修改电脑信息成功\n");
		     }
	    }
	}  
    public static void findPhone(ArrayList<Computer> MP) {
        //System.out.println("重量\t\t价格\t\t耗电量\t\t制造商\t\t\t内存大小\t\tCPU型号");
    	 Scanner sc = new Scanner(System.in);
    	 int p=0;
        if (MP.size() == 0) {//当集合中缺少对象
            System.out.println("无信息，请添加！\n");
        }else {
        	System.out.println("请输入要查找的品名");
	        String NAme = sc.next();
	        for (int i = 0; i < MP.size(); i++) {//遍历集合，输出指定的对象
		        if (NAme.equals(MP.get(i).GetName())) 
	            {
		        	p++;
		        	MP.get(i).getinformation();
		            System.out.println("\n");
	            }
	        }
	        if(p==0) {//当集合中缺少指定的对象
	        	System.out.println("抱歉，未找到匹配信息\n");
	        }
        }
    }
    public static void findAllPhone(ArrayList<Phone> MP) {
        //System.out.println("重量\t\t价格\t\t耗电量\t\t制造商\t\t\t内存大小\t\tCPU型号");
        if (MP.size() == 0) {//当集合中缺少对象
            System.out.println("无信息，请添加！\n");
        }else {
	        for (int i = 0; i < MP.size(); i++) {//遍历集合，输出所有的对象
	             System.out.println("第" + (i + 1) + "手机的信息如下：");
	             MP.get(i).getinformation();
	             System.out.println("\n");
	        }
	    }
	}

}