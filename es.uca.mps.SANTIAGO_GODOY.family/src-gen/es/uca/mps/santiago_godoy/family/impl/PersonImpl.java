/**
 */
package es.uca.mps.santiago_godoy.family.impl;

import es.uca.mps.santiago_godoy.family.FamilyPackage;
import es.uca.mps.santiago_godoy.family.Man;
import es.uca.mps.santiago_godoy.family.Person;
import es.uca.mps.santiago_godoy.family.Woman;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uca.mps.santiago_godoy.family.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uca.mps.santiago_godoy.family.impl.PersonImpl#getFather <em>Father</em>}</li>
 *   <li>{@link es.uca.mps.santiago_godoy.family.impl.PersonImpl#getMother <em>Mother</em>}</li>
 *   <li>{@link es.uca.mps.santiago_godoy.family.impl.PersonImpl#getFechaNacimiento <em>Fecha Nacimiento</em>}</li>
 *   <li>{@link es.uca.mps.santiago_godoy.family.impl.PersonImpl#getECivil <em>ECivil</em>}</li>
 *   <li>{@link es.uca.mps.santiago_godoy.family.impl.PersonImpl#getProvincia <em>Provincia</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PersonImpl extends MinimalEObjectImpl.Container implements Person {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFather() <em>Father</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFather()
	 * @generated
	 * @ordered
	 */
	protected Man father;

	/**
	 * The cached value of the '{@link #getMother() <em>Mother</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMother()
	 * @generated
	 * @ordered
	 */
	protected Woman mother;

	/**
	 * The default value of the '{@link #getFechaNacimiento() <em>Fecha Nacimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaNacimiento()
	 * @generated
	 * @ordered
	 */
	protected static final String FECHA_NACIMIENTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaNacimiento() <em>Fecha Nacimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaNacimiento()
	 * @generated
	 * @ordered
	 */
	protected String fechaNacimiento = FECHA_NACIMIENTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getECivil() <em>ECivil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getECivil()
	 * @generated
	 * @ordered
	 */
	protected static final String ECIVIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getECivil() <em>ECivil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getECivil()
	 * @generated
	 * @ordered
	 */
	protected String eCivil = ECIVIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getProvincia() <em>Provincia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvincia()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVINCIA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProvincia() <em>Provincia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvincia()
	 * @generated
	 * @ordered
	 */
	protected String provincia = PROVINCIA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FamilyPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilyPackage.PERSON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Man getFather() {
		if (father != null && father.eIsProxy()) {
			InternalEObject oldFather = (InternalEObject) father;
			father = (Man) eResolveProxy(oldFather);
			if (father != oldFather) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FamilyPackage.PERSON__FATHER, oldFather,
							father));
			}
		}
		return father;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Man basicGetFather() {
		return father;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFather(Man newFather) {
		Man oldFather = father;
		father = newFather;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilyPackage.PERSON__FATHER, oldFather, father));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Woman getMother() {
		if (mother != null && mother.eIsProxy()) {
			InternalEObject oldMother = (InternalEObject) mother;
			mother = (Woman) eResolveProxy(oldMother);
			if (mother != oldMother) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FamilyPackage.PERSON__MOTHER, oldMother,
							mother));
			}
		}
		return mother;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Woman basicGetMother() {
		return mother;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMother(Woman newMother) {
		Woman oldMother = mother;
		mother = newMother;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilyPackage.PERSON__MOTHER, oldMother, mother));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaNacimiento(String newFechaNacimiento) {
		String oldFechaNacimiento = fechaNacimiento;
		fechaNacimiento = newFechaNacimiento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilyPackage.PERSON__FECHA_NACIMIENTO,
					oldFechaNacimiento, fechaNacimiento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getECivil() {
		return eCivil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setECivil(String newECivil) {
		String oldECivil = eCivil;
		eCivil = newECivil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilyPackage.PERSON__ECIVIL, oldECivil, eCivil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProvincia() {
		return provincia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvincia(String newProvincia) {
		String oldProvincia = provincia;
		provincia = newProvincia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilyPackage.PERSON__PROVINCIA, oldProvincia,
					provincia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FamilyPackage.PERSON__NAME:
			return getName();
		case FamilyPackage.PERSON__FATHER:
			if (resolve)
				return getFather();
			return basicGetFather();
		case FamilyPackage.PERSON__MOTHER:
			if (resolve)
				return getMother();
			return basicGetMother();
		case FamilyPackage.PERSON__FECHA_NACIMIENTO:
			return getFechaNacimiento();
		case FamilyPackage.PERSON__ECIVIL:
			return getECivil();
		case FamilyPackage.PERSON__PROVINCIA:
			return getProvincia();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FamilyPackage.PERSON__NAME:
			setName((String) newValue);
			return;
		case FamilyPackage.PERSON__FATHER:
			setFather((Man) newValue);
			return;
		case FamilyPackage.PERSON__MOTHER:
			setMother((Woman) newValue);
			return;
		case FamilyPackage.PERSON__FECHA_NACIMIENTO:
			setFechaNacimiento((String) newValue);
			return;
		case FamilyPackage.PERSON__ECIVIL:
			setECivil((String) newValue);
			return;
		case FamilyPackage.PERSON__PROVINCIA:
			setProvincia((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case FamilyPackage.PERSON__NAME:
			setName(NAME_EDEFAULT);
			return;
		case FamilyPackage.PERSON__FATHER:
			setFather((Man) null);
			return;
		case FamilyPackage.PERSON__MOTHER:
			setMother((Woman) null);
			return;
		case FamilyPackage.PERSON__FECHA_NACIMIENTO:
			setFechaNacimiento(FECHA_NACIMIENTO_EDEFAULT);
			return;
		case FamilyPackage.PERSON__ECIVIL:
			setECivil(ECIVIL_EDEFAULT);
			return;
		case FamilyPackage.PERSON__PROVINCIA:
			setProvincia(PROVINCIA_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case FamilyPackage.PERSON__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case FamilyPackage.PERSON__FATHER:
			return father != null;
		case FamilyPackage.PERSON__MOTHER:
			return mother != null;
		case FamilyPackage.PERSON__FECHA_NACIMIENTO:
			return FECHA_NACIMIENTO_EDEFAULT == null ? fechaNacimiento != null
					: !FECHA_NACIMIENTO_EDEFAULT.equals(fechaNacimiento);
		case FamilyPackage.PERSON__ECIVIL:
			return ECIVIL_EDEFAULT == null ? eCivil != null : !ECIVIL_EDEFAULT.equals(eCivil);
		case FamilyPackage.PERSON__PROVINCIA:
			return PROVINCIA_EDEFAULT == null ? provincia != null : !PROVINCIA_EDEFAULT.equals(provincia);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", fechaNacimiento: ");
		result.append(fechaNacimiento);
		result.append(", eCivil: ");
		result.append(eCivil);
		result.append(", provincia: ");
		result.append(provincia);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
