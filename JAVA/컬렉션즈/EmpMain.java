package �÷�����;

import java.util.ArrayList;

public class EmpMain {

	public static void main(String[] args) {

		ArrayList<EmpVo> list = new ArrayList<EmpVo>();
		list.add(new EmpVo(7369, "SMITH", "CLERK", "1980-12-17", 800, 20));
		list.add(new EmpVo(7499, "ALLEN", "SALESMAN", "1981-02-20", 1600, 30));
		list.add(new EmpVo(7521, "WARD", "SALESMAN", "1981-02-22", 1250, 30));
		list.add(new EmpVo(7566, "JONES", "MANAGER", "1981-04-02", 2975, 20));
		list.add(new EmpVo(7654, "MARTIN", "SALESMAN", "1981-09-28", 1250, 30));

		// �Ϲ�for��

		//2. �޿��� 1300�޷� �̻��� �޴� ����� �̸�,���� ��ȸ
		for(int i=0; i<list.size(); i++){
			if(list.get(i).sal >= 1300){
				System.out.println("============2��============");
				System.out.println("�̸� ==> "+list.get(i).ename);
				System.out.println("���� ==> "+list.get(i).job);
			}	
		}
		//3. ������ SALESMAN�� ��� �� �޿��� 1400�޷� �̻� �޴� ����� ��ȣ,�̸� ��ȸ
		for(int i=0; i<list.size(); i++){
			// �ڹٴ� ���ڸ� ���� �� equals(), �ڹٿ����� ���ڸ� ���� �� == ����ϸ� ���ڸ� ���ϴ°� �ƴ�.
			if(list.get(i).job.equals("SALESMAN") && list.get(i).sal >= 1400){
				System.out.println("============3��============");
				System.out.println("�̸� ==> "+list.get(i).ename);
				System.out.println("���� ==> "+list.get(i).job);
			}	
		}
		//4. �Ի�⵵�� 1981�⵵�� ����� ��ȣ,�̸� ��ȸ
		for(int i=0; i<list.size(); i++){
			String hireYear = list.get(i).hiredate.split("-")[0];
			if(hireYear.equals("1981")){
				System.out.println("============4��============");
				System.out.println("��ȣ ==> "+list.get(i).empno);
				System.out.println("�̸� ==> "+list.get(i).ename);
			}		
		}
		//5. ������ MANAGER�� ��� �� ��ȸ
		int managerCnt =0;
		for(int i=0; i<list.size(); i++){
			if(list.get(i).job.equals("MANAGER")){
				++managerCnt;
			}
		}
		System.out.println("============5��============");
		System.out.println("��� �� ==> "+managerCnt);
		//6. ��� �� �޿��� ���� ���� �޴� ����� ��ȣ,�̸�,�Ի�⵵ ��ȸ
		int maxSal = 0;
		int index = 0;
		for(int i=0; i<list.size(); i++){
			int sal = list.get(i).sal;
			if(maxSal < sal){
				maxSal = sal;
				index = i;
			}
		}
		System.out.println("============6��============");
		System.out.println("��ȣ ==> "+list.get(index).empno);
		System.out.println("�̸� ==> "+list.get(index).ename);
		System.out.println("�Ի糯¥ ==> "+list.get(index).hiredate);
		//7. �μ���ȣ�� �� ��ȸ ex) 20 : 2��, 30: 3��
		int deptno20 = 0;
		int deptno30 = 0;
		for(int i=0; i<list.size(); i++){
			if(list.get(i).deptno == 20){
				++deptno20;
			}
			if(list.get(i).deptno == 30){
				++deptno30;
			}	
		}	
		System.out.println("============7��============");
		System.out.println("20�μ� �� ==> "+deptno20);
		System.out.println("30�μ� ��==> "+deptno30);
		//8. �Ի���� 02���� ��� �� ��ȸ
		int month = 0;
		for(int i=0; i<list.size(); i++){
			String hireMonth = list.get(i).hiredate.split("-")[1];
			if(hireMonth.equals("02")){
				++month;
			}
		}	
		System.out.println("============8��============");
		System.out.println("��� �� ==> "+month);
	}
}