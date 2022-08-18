/**
 * 	@purpose:	
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
	 * @model
	 * @generated
	 */
	void crearObjeto();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tipoObjetoDataType="org.eclipse.uml2.types.String" tipoObjetoRequired="true" tipoObjetoOrdered="false"
	 * @generated
	 */
	void crearObjeto(String tipoObjeto);

} // Factory
