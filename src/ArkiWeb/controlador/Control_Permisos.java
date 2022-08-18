/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.controlador;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Permisos</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ArkiWeb.controlador.ControladorPackage#getControl_Permisos()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Control_Permisos extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void concederAcceso();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model descripcion_permisoDataType="org.eclipse.uml2.types.String" descripcion_permisoRequired="true" descripcion_permisoOrdered="false" objeto_permisoDataType="org.eclipse.uml2.types.String" objeto_permisoRequired="true" objeto_permisoOrdered="false" lectura_permisoDataType="org.eclipse.uml2.types.Boolean" lectura_permisoRequired="true" lectura_permisoOrdered="false" escritura_permisoDataType="org.eclipse.uml2.types.Boolean" escritura_permisoRequired="true" escritura_permisoOrdered="false"
	 * @generated
	 */
	void crearPermiso(String descripcion_permiso, String objeto_permiso, boolean lectura_permiso, boolean escritura_permiso);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model id_permisoDataType="org.eclipse.uml2.types.Integer" id_permisoRequired="true" id_permisoOrdered="false" descripcion_permisoDataType="org.eclipse.uml2.types.String" descripcion_permisoRequired="true" descripcion_permisoOrdered="false" objeto_permisoDataType="org.eclipse.uml2.types.String" objeto_permisoRequired="true" objeto_permisoOrdered="false" lectura_permisoDataType="org.eclipse.uml2.types.Boolean" lectura_permisoRequired="true" lectura_permisoOrdered="false" escritura_permisoDataType="org.eclipse.uml2.types.Boolean" escritura_permisoRequired="true" escritura_permisoOrdered="false"
	 * @generated
	 */
	void editarPermiso(int id_permiso, String descripcion_permiso, String objeto_permiso, boolean lectura_permiso, boolean escritura_permiso);

} // Control_Permisos
