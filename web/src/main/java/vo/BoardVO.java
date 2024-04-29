package vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*create table board
  (BNO number(8) constraint board_bno_pk primary key,
  writer varchar2(20),
  title varchar2(200),
  contents clob,
  regdate date,
  hits number(5),
  ip char(16),
  status number(3));*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardVO {
	private int bno;
	private String writer;
	private String title;
	private String contents;
	private String regdate;
	private int hits;
	private String ip;
	private int status;

}
