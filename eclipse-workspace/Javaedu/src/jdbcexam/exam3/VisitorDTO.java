package jdbcexam.exam3;

public class VisitorDTO {     // 부모 클래스 dto
	private int id;	
	private String name;
	private String writeDate;
	private String memo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	@Override
	public String toString() {    // 문자열 값 메서드(object) <- 최상위
		return "[id="+id+", name=" + name + ", writeDate=" + writeDate + ", memo=" + memo + "]";
	}	
}
