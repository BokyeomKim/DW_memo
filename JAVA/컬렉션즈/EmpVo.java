package �÷�����;


//emp ���̺� Ŭ����
public class EmpVo {
	int empno; //��� ��ȣ
	String ename; //����̸�
	String job;//����
	String hiredate;//��볯¹��
	int sal;//�޿�
	int deptno;//�μ���ȣ
	
	public EmpVo(int empno,String ename,String job,String hiredate,int sal,int deptno) {
		
		
		this.empno=empno; //��� ��ȣ
		this.ename=ename; //����̸�
		this.job=job;//����
		this.hiredate=hiredate;//��볯¹��
		this.sal=sal;//�޿�
		this.deptno=deptno;//�μ���ȣ
		
		
		
		
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
}
