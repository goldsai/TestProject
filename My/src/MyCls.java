import client.ClsClient;
<<<<<<< HEAD

=======
import httpClientV2.*;
>>>>>>> refs/heads/feature_add_client
public class MyCls {
	private int val;
	private String name;
	private String firstName;
	/**
	 * @return the client
	 */
	public ClsClient getClient() {
		return client;
	}
	/**
	 * @param client the client to set
	 */
	public void setClient(ClsClient client) {
		this.client = client;
	}
	private ClsClient client;
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
	/**
	 * @return the server
	 */
	public ServerV2 getServer() {
		return server;
	}
	/**
	 * @param server the server to set
	 */
	public void setServer(ServerV2 server) {
		this.server = server;
	}
	
}