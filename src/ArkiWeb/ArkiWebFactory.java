/**
 */
package ArkiWeb;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ArkiWeb.ArkiWebPackage
 * @generated
 */
public interface ArkiWebFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArkiWebFactory eINSTANCE = ArkiWeb.impl.ArkiWebFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>List String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List String</em>'.
	 * @generated
	 */
	ListString createListString();

	/**
	 * Returns a new object of class '<em>List Usuario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Usuario</em>'.
	 * @generated
	 */
	ListUsuario createListUsuario();

	/**
	 * Returns a new object of class '<em>List Permiso</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Permiso</em>'.
	 * @generated
	 */
	ListPermiso createListPermiso();

	/**
	 * Returns a new object of class '<em>List Proyecto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Proyecto</em>'.
	 * @generated
	 */
	ListProyecto createListProyecto();

	/**
	 * Returns a new object of class '<em>List Certificado</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Certificado</em>'.
	 * @generated
	 */
	ListCertificado createListCertificado();

	/**
	 * Returns a new object of class '<em>List Vivienda</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Vivienda</em>'.
	 * @generated
	 */
	ListVivienda createListVivienda();

	/**
	 * Returns a new object of class '<em>List Inmueble</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Inmueble</em>'.
	 * @generated
	 */
	ListInmueble createListInmueble();

	/**
	 * Returns a new object of class '<em>List Certificados Asignados</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Certificados Asignados</em>'.
	 * @generated
	 */
	ListCertificados_Asignados createListCertificados_Asignados();

	/**
	 * Returns a new object of class '<em>List Proyectos Asignados</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Proyectos Asignados</em>'.
	 * @generated
	 */
	ListProyectos_Asignados createListProyectos_Asignados();

	/**
	 * Returns a new object of class '<em>List Proyectos En Ejecucion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Proyectos En Ejecucion</em>'.
	 * @generated
	 */
	ListProyectos_En_Ejecucion createListProyectos_En_Ejecucion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ArkiWebPackage getArkiWebPackage();

} //ArkiWebFactory
