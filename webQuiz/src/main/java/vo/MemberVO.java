package vo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberVO {
	
	private int no;
	private String id;
	private String pw;
	private String name;
	private String sex;
	private String motive;
	private String zipcode;
	
	
	public MemberVO(String id, String pw, String name, String sex, String motive, String zipcode) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.sex = sex;
		this.motive = motive;
		this.zipcode = zipcode;
	}

	
}
