package 컬렉션즈;


//emp 테이블 클래스
public class EmpVo {
	int empno; //사원 번호
	String ename; //사원이름
	String job;//직무
	String hiredate;//고용날쨔ㅏ
	int sal;//급여
	int deptno;//부서번호
	
	public EmpVo(int empno,String ename,String job,String hiredate,int sal,int deptno) {
		
		
		this.empno=empno; //사원 번호
		this.ename=ename; //사원이름
		this.job=job;//직무
		this.hiredate=hiredate;//고용날쨔ㅏ
		this.sal=sal;//급여
		this.deptno=deptno;//부서번호
		
		
		
		
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
