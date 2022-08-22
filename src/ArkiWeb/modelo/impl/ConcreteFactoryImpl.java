/**
 * 	@purpose:	Implementación de la Interface ConcreteFactory
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.modelo.impl;

import ArkiWeb.modelo.ConcreteFactory;
import ArkiWeb.modelo.ModeloPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ConcreteFactoryImpl extends FactoryImpl implements ConcreteFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcreteFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloPackage.Literals.CONCRETE_FACTORY;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Se encarga de la instanciación de los distintos objetos
	 * <!-- end-user-doc -->
	 * @param			tipoObjeto			String			Objeto a crear
	 * @model tipoObjetoDataType="org.eclipse.uml2.types.String" tipoObjetoRequired="true" tipoObjetoOrdered="false"
	 */
	@Override
	public Object crearObjeto(String tipoObjeto) {
		
		Object newObject = null;
		
		// Instanciando objeto
		switch (tipoObjeto) {
		case "Certificado":
			newObject = new CertificadoImpl();
			break;
		case "Certificados_Asignados":
			newObject = new Certificados_AsignadosImpl();
			break;
		case "HSQLDB":
			newObject = HSQLDBImpl.getInstance();
			break;
		case "Inmueble":
			newObject = new InmuebleImpl();
			break;
		case "Permiso":
			newObject = new PermisoImpl();
			break;
		case "Proyecto":
			newObject = new ProyectoImpl();
			break;
		case "Proyectos_Asignados":
			newObject = new Proyectos_AsignadosImpl();
			break;
		case "Proyectos_En_Ejecucion":
			newObject = new Proyectos_En_EjecucionImpl();
			break;
		case "Rol":
			newObject = new RolImpl();
			break;
		case "Usuario":
			newObject = new UsuarioImpl();
			break;
		case "Vivienda":
			newObject = new ViviendaImpl();
			break;
		}
		return newObject;
	}

} //ConcreteFactoryImpl
