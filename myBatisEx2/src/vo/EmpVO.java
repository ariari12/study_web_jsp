package vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpVO {
	int empno;
	String ename;
	String job;
	int mgr;
	String hiredate;
	int sal;
	int comm;
	int deptno;

}
