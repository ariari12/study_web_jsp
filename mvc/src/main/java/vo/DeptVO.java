package vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

// Value Object, POJO
//@Getter
//@Setter
@NoArgsConstructor
@AllArgsConstructor
//@ToString
@Data
public class DeptVO {
	private int deptno;
	private String dname;
	private String loc;	

}
