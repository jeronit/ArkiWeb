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
 * A representation of the literals of the enumeration '<em><b>Categoria Certificado</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ArkiWeb.modelo.ModeloPackage#getCategoria_Certificado()
 * @model
 * @generated
 */
public enum Categoria_Certificado implements Enumerator {
	/**
	 * The '<em><b>A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #A_VALUE
	 * @generated
	 * @ordered
	 */
	A(0, "A", "A"),

	/**
	 * The '<em><b>B</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #B_VALUE
	 * @generated
	 * @ordered
	 */
	B(1, "B", "B"),

	/**
	 * The '<em><b>C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C_VALUE
	 * @generated
	 * @ordered
	 */
	C(2, "C", "C"),

	/**
	 * The '<em><b>D</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #D_VALUE
	 * @generated
	 * @ordered
	 */
	D(3, "D", "D"),

	/**
	 * The '<em><b>E</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E_VALUE
	 * @generated
	 * @ordered
	 */
	E(4, "E", "E"),

	/**
	 * The '<em><b>F</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F_VALUE
	 * @generated
	 * @ordered
	 */
	F(5, "F", "F"),

	/**
	 * The '<em><b>G</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #G_VALUE
	 * @generated
	 * @ordered
	 */
	G(6, "G", "G");

	/**
	 * The '<em><b>A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #A
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int A_VALUE = 0;

	/**
	 * The '<em><b>B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #B
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int B_VALUE = 1;

	/**
	 * The '<em><b>C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int C_VALUE = 2;

	/**
	 * The '<em><b>D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #D
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int D_VALUE = 3;

	/**
	 * The '<em><b>E</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int E_VALUE = 4;

	/**
	 * The '<em><b>F</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F_VALUE = 5;

	/**
	 * The '<em><b>G</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #G
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int G_VALUE = 6;

	/**
	 * An array of all the '<em><b>Categoria Certificado</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Categoria_Certificado[] VALUES_ARRAY =
		new Categoria_Certificado[] {
			A,
			B,
			C,
			D,
			E,
			F,
			G,
		};

	/**
	 * A public read-only list of all the '<em><b>Categoria Certificado</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Categoria_Certificado> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Categoria Certificado</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Categoria_Certificado get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Categoria_Certificado result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Categoria Certificado</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Categoria_Certificado getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Categoria_Certificado result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Categoria Certificado</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Categoria_Certificado get(int value) {
		switch (value) {
			case A_VALUE: return A;
			case B_VALUE: return B;
			case C_VALUE: return C;
			case D_VALUE: return D;
			case E_VALUE: return E;
			case F_VALUE: return F;
			case G_VALUE: return G;
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
	private Categoria_Certificado(int value, String name, String literal) {
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
	
} //Categoria_Certificado
