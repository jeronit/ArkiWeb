/**
 */
package ArkiWeb.vista.struts2mvc.modelo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ArkiWeb.vista.struts2mvc.modelo.ModeloPackage
 * @generated
 */
public interface ModeloFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModeloFactory eINSTANCE = ArkiWeb.vista.struts2mvc.modelo.impl.ModeloFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Login Action Support</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Login Action Support</em>'.
	 * @generated
	 */
	LoginActionSupport createLoginActionSupport();

	/**
	 * Returns a new object of class '<em>Alta Usuario Action Support</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alta Usuario Action Support</em>'.
	 * @generated
	 */
	AltaUsuarioActionSupport createAltaUsuarioActionSupport();

	/**
	 * Returns a new object of class '<em>Portal Cliente Action Support</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Portal Cliente Action Support</em>'.
	 * @generated
	 */
	PortalClienteActionSupport createPortalClienteActionSupport();

	/**
	 * Returns a new object of class '<em>Portal Administrador Action Support</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Portal Administrador Action Support</em>'.
	 * @generated
	 */
	PortalAdministradorActionSupport createPortalAdministradorActionSupport();

	/**
	 * Returns a new object of class '<em>Portal Arquitecto Action Support</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Portal Arquitecto Action Support</em>'.
	 * @generated
	 */
	PortalArquitectoActionSupport createPortalArquitectoActionSupport();

	/**
	 * Returns a new object of class '<em>Editar Usuario Action Support</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Editar Usuario Action Support</em>'.
	 * @generated
	 */
	EditarUsuarioActionSupport createEditarUsuarioActionSupport();

	/**
	 * Returns a new object of class '<em>Editar Permiso Action Support</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Editar Permiso Action Support</em>'.
	 * @generated
	 */
	EditarPermisoActionSupport createEditarPermisoActionSupport();

	/**
	 * Returns a new object of class '<em>Editar Certificado Action Support</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Editar Certificado Action Support</em>'.
	 * @generated
	 */
	EditarCertificadoActionSupport createEditarCertificadoActionSupport();

	/**
	 * Returns a new object of class '<em>Editar Proyecto Action Support</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Editar Proyecto Action Support</em>'.
	 * @generated
	 */
	EditarProyectoActionSupport createEditarProyectoActionSupport();

	/**
	 * Returns a new object of class '<em>Editar Ejecucion Proyecto Action Support</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Editar Ejecucion Proyecto Action Support</em>'.
	 * @generated
	 */
	EditarEjecucionProyectoActionSupport createEditarEjecucionProyectoActionSupport();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModeloPackage getModeloPackage();

} //ModeloFactory
