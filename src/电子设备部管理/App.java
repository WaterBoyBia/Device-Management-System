package �����豸������;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    	 //�ֱ𴴽����Ժ��ֻ��ļ���
    	ArrayList<Computer> PC = new ArrayList<Computer>();
        ArrayList<Phone> MP = new ArrayList<Phone>();
        Scanner sc = new Scanner(System.in);
        while (true) {
        	//��ʼ����
            System.out.println("��ӭ�����������豸����ϵͳ��");
            System.out.println("[1]��ӵ�����Ϣ");
            System.out.println("[2]ɾ��������Ϣ");
            System.out.println("[3]�޸ĵ�����Ϣ");
            System.out.println("[4]�鿴ָ��������Ϣ");
            System.out.println("[5]�鿴���е�����Ϣ");
            System.out.println("[6]����ֻ���Ϣ");
            System.out.println("[7]ɾ���ֻ���Ϣ");
            System.out.println("[8]�޸��ֻ���Ϣ");
            System.out.println("[9]�鿴ָ���ֻ���Ϣ");
            System.out.println("[10]�鿴�����ֻ���Ϣ");
            System.out.println("[0]�˳�");
            System.out.println("���������ѡ��");
            Scanner number = new Scanner(System.in);
            int num = number.nextInt();
          //����������ѡ����
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
                    System.out.println("��ӭ�´�ʹ��");
                    System.exit(0);
            }
        }
    }
    public static void addComputer(ArrayList<Computer> PC) {
    	 Scanner sc = new Scanner(System.in); 
    	//�½�һ��Computer����Pc��װȡ����ĵ�����Ϣ
         Computer Pc = new Computer();
         System.out.println("������Ʒ��");
         Pc.setName(sc.next());
         System.out.println("����������");
         Pc.setWeight(sc.nextInt());
         System.out.println("������۸�");
         Pc.setPrice(sc.nextInt());
         System.out.println("������ĵ���");
         Pc.setPowerConsumption(sc.nextInt());
         System.out.println("������������");
         Pc.setManufacturer(sc.next());
         System.out.println("�������ڴ��С");
         Pc.setMemory(sc.nextInt());
         System.out.println("������CPU�ͺ�");
         Pc.setCPU(sc.next());
       //���¶��������Լ���
         PC.add(Pc);
        System.out.println("������Ϣ��ӳɹ���\n");
    }
	public static void deleteComputer(ArrayList<Computer> PC) {
        Scanner sc = new Scanner(System.in);
        int p=0;
        if(PC.size()==0) {//��������ȱ�ٶ���
        	System.out.println("����Ϣ������ӣ�\n");
        }else {
	        System.out.println("������Ҫɾ����Ʒ����");
	        String nameX = sc.next();
	        for (int i = 0; i < PC.size(); i++) {//�������飬�ҵ�ָ���Ķ���
	            if (nameX.equals(PC.get(i).GetName())) {
	            	p++;
	            	//�ڼ�����ɾ��ָ���Ķ���
	                PC.remove(i);
	            }
	        }
	        if(p==0) {//��������ȱ��ָ���Ķ���
	        	System.out.println("��Ǹ��δ�ҵ�ƥ����Ϣ\n");
	        }else {
		        System.out.println("ɾ��������Ϣ�ɹ�\n");
		    }
        }
	}
    public static void updateComputer(ArrayList<Computer> PC) {
        Scanner sc = new Scanner(System.in);
        int p=0;
        if(PC.size()==0) {//��������ȱ�ٶ���
         	System.out.println("����Ϣ������ӣ�\n");
        }else {
        	System.out.println("������Ҫ�޸ĵ�Ʒ��");
	        String NAme = sc.next();
	        for (int i = 0; i < PC.size(); i++) {//�������飬�ҵ�ָ���Ķ���
	            if (NAme.equals(PC.get(i).GetName())) 
	            {//����ָ���Ķ���
	            	p++;
	                System.out.println("�������޸ĺ��Ʒ��");
	                PC.get(i).setName(sc.next());
			        System.out.println("�������޸ĺ������");
			        PC.get(i).setWeight(sc.nextInt());
			        System.out.println("�������޸ĺ�ļ۸�");
			        PC.get(i).setPrice(sc.nextInt());
			        System.out.println("�������޸ĺ�ĺĵ���");
			        PC.get(i).setPowerConsumption(sc.nextInt());
			        System.out.println("�������޸ĺ��������");
			        PC.get(i).setManufacturer( sc.next());
			        System.out.println("�������޸ĺ���ڴ��С");
			        PC.get(i).setMemory(sc.nextInt());
			        System.out.println("�������޸ĺ��CPU�ͺ�");
			        PC.get(i).setCPU(sc.next());
			        System.out.println();
	            }
	        } 
	        if(p==0) {//��������ȱ��ָ���Ķ���
	        	System.out.println("��Ǹ��δ�ҵ�ƥ����Ϣ\n");
	        }else{
	        	System.out.println("�޸ĵ�����Ϣ�ɹ�\n");
	        }
	    } 
    }
    public static void findComputer(ArrayList<Computer> PC) {
        //System.out.println("����\t\t�۸�\t\t�ĵ���\t\t������\t\t\t�ڴ��С\t\tCPU�ͺ�");
    	 Scanner sc = new Scanner(System.in);
    	 int p=0;
        if (PC.size() == 0) {//��������ȱ�ٶ���
            System.out.println("����Ϣ������ӣ�\n");
        }else {
        	System.out.println("������Ҫ���ҵ�Ʒ��");
	        String NAme = sc.next();
	        for (int i = 0; i < PC.size(); i++) {//�������ϣ����ָ���Ķ���
		        if (NAme.equals(PC.get(i).GetName())) 
	            {
		        	p++;
		        	PC.get(i).getinformation();
		            System.out.println("\n");
	            }
	        }
	        if(p==0) {//��������ȱ��ָ���Ķ���
	        	System.out.println("��Ǹ��δ�ҵ�ƥ����Ϣ\n");
	        }
        }
    }
    public static void findAllComputer(ArrayList<Computer> PC) {
        //System.out.println("����\t\t�۸�\t\t�ĵ���\t\t������\t\t\t�ڴ��С\t\tCPU�ͺ�");
        if (PC.size() == 0) {//��������ȱ�ٶ���
            System.out.println("����Ϣ������ӣ�\n");
        }else {
	        for (int i = 0; i < PC.size(); i++) {//�������ϣ�������еĶ���
	            System.out.println("��" + (i + 1) + "���Ե���Ϣ���£�");
	            PC.get(i).getinformation();
	            System.out.println("\n");
	        }
        }
    }
    public static void addPhone(ArrayList<Phone> MP) {
        Scanner sc = new Scanner(System.in); 
      //�½�һ��Phone����Mp��װȡ������ֻ���Ϣ
        Phone Mp = new Phone();
        System.out.println("������Ʒ��");
        Mp.setName(sc.next());
        System.out.println("����������");
        Mp.setWeight(sc.nextInt());
        System.out.println("������۸�");
        Mp.setPrice(sc.nextInt());
        System.out.println("������ĵ���");
        Mp.setPowerConsumption(sc.nextInt());
        System.out.println("������������");
        Mp.setManufacturer(sc.next());
        System.out.println("�����봢���С");
        Mp.setDisk(sc.nextInt());
        System.out.println("���������ϵͳ");
        Mp.setOS(sc.next());
      //���¶�������ֻ�����
        MP.add(Mp);
        System.out.println("�ֻ���Ϣ��ӳɹ���\n");
    }
    public static void deletePhone(ArrayList<Phone> MP) {
        Scanner sc = new Scanner(System.in);
        int p=0;
        if(MP.size()==0) {//��������ȱ�ٶ���
        	System.out.println("����Ϣ������ӣ�\n");
        }else {
	        System.out.println("������Ҫɾ����Ʒ����");
	        String nameX = sc.next();
	        for (int i = 0; i < MP.size(); i++) {//�������飬�ҵ�ָ���Ķ���
	            if (nameX.equals(MP.get(i).GetName())) {
	            	p++;
	            	//�ڼ�����ɾ��ָ���Ķ���
	                MP.remove(i);
	            }
	        }
	        if(p==0) {//��������ȱ��ָ���Ķ���
	        	System.out.println("��Ǹ��δ�ҵ�ƥ����Ϣ\n");
	        }else {
		        System.out.println("ɾ���ֻ���Ϣ�ɹ�\n");
		    }
	    }
	}
    public static void updatePhone(ArrayList<Phone> MP) {
   	 Scanner sc = new Scanner(System.in);
   	 int p=0;
   	 if(MP.size()==0) {//��������ȱ�ٶ���
        	System.out.println("����Ϣ������ӣ�\n");
        }else {
	         System.out.println("������Ҫ�޸ĵ�Ʒ��");
	         String NAme = sc.next();
	         for (int i = 0; i < MP.size(); i++) {//�������飬�ҵ�ָ���Ķ���
	             if (NAme.equals(MP.get(i).GetName())) 
	             {//����ָ���Ķ���
	            	 p++;
	            	 System.out.println("�������޸ĺ��Ʒ��");
	                 MP.get(i).setName(sc.next());
	 		         System.out.println("�������޸ĺ������");
	 		         MP.get(i).setWeight(sc.nextInt());
	 		         System.out.println("�������޸ĺ�ļ۸�");
	 		         MP.get(i).setPrice(sc.nextInt());
	 		         System.out.println("�������޸ĺ�ĺĵ���");
	 		         MP.get(i).setPowerConsumption(sc.nextInt());
	 		         System.out.println("�������޸ĺ��������");
	 		         MP.get(i).setManufacturer( sc.next());
	 		         System.out.println("�������޸ĺ�Ĵ洢��С");
	 		         MP.get(i).setDisk(sc.nextInt());
	 		         System.out.println("�������޸ĺ�Ĳ���ϵͳ");
	 		         MP.get(i).setOS(sc.next());
	 		        System.out.println();
	             }
	         }
	         if(p==0) {//��������ȱ��ָ���Ķ���
		        	System.out.println("��Ǹ��δ�ҵ�ƥ����Ϣ\n");
		     }else{
		        System.out.println("�޸ĵ�����Ϣ�ɹ�\n");
		     }
	    }
	}  
    public static void findPhone(ArrayList<Computer> MP) {
        //System.out.println("����\t\t�۸�\t\t�ĵ���\t\t������\t\t\t�ڴ��С\t\tCPU�ͺ�");
    	 Scanner sc = new Scanner(System.in);
    	 int p=0;
        if (MP.size() == 0) {//��������ȱ�ٶ���
            System.out.println("����Ϣ������ӣ�\n");
        }else {
        	System.out.println("������Ҫ���ҵ�Ʒ��");
	        String NAme = sc.next();
	        for (int i = 0; i < MP.size(); i++) {//�������ϣ����ָ���Ķ���
		        if (NAme.equals(MP.get(i).GetName())) 
	            {
		        	p++;
		        	MP.get(i).getinformation();
		            System.out.println("\n");
	            }
	        }
	        if(p==0) {//��������ȱ��ָ���Ķ���
	        	System.out.println("��Ǹ��δ�ҵ�ƥ����Ϣ\n");
	        }
        }
    }
    public static void findAllPhone(ArrayList<Phone> MP) {
        //System.out.println("����\t\t�۸�\t\t�ĵ���\t\t������\t\t\t�ڴ��С\t\tCPU�ͺ�");
        if (MP.size() == 0) {//��������ȱ�ٶ���
            System.out.println("����Ϣ������ӣ�\n");
        }else {
	        for (int i = 0; i < MP.size(); i++) {//�������ϣ�������еĶ���
	             System.out.println("��" + (i + 1) + "�ֻ�����Ϣ���£�");
	             MP.get(i).getinformation();
	             System.out.println("\n");
	        }
	    }
	}

}