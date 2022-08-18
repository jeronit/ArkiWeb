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
 * A representation of the literals of the enumeration '<em><b>Tipo Certificado</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ArkiWeb.modelo.ModeloPackage#getTipo_Certificado()
 * @model
 * @generated
 */
public enum Tipo_Certificado implements Enumerator {
	/**
	 * The '<em><b>Habitabilidad</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HABITABILIDAD_VALUE
	 * @generated
	 * @ordered
	 */
	HABITABILIDAD(0, "Habitabilidad", "Habitabilidad"),

	/**
	 * The '<em><b>ITE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITE_VALUE
	 * @generated
	 * @ordered
	 */
	ITE(1, "ITE", "ITE"),

	/**
	 * The '<em><b>Efic Energ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EFIC_ENERG_VALUE
	 * @generated
	 * @ordered
	 */
	EFIC_ENERG(2, "Efic_Energ", "Efic_Energ"),

	/**
	 * The '<em><b>Pericial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERICIAL_VALUE
	 * @generated
	 * @ordered
	 */
	PERICIAL(3, "Pericial", "Pericial");

	/**
	 * The '<em><b>Habitabilidad</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HABITABILIDAD
	 * @model name="Habitabilidad"
	 * @generated
	 * @ordered
	 */
	public static final int HABITABILIDAD_VALUE = 0;

	/**
	 * The '<em><b>ITE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ITE_VALUE = 1;

	/**
	 * The '<em><b>Efic Energ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EFIC_ENERG
	 * @model name="Efic_Energ"
	 * @generated
	 * @ordered
	 */
	public static final int EFIC_ENERG_VALUE = 2;

	/**
	 * The '<em><b>Pericial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERICIAL
	 * @model name="Pericial"
	 * @generated
	 * @ordered
	 */
	public static final int PERICIAL_VALUE = 3;

	/**
	 * An array of all the '<em><b>Tipo Certificado</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Tipo_Certificado[] VALUES_ARRAY =
		new Tipo_Certificado[] {
			HABITABILIDAD,
			ITE,
			EFIC_ENERG,
			PERICIAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo Certificado</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Tipo_Certificado> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Certificado</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Tipo_Certificado get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Tipo_Certificado result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Certificado</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Tipo_Certificado getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Tipo_Certificado result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Certificado</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Tipo_Certificado get(int value) {
		switch (value) {
			case HABITABILIDAD_VALUE: return HABITABILIDAD;
			case ITE_VALUE: return ITE;
			case EFIC_ENERG_VALUE: return EFIC_ENERG;
			case PERICIAL_VALUE: return PERICIAL;
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
	private Tipo_Certificado(int value, String name, String literal) {
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
	
} //Tipo_Certificado
