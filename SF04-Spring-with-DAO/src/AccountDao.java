//AccountDao.java
public interface AccountDao {
	
	// interface
	public void save(Account account);
	public void update(Account accout);
	public void remove(int accno);
	public Account get(int accno);

}