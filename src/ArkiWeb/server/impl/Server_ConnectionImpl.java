/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.server.impl;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import ArkiWeb.server.Server_Connection;

/**
 * @author JTE
 *
 */
public class Server_ConnectionImpl implements Server_Connection {

	private Connection connection = null;
	private Statement statememnt = null;
	private ResultSet results = null;
	private String url;
	private String user;
	private String password;
	
	/**
	 * 
	 */
	public Server_ConnectionImpl(String url, String user, String password) {
		this.setUrl(url);
		this.setUser(user);
		this.setPassword(password);
	}

	/**
	 * @return the connection
	 */
	public Connection getConnection() {
		return connection;
	}

	/**
	 * @param connection the connection to set
	 */
	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	/**
	 * @return the statememnt
	 */
	public Statement getStatememnt() {
		return statememnt;
	}

	/**
	 * @param statememnt the statememnt to set
	 */
	public void setStatememnt(Statement statememnt) {
		this.statememnt = statememnt;
	}

	/**
	 * @return the results
	 */
	public ResultSet getResults() {
		return results;
	}

	/**
	 * @param results the results to set
	 */
	public void setResults(ResultSet results) {
		this.results = results;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void serverConnect() {
		
		try {
			Driver driver = null;
			try {
				driver = (Driver) Class.forName("org.hsqldb.jdbc.JDBCDriver").newInstance();
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Properties props = new Properties();
			props.setProperty("user", user);
			props.setProperty("password", password);
			
			this.setConnection(driver.connect(url, props));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void serverDisconnect() {
		
		try {
			this.getConnection().close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setConnection(null);
		
	}

	@Override
	public void serverSetStatement() {
		
		try {
			this.setStatememnt(this.getConnection().createStatement());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void serverCloseStatement() {
		
		try {
			this.getStatememnt().close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setStatememnt(null);
		
	}

	@Override
	public void serverResultSet(String queryString) {
		
		try {
			this.setResults(this.getStatememnt().executeQuery(queryString));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void serverCloseResultSet() {
		
		try {
			if(this.getResults() != null) {
				this.getResults().close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setResults(null);
		
	}

		
}
