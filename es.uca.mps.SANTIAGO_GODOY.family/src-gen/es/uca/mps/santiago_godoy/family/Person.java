/**
 */
package es.uca.mps.santiago_godoy.family;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uca.mps.santiago_godoy.family.Person#getName <em>Name</em>}</li>
 *   <li>{@link es.uca.mps.santiago_godoy.family.Person#getFather <em>Father</em>}</li>
 *   <li>{@link es.uca.mps.santiago_godoy.family.Person#getMother <em>Mother</em>}</li>
 *   <li>{@link es.uca.mps.santiago_godoy.family.Person#getFechaNacimiento <em>Fecha Nacimiento</em>}</li>
 *   <li>{@link es.uca.mps.santiago_godoy.family.Person#getECivil <em>ECivil</em>}</li>
 *   <li>{@link es.uca.mps.santiago_godoy.family.Person#getProvincia <em>Provincia</em>}</li>
 * </ul>
 *
 * @see es.uca.mps.santiago_godoy.family.FamilyPackage#getPerson()
 * @model abstract="true"
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.uca.mps.santiago_godoy.family.FamilyPackage#getPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uca.mps.santiago_godoy.family.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Father</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Father</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Father</em>' reference.
	 * @see #setFather(Man)
	 * @see es.uca.mps.santiago_godoy.family.FamilyPackage#getPerson_Father()
	 * @model
	 * @generated
	 */
	Man getFather();

	/**
	 * Sets the value of the '{@link es.uca.mps.santiago_godoy.family.Person#getFather <em>Father</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Father</em>' reference.
	 * @see #getFather()
	 * @generated
	 */
	void setFather(Man value);

	/**
	 * Returns the value of the '<em><b>Mother</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mother</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mother</em>' reference.
	 * @see #setMother(Woman)
	 * @see es.uca.mps.santiago_godoy.family.FamilyPackage#getPerson_Mother()
	 * @model
	 * @generated
	 */
	Woman getMother();

	/**
	 * Sets the value of the '{@link es.uca.mps.santiago_godoy.family.Person#getMother <em>Mother</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mother</em>' reference.
	 * @see #getMother()
	 * @generated
	 */
	void setMother(Woman value);

	/**
	 * Returns the value of the '<em><b>Fecha Nacimiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha Nacimiento</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Nacimiento</em>' attribute.
	 * @see #setFechaNacimiento(String)
	 * @see es.uca.mps.santiago_godoy.family.FamilyPackage#getPerson_FechaNacimiento()
	 * @model
	 * @generated
	 */
	String getFechaNacimiento();

	/**
	 * Sets the value of the '{@link es.uca.mps.santiago_godoy.family.Person#getFechaNacimiento <em>Fecha Nacimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Nacimiento</em>' attribute.
	 * @see #getFechaNacimiento()
	 * @generated
	 */
	void setFechaNacimiento(String value);

	/**
	 * Returns the value of the '<em><b>ECivil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ECivil</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ECivil</em>' attribute.
	 * @see #setECivil(String)
	 * @see es.uca.mps.santiago_godoy.family.FamilyPackage#getPerson_ECivil()
	 * @model
	 * @generated
	 */
	String getECivil();

	/**
	 * Sets the value of the '{@link es.uca.mps.santiago_godoy.family.Person#getECivil <em>ECivil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ECivil</em>' attribute.
	 * @see #getECivil()
	 * @generated
	 */
	void setECivil(String value);

	/**
	 * Returns the value of the '<em><b>Provincia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provincia</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provincia</em>' attribute.
	 * @see #setProvincia(String)
	 * @see es.uca.mps.santiago_godoy.family.FamilyPackage#getPerson_Provincia()
	 * @model
	 * @generated
	 */
	String getProvincia();

	/**
	 * Sets the value of the '{@link es.uca.mps.santiago_godoy.family.Person#getProvincia <em>Provincia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provincia</em>' attribute.
	 * @see #getProvincia()
	 * @generated
	 */
	void setProvincia(String value);

} // Person
