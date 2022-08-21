/**
 * 	@purpose:	Interface para gestionar la instanciación de objetos
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.modelo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ArkiWeb.modelo.ModeloPackage#getFactory()
 * @model
 * @generated
 */
public interface Factory extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tipoObjetoDataType="org.eclipse.uml2.types.String" tipoObjetoRequired="true" tipoObjetoOrdered="false" _Required="true" _Ordered="false"
	 * @generated
	 */
	void crearObjeto(String tipoObjeto, Object _);

	/**
	 * <!-- begin-user-doc -->
	 * Se encarga de la instanciación de los distintos objetos
	 * <!-- end-user-doc -->
	 * @param			tipoObjeto			String			Objeto a crear
	 * @model tipoObjetoDataType="org.eclipse.uml2.types.String" tipoObjetoRequired="true" tipoObjetoOrdered="false"
	 * @generated NOT
	 */
	Object crearObjeto(String tipoObjeto);

} // Factory
