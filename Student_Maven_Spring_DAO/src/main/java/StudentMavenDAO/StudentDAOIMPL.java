package StudentMavenDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

public class StudentDAOIMPL implements StudentInterface {
	Connection conn= null;
	PreparedStatement ptst = null;
	private DataSource datasource;
	public DataSource getDatasource() {
		return datasource;
	}
	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}
	@Override
	public void save(StudentBean bean) {
		try {
			conn = datasource.getConnection();
			ptst = conn.prepareStatement("insert into SPRING_STUDENT values (?,?,?)");
			ptst.setInt(1, bean.getSno());
			ptst.setString(2, bean.getSname());
			ptst.setInt(3,bean.getSage());
			ptst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
