
public class MyCls {
	private int val;
	private String name;
	private String firstName;
	
	/**
	 * @param val
	 * @param name
	 * @param firstName
	 */
	public MyCls(int val, String name, String firstName) {
		super();
		this.val = val;
		this.name = name;
		this.firstName = firstName;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the val
	 */
	public int getVal() {
		return val;
	}
	/**
	 * @param val the val to set
	 */
	public void setVal(int val) {
		this.val = val;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param val
	 * @param name
	 */
	public MyCls(int val, String name) {
		//super();
		this.val = val;
		this.name = name;
	}
	
}
