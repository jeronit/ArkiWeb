/**
 * 	@purpose:	
 *  @author:	Jero Torralba
 *  @version:	1.0
 *	@date:		2022/08/17
 */
package ArkiWeb.modelo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tipo Proyecto</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ArkiWeb.modelo.ModeloPackage#getTipo_Proyecto()
 * @model
 * @generated
 */
public enum Tipo_Proyecto implements Enumerator {
	/**
	 * The '<em><b>Residencial Edificio</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESIDENCIAL_EDIFICIO_VALUE
	 * @generated
	 * @ordered
	 */
	RESIDENCIAL_EDIFICIO(0, "Residencial_Edificio", "Residencial_Edificio"),

	/**
	 * The '<em><b>Residencial Vivienda</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESIDENCIAL_VIVIENDA_VALUE
	 * @generated
	 * @ordered
	 */
	RESIDENCIAL_VIVIENDA(1, "Residencial_Vivienda", "Residencial_Vivienda"),

	/**
	 * The '<em><b>No Residencial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_RESIDENCIAL_VALUE
	 * @generated
	 * @ordered
	 */
	NO_RESIDENCIAL(2, "No_Residencial", "No_Residencial"),

	/**
	 * The '<em><b>Rehabilitacion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REHABILITACION_VALUE
	 * @generated
	 * @ordered
	 */
	REHABILITACION(3, "Rehabilitacion", "Rehabilitacion");

	/**
	 * The '<em><b>Residencial Edificio</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESIDENCIAL_EDIFICIO
	 * @model name="Residencial_Edificio"
	 * @generated
	 * @ordered
	 */
	public static final int RESIDENCIAL_EDIFICIO_VALUE = 0;

	/**
	 * The '<em><b>Residencial Vivienda</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESIDENCIAL_VIVIENDA
	 * @model name="Residencial_Vivienda"
	 * @generated
	 * @ordered
	 */
	public static final int RESIDENCIAL_VIVIENDA_VALUE = 1;

	/**
	 * The '<em><b>No Residencial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_RESIDENCIAL
	 * @model name="No_Residencial"
	 * @generated
	 * @ordered
	 */
	public static final int NO_RESIDENCIAL_VALUE = 2;

	/**
	 * The '<em><b>Rehabilitacion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REHABILITACION
	 * @model name="Rehabilitacion"
	 * @generated
	 * @ordered
	 */
	public static final int REHABILITACION_VALUE = 3;

	/**
	 * An array of all the '<em><b>Tipo Proyecto</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Tipo_Proyecto[] VALUES_ARRAY =
		new Tipo_Proyecto[] {
			RESIDENCIAL_EDIFICIO,
			RESIDENCIAL_VIVIENDA,
			NO_RESIDENCIAL,
			REHABILITACION,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo Proyecto</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Tipo_Proyecto> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Proyecto</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Tipo_Proyecto get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Tipo_Proyecto result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Proyecto</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Tipo_Proyecto getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Tipo_Proyecto result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Proyecto</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Tipo_Proyecto get(int value) {
		switch (value) {
			case RESIDENCIAL_EDIFICIO_VALUE: return RESIDENCIAL_EDIFICIO;
			case RESIDENCIAL_VIVIENDA_VALUE: return RESIDENCIAL_VIVIENDA;
			case NO_RESIDENCIAL_VALUE: return NO_RESIDENCIAL;
			case REHABILITACION_VALUE: return REHABILITACION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Tipo_Proyecto(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Tipo_Proyecto
