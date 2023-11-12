/**
 */
package org.rm2pt.sample.basicclass.metamodel.basicclass.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.rm2pt.sample.basicclass.metamodel.basicclass.BasicclassPackage;
import org.rm2pt.sample.basicclass.metamodel.basicclass.Person;
import org.rm2pt.sample.basicclass.metamodel.basicclass.Student;
import org.rm2pt.sample.basicclass.metamodel.basicclass.Teacher;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.sample.basicclass.metamodel.basicclass.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.rm2pt.sample.basicclass.metamodel.basicclass.impl.PersonImpl#getStudents <em>Students</em>}</li>
 *   <li>{@link org.rm2pt.sample.basicclass.metamodel.basicclass.impl.PersonImpl#getTeachers <em>Teachers</em>}</li>
 *   <li>{@link org.rm2pt.sample.basicclass.metamodel.basicclass.impl.PersonImpl#getTeacher <em>Teacher</em>}</li>
 *   <li>{@link org.rm2pt.sample.basicclass.metamodel.basicclass.impl.PersonImpl#getStudent <em>Student</em>}</li>
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
	 * The cached value of the '{@link #getStudents() <em>Students</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudents()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> students;

	/**
	 * The cached value of the '{@link #getTeachers() <em>Teachers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeachers()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> teachers;

	/**
	 * The cached value of the '{@link #getTeacher() <em>Teacher</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeacher()
	 * @generated
	 * @ordered
	 */
	protected EList<Teacher> teacher;

	/**
	 * The cached value of the '{@link #getStudent() <em>Student</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudent()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> student;

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
		return BasicclassPackage.Literals.PERSON;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasicclassPackage.PERSON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getStudents() {
		if (students == null) {
			students = new EObjectWithInverseResolvingEList.ManyInverse<Person>(Person.class, this,
					BasicclassPackage.PERSON__STUDENTS, BasicclassPackage.PERSON__TEACHERS);
		}
		return students;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getTeachers() {
		if (teachers == null) {
			teachers = new EObjectWithInverseResolvingEList.ManyInverse<Person>(Person.class, this,
					BasicclassPackage.PERSON__TEACHERS, BasicclassPackage.PERSON__STUDENTS);
		}
		return teachers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Teacher> getTeacher() {
		if (teacher == null) {
			teacher = new EObjectResolvingEList<Teacher>(Teacher.class, this, BasicclassPackage.PERSON__TEACHER);
		}
		return teacher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Student> getStudent() {
		if (student == null) {
			student = new EObjectResolvingEList<Student>(Student.class, this, BasicclassPackage.PERSON__STUDENT);
		}
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BasicclassPackage.PERSON__STUDENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getStudents()).basicAdd(otherEnd, msgs);
		case BasicclassPackage.PERSON__TEACHERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTeachers()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BasicclassPackage.PERSON__STUDENTS:
			return ((InternalEList<?>) getStudents()).basicRemove(otherEnd, msgs);
		case BasicclassPackage.PERSON__TEACHERS:
			return ((InternalEList<?>) getTeachers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BasicclassPackage.PERSON__NAME:
			return getName();
		case BasicclassPackage.PERSON__STUDENTS:
			return getStudents();
		case BasicclassPackage.PERSON__TEACHERS:
			return getTeachers();
		case BasicclassPackage.PERSON__TEACHER:
			return getTeacher();
		case BasicclassPackage.PERSON__STUDENT:
			return getStudent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BasicclassPackage.PERSON__NAME:
			setName((String) newValue);
			return;
		case BasicclassPackage.PERSON__STUDENTS:
			getStudents().clear();
			getStudents().addAll((Collection<? extends Person>) newValue);
			return;
		case BasicclassPackage.PERSON__TEACHERS:
			getTeachers().clear();
			getTeachers().addAll((Collection<? extends Person>) newValue);
			return;
		case BasicclassPackage.PERSON__TEACHER:
			getTeacher().clear();
			getTeacher().addAll((Collection<? extends Teacher>) newValue);
			return;
		case BasicclassPackage.PERSON__STUDENT:
			getStudent().clear();
			getStudent().addAll((Collection<? extends Student>) newValue);
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
		case BasicclassPackage.PERSON__NAME:
			setName(NAME_EDEFAULT);
			return;
		case BasicclassPackage.PERSON__STUDENTS:
			getStudents().clear();
			return;
		case BasicclassPackage.PERSON__TEACHERS:
			getTeachers().clear();
			return;
		case BasicclassPackage.PERSON__TEACHER:
			getTeacher().clear();
			return;
		case BasicclassPackage.PERSON__STUDENT:
			getStudent().clear();
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
		case BasicclassPackage.PERSON__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case BasicclassPackage.PERSON__STUDENTS:
			return students != null && !students.isEmpty();
		case BasicclassPackage.PERSON__TEACHERS:
			return teachers != null && !teachers.isEmpty();
		case BasicclassPackage.PERSON__TEACHER:
			return teacher != null && !teacher.isEmpty();
		case BasicclassPackage.PERSON__STUDENT:
			return student != null && !student.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
