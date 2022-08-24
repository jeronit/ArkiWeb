/**
 * 	@purpose:	Interface to manage Server Connection
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.server;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author JTE
 *
 */
public interface Server_Connection {

	/**
	 * Server connect.
	 */
	void serverConnect();
	
	/**
	 * Server disconnect.
	 */
	void serverDisconnect();
	
	/**
	 * Server set statement.
	 *
	 * @param con the con
	 * @return the statement
	 */
	void serverSetStatement();
	
	/**
	 * Server close statement.
	 */
	void serverCloseStatement();
	
	/**
	 * Server result set.
	 *
	 * @param stmnt the stmnt
	 */
	void serverResultSet(String queryString);
	
	/**
	 * Server close result set.
	 */
	void serverCloseResultSet();
}
