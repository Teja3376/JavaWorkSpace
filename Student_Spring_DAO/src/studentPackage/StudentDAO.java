package studentPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

public class StudentDAO implements StudentInterface {
	private DataSource datasource;
	
	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	@Override
	public void save(StudentBean bean) {
			Connection conn = null;
			PreparedStatement ptst = null;
			try {
				conn = datasource.getConnection();
				ptst = conn.prepareStatement("insert into SPRING_STUDENT values (?,?,?)");
				ptst.setInt(1, bean.getSno());
				ptst.setString(2, bean.getSname());
				ptst.setInt(3,bean.getSage());
				ptst.execute();
			} catch (Exception  e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				try {
					ptst.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		
	}	
	
	

}
